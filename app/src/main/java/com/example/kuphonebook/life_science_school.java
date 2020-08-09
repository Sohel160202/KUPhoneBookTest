package com.example.kuphonebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class life_science_school extends AppCompatActivity {

    private ImageView FWT, FMT, BGE, AT, ES, PHARMACY, SWE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_science_school);

        FWT = findViewById(R.id.FWT);
        FMT = findViewById(R.id.FMT);
        BGE = findViewById(R.id.BGE);
        AT = findViewById(R.id.AT);
        ES = findViewById(R.id.ES);
        PHARMACY = findViewById(R.id.Pharmacy);
        SWE = findViewById(R.id.SWE);

        FWT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(life_science_school.this, Forestry.class);
                startActivity(intent);
                return;
            }
        });


        FMT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(life_science_school.this, Fisheries.class);
                startActivity(intent);
                return;
            }
        });


        BGE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(life_science_school.this, BGE.class);
                startActivity(intent);
                return;
            }
        });


        AT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(life_science_school.this, Agrotechnology.class);
                startActivity(intent);
                return;
            }
        });


        ES.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(life_science_school.this, ES.class);
                startActivity(intent);
                return;
            }
        });


        PHARMACY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(life_science_school.this, pharmacy.class);
                startActivity(intent);
                return;
            }
        });


        SWE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(life_science_school.this, SWE.class);
                startActivity(intent);
                return;
            }
        });
    }
}