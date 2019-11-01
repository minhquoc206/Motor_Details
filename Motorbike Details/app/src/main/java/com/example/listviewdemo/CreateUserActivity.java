package com.example.listviewdemo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.listviewdemo.schemes.UserRequestBody;
import com.example.listviewdemo.webservice.WebService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CreateUserActivity extends AppCompatActivity {

    private Button buttonsuzuki;
    private Button buttonhonda;
    private Button buttonyamaha;
    private Button buttonsym;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);

        buttonsuzuki = (Button) findViewById(R.id.buttonsuzuki);

        buttonsuzuki.setOnClickListener(new View.OnClickListener()   {
            @Override
            public void onClick(View view)  {
                Intent intent = new Intent(CreateUserActivity.this, InfoActivity.class);
                intent.setAction(Intent.ACTION_VIEW);
                startActivity(intent);
            }
        });
    }
}
