package com.hasan.surahapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        tv1 = findViewById(R.id.tv1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                Bundle bundle = new Bundle();
                bundle.putInt("surahImage", R.drawable.fatiha);
                bundle.putString("surahName", "Surah Al-Fatiha");
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                Bundle bundle = new Bundle();
                bundle.putInt("surahImage", R.drawable.naas);
                bundle.putString("surahName", "Surah Al-Naas");
                intent.putExtras(bundle);
                startActivity(intent);




            }
        });


    }
}

