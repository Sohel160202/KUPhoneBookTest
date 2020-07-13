package com.example.kuphonebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Math extends AppCompatActivity {
    public String name, number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math);
    }

    public void click(View view) {
        switch (view.getId()) {
            case R.id.math_Md_Rafiqul_Islam:
                name = "Dr. Md. Rafiqul Islam \n Professor";
                number = "01914066279";
                break;


            case R.id.math_Md_Mahmud_Alam:
                name = "Dr. Md. Mahmud Alam \n Professor";
                number = "01912982811";
                break;

            case R.id.math_Haider_Ali_Biswas:
                name = "Dr. Md. Haider Ali Biswas \n Professor";
                number = "01711948396";
                break;

            case R.id.math_Munnujahan_Ara:
                name = "Prof. Dr. Munnujahan Ara \\n Professor";
                number = "01716341664";
                break;

            case R.id.math_Sarder_Firoz_Ahmmed:
                name = "Prof. Dr. Sarder Firoz Ahmmed \n Professor";
                number = "01712195877";
                break;

            case R.id.math_Azmol_Huda:
                name = "Md. Azmol Huda \n Professor";
                number = "01736658618";
                break;

            case R.id.math_Lasker_Ershad_Ali:
                name = "Dr. Lasker Ershad Ali \n Professor";
                number = "01780076427";
                break;

            case R.id.math_Dr_Nazmul_Islam:
                name = "Dr. Nazmul Islam \n Associate Professor";
                number = "01715712877";
                break;

            case R.id.math_Ariful_Islam:
                name = "Ariful Islam \n Associate Professor";
                number = "00000000000”";
                break;

            case R.id.math_Mohammad_Wahiduzzaman:
                name = "Mohammad Wahiduzzaman \nAssociate Professor";
                number = "01913262715";
                break;
            case R.id.math_Md_Mohidul_Haque:
                name = "“Md. Mohidul Haque \n Associate Professor";
                number = "01733474681";
                break;

            case R.id.math_Raju_Roy:
                name = "Raju Roy \n Assistant Professor";
                number = "01717556664";
                break;

            case R.id.math_Md_Azizur_Rahman:
                name = "Md. Azizur Rahman \nAssistant Professor";
                number = "00000000000";
                break;

            case R.id.math_Uzzwal_Kumar_Mallick:
                name = "Uzzwal Kumar Mallick \n Assistant Professor";
                number = "01718833878";
                break;

            case R.id.math_Abdus_Samad:
                name = "Sk. Abdus Samad \n Lecturer ";
                number = "01950616321";
                break;


        }

        Intent intent = new Intent(this, TeacherProfile.class);
        intent.putExtra("name", name);
        intent.putExtra("number", number);
        startActivity(intent);
    }

}
