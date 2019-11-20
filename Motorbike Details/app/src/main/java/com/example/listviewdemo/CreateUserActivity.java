package com.example.listviewdemo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.listviewdemo.fragment.Fragment_Activity;
import com.example.listviewdemo.schemes.UserRequestBody;
import com.example.listviewdemo.webservice.WebService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CreateUserActivity extends AppCompatActivity {

    private Button buttonSuzuki;
    private Button buttonHonda;
    private Button buttonKawasaki;
    private Button buttonSym;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);

        buttonSuzuki = (Button) findViewById(R.id.buttonsuzuki);
        buttonKawasaki = findViewById(R.id.buttonkawasaki);
        buttonSym = findViewById(R.id.buttonsym);
        buttonHonda = findViewById(R.id.buttonhonda);

        buttonSuzuki.setOnClickListener(new View.OnClickListener()   {
            @Override
            public void onClick(View view)  {
                Intent intent = new Intent(CreateUserActivity.this, Fragment_Activity.class);
                startActivity(intent);
            }
        });

        buttonHonda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CreateUserActivity.this, Fragment_Activity.class);
                startActivity(intent);

            }
        });
        buttonSym.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CreateUserActivity.this, Fragment_Activity.class);
                startActivity(intent);

            }
        });
        buttonKawasaki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CreateUserActivity.this, Fragment_Activity.class);
                startActivity(intent);

            }
        });


    }
}
