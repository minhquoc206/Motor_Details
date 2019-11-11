package com.example.listviewdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;

import com.example.listviewdemo.schemes.UserResult;
import com.example.listviewdemo.webservice.WebService;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private ListView listView;

    private EditText etPage;

    private ArrayList<Person> people;

    PersonAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etPage = findViewById(R.id.etPage);
        listView = findViewById(R.id.list_view);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Intent intent = new Intent(MainActivity.this, Login.class);
                Person person = people.get(position);
                Bundle bundle = new Bundle();
                bundle.putString("name", person.getName());
                bundle.putString("gender", person.getGender());
                bundle.putInt("avatar", person.getAvatar());
//                intent.putExtras(bundle);
//                startActivity(intent);
            }
        });
        getUsers(2);
    }

    private void getUsers(int page) {
        WebService.getInstance().getGorestService().getUsers(page)
                .enqueue(new Callback<UserResult>() {
                    @Override
                    public void onResponse(Call<UserResult> call, Response<UserResult> response) {
                        if (adapter == null) {
                            adapter = new PersonAdapter(MainActivity.this, response.body().getResult());
                            listView.setAdapter(adapter);
                        } else {
                            adapter.setData(response.body().getResult());
                        }
                    }

                    @Override
                    public void onFailure(Call<UserResult> call, Throwable t) {

                    }
                });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_add:
                Intent intent = new Intent(this, CreateUserActivity.class);
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public void onChonButtonClick(View view) {
        getUsers(Integer.parseInt(etPage.getText().toString()));
    }
}
