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


    private Button buttonHonda;
    private Button buttonYamaha;
    private Button buttonSuzuki;
    private Button buttonPiaggio;
    private Button buttonTriumph;
    private Button buttonDucati;
    private Button buttonSym;
    private Button buttonBmw;
    private Button buttonBenelli;
    private Button buttonKtm;
    private Button buttonKymCo;
    private Button buttonHarley;
    private Button buttonKawasaki;
    private Button buttonVinfast;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);

        buttonSuzuki = (Button) findViewById(R.id.buttonsuzuki);
        buttonKawasaki = findViewById(R.id.buttonkawasaki);
        buttonSym = findViewById(R.id.buttonsym);
        buttonHonda = findViewById(R.id.buttonhonda);
        buttonPiaggio = findViewById(R.id.buttonpiaggio);
        buttonYamaha = findViewById(R.id.buttonyamaha);
        buttonTriumph = findViewById(R.id.buttontriumph);
        buttonDucati = findViewById(R.id.buttonducati);
        buttonBmw = findViewById(R.id.buttonbmw);
        buttonBenelli = findViewById(R.id.buttonbenelli);
        buttonKtm = findViewById(R.id.buttonktm);
        buttonKymCo = findViewById(R.id.buttonkymco);
        buttonHarley = findViewById(R.id.buttonhaley);



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
        buttonPiaggio.setOnClickListener(new View.OnClickListener()   {
            @Override
            public void onClick(View view)  {
                Intent intent = new Intent(CreateUserActivity.this, Fragment_Activity.class);
                startActivity(intent);
            }
        });
        buttonDucati.setOnClickListener(new View.OnClickListener()   {
            @Override
            public void onClick(View view)  {
                Intent intent = new Intent(CreateUserActivity.this, Fragment_Activity.class);
                startActivity(intent);
            }
        });
        buttonYamaha.setOnClickListener(new View.OnClickListener()   {
            @Override
            public void onClick(View view)  {
                Intent intent = new Intent(CreateUserActivity.this, Fragment_Activity.class);
                startActivity(intent);
            }
        });
        buttonTriumph.setOnClickListener(new View.OnClickListener()   {
            @Override
            public void onClick(View view)  {
                Intent intent = new Intent(CreateUserActivity.this, Fragment_Activity.class);
                startActivity(intent);
            }
        });
        buttonKymCo.setOnClickListener(new View.OnClickListener()   {
            @Override
            public void onClick(View view)  {
                Intent intent = new Intent(CreateUserActivity.this, Fragment_Activity.class);
                startActivity(intent);
            }
        });
        buttonKtm.setOnClickListener(new View.OnClickListener()   {
            @Override
            public void onClick(View view)  {
                Intent intent = new Intent(CreateUserActivity.this, Fragment_Activity.class);
                startActivity(intent);
            }
        });
        buttonBenelli.setOnClickListener(new View.OnClickListener()   {
            @Override
            public void onClick(View view)  {
                Intent intent = new Intent(CreateUserActivity.this, Fragment_Activity.class);
                startActivity(intent);
            }
        });
        buttonBmw.setOnClickListener(new View.OnClickListener()   {
            @Override
            public void onClick(View view)  {
                Intent intent = new Intent(CreateUserActivity.this, Fragment_Activity.class);
                startActivity(intent);
            }
        });
        buttonHarley.setOnClickListener(new View.OnClickListener()   {
            @Override
            public void onClick(View view)  {
                Intent intent = new Intent(CreateUserActivity.this, Fragment_Activity.class);
                startActivity(intent);
            }
        });



    }
}
