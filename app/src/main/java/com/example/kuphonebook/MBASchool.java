package com.example.kuphonebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MBASchool extends AppCompatActivity {

    public ImageView BAD, HRM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mbaschool);

        BAD = findViewById(R.id.BAD);
        HRM = findViewById(R.id.HRM);

        BAD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MBASchool.this, BAD.class);
                startActivity(intent);
                return;
            }
        });


        HRM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MBASchool.this, HRM.class);
                startActivity(intent);
                return;
            }
        });
    }
}
