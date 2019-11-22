package com.example.listviewdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.listviewdemo.fragment.Fragment_Agusta;
import com.example.listviewdemo.fragment.Fragment_Aprilia;
import com.example.listviewdemo.fragment.Fragment_BMW;
import com.example.listviewdemo.fragment.Fragment_Benelli;
import com.example.listviewdemo.fragment.Fragment_Ducati;
import com.example.listviewdemo.fragment.Fragment_GPX;
import com.example.listviewdemo.fragment.Fragment_Guzzi;
import com.example.listviewdemo.fragment.Fragment_Harley;
import com.example.listviewdemo.fragment.Fragment_Honda;
import com.example.listviewdemo.fragment.Fragment_KTM;
import com.example.listviewdemo.fragment.Fragment_Kawasaki;
import com.example.listviewdemo.fragment.Fragment_KymCo;
import com.example.listviewdemo.fragment.Fragment_Piaggio;
import com.example.listviewdemo.fragment.Fragment_RoyalEnField;
import com.example.listviewdemo.fragment.Fragment_Suzuki;
import com.example.listviewdemo.fragment.Fragment_Sym;
import com.example.listviewdemo.fragment.Fragment_Triumph;
import com.example.listviewdemo.fragment.Fragment_Yamaha;

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
    private Button buttonAprilia;
    private Button buttonmvagusta;
    private Button buttonRoyalEnField;
    private Button buttonGPX;
    private Button buttonMotoguzzi;




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
        buttonAprilia = findViewById(R.id.buttonaprilia);
        buttonmvagusta = findViewById(R.id.mvagusta);
        buttonRoyalEnField = findViewById(R.id.royalenfield);
        buttonGPX = findViewById(R.id.gpx);
        buttonMotoguzzi = findViewById(R.id.motoguzzi);






        buttonSuzuki.setOnClickListener(new View.OnClickListener()   {
            @Override
            public void onClick(View view)  {
                Intent intent = new Intent(CreateUserActivity.this, Fragment_Suzuki.class);
                startActivity(intent);
            }
        });

        buttonHonda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CreateUserActivity.this, Fragment_Honda.class);
                startActivity(intent);

            }
        });
        buttonSym.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CreateUserActivity.this, Fragment_Sym.class);
                startActivity(intent);

            }
        });
        buttonKawasaki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CreateUserActivity.this, Fragment_Kawasaki.class);
                startActivity(intent);

            }
        });
        buttonPiaggio.setOnClickListener(new View.OnClickListener()   {
            @Override
            public void onClick(View view)  {
                Intent intent = new Intent(CreateUserActivity.this, Fragment_Piaggio.class);
                startActivity(intent);
            }
        });
        buttonDucati.setOnClickListener(new View.OnClickListener()   {
            @Override
            public void onClick(View view)  {
                Intent intent = new Intent(CreateUserActivity.this, Fragment_Ducati.class);
                startActivity(intent);
            }
        });
        buttonYamaha.setOnClickListener(new View.OnClickListener()   {
            @Override
            public void onClick(View view)  {
                Intent intent = new Intent(CreateUserActivity.this, Fragment_Yamaha.class);
                startActivity(intent);
            }
        });
        buttonTriumph.setOnClickListener(new View.OnClickListener()   {
            @Override
            public void onClick(View view)  {
                Intent intent = new Intent(CreateUserActivity.this, Fragment_Triumph.class);
                startActivity(intent);
            }
        });
        buttonKymCo.setOnClickListener(new View.OnClickListener()   {
            @Override
            public void onClick(View view)  {
                Intent intent = new Intent(CreateUserActivity.this, Fragment_KymCo.class);
                startActivity(intent);
            }
        });
        buttonKtm.setOnClickListener(new View.OnClickListener()   {
            @Override
            public void onClick(View view)  {
                Intent intent = new Intent(CreateUserActivity.this, Fragment_KTM.class);
                startActivity(intent);
            }
        });
        buttonBenelli.setOnClickListener(new View.OnClickListener()   {
            @Override
            public void onClick(View view)  {
                Intent intent = new Intent(CreateUserActivity.this, Fragment_Benelli.class);
                startActivity(intent);
            }
        });
        buttonBmw.setOnClickListener(new View.OnClickListener()   {
            @Override
            public void onClick(View view)  {
                Intent intent = new Intent(CreateUserActivity.this, Fragment_BMW.class);
                startActivity(intent);
            }
        });
        buttonHarley.setOnClickListener(new View.OnClickListener()   {
            @Override
            public void onClick(View view)  {
                Intent intent = new Intent(CreateUserActivity.this, Fragment_Harley.class);
                startActivity(intent);
            }
        });
        buttonAprilia.setOnClickListener(new View.OnClickListener()   {
            @Override
            public void onClick(View view)  {
                Intent intent = new Intent(CreateUserActivity.this, Fragment_Aprilia.class);
                startActivity(intent);
            }
        });
        buttonmvagusta.setOnClickListener(new View.OnClickListener()   {
            @Override
            public void onClick(View view)  {
                Intent intent = new Intent(CreateUserActivity.this, Fragment_Agusta.class);
                startActivity(intent);
            }
        });
        buttonMotoguzzi.setOnClickListener(new View.OnClickListener()   {
            @Override
            public void onClick(View view)  {
                Intent intent = new Intent(CreateUserActivity.this, Fragment_Guzzi.class);
                startActivity(intent);
            }
        });
        buttonGPX.setOnClickListener(new View.OnClickListener()   {
            @Override
            public void onClick(View view)  {
                Intent intent = new Intent(CreateUserActivity.this, Fragment_GPX.class);
                startActivity(intent);
            }
        });
        buttonRoyalEnField.setOnClickListener(new View.OnClickListener()   {
            @Override
            public void onClick(View view)  {
                Intent intent = new Intent(CreateUserActivity.this, Fragment_RoyalEnField.class);
                startActivity(intent);
            }
        });





    }
}
