package com.example.kuphonebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SchoolList extends AppCompatActivity {

    public ImageView SetSchool, MbaSchool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school_list);

        SetSchool = findViewById(R.id.SET);
        MbaSchool = findViewById(R.id.MBA);

        SetSchool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SchoolList.this, SetSchool.class);
                startActivity(intent);
                return;
            }
        });

        MbaSchool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SchoolList.this, MBASchool.class);
                startActivity(intent);
                return;
            }
        });
    }
}
