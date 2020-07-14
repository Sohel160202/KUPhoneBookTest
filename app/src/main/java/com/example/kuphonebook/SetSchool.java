package com.example.kuphonebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SetSchool extends AppCompatActivity {

    public ImageView CSE;
    public ImageView Archi;
    public ImageView URP;
    public ImageView Physics;
    public ImageView ece;
    public ImageView chemistry;
    public ImageView Statistics;
    public ImageView math;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_school);

        CSE = findViewById(R.id.CSE);
        Archi = findViewById(R.id.Architecture);
        URP = findViewById(R.id.URP);
        Physics = findViewById(R.id.Physics);
        ece = findViewById(R.id.ECE);
        chemistry = findViewById(R.id.Chemistry);
        math =findViewById(R.id.Math);
        Statistics = findViewById(R.id.Statistics);


        CSE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SetSchool.this, CSE.class);
                startActivity(intent);
                return;
            }
        });
        Archi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SetSchool.this, Architecture.class);
                startActivity(intent);
                return;
            }
        });
        URP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SetSchool.this, URP.class);
                startActivity(intent);
                return;
            }
        });

        Physics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SetSchool.this, physics.class);
                startActivity(intent);
                return;
            }
        });
        chemistry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SetSchool.this, Chemistry.class);
                startActivity(intent);
                return;

            }
        });

        math.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SetSchool.this, Math.class);
                startActivity(intent);
                return;
            }
        });

        ece.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SetSchool.this, ECE.class);
                startActivity(intent);
                return;
            }
        });

        Statistics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(SetSchool.this, statistic.class);
                startActivity(intent);
                return;

            }
        });

    }
}
