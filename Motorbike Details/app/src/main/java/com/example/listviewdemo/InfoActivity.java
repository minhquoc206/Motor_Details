package com.example.listviewdemo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.listviewdemo.fragment.Fragment_Activity;

public class InfoActivity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        imageView = (ImageView) findViewById(R.id.iv_avatar);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InfoActivity.this, Fragment_Activity.class);
                startActivity(intent);
            }
        });
//
//        imageView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(InfoActivity.this, MainActivity.class);
//                intent.setAction(Intent.ACTION_VIEW);
//                startActivity(intent);
//            }
//        });
    }
}
