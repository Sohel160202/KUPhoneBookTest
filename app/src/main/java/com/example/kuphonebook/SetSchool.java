package com.example.kuphonebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class SetSchool extends AppCompatActivity {

    public ImageView CSE;
    public ImageView Archi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_school);

        CSE = findViewById(R.id.CSE);
        Archi = findViewById(R.id.Archi);

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
    }
}
