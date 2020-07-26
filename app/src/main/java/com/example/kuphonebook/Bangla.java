package com.example.kuphonebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Bangla extends AppCompatActivity {

    public String name, number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangla);
    }


    public void click(View view) {
        switch (view.getId()) {
            case R.id.b1:
                name = "Dr. Shaikh Md. Roziqul Islam \n Professor";
                number = "041751118";
                break;


            case R.id.b2:
                name = "Dr. Md. Rubel Ansar \n Associate Professor";
                number = "01718017966";
                break;

            case R.id.b3:
                name = "Md. Dulal Hossain  \\n Associate Professor";
                number = "01716060251";
                break;

            case R.id.b4:
                name = "Imran Kamal \n Assistant Professor";
                number = "01726793286";
                break;

            case R.id.b5:
                name = "Asma Yasmin Runa \n Assistant Professor";
                number = "01722105793";
                break;

            case R.id.b6:
                name = "Md. Abul Fazal \n Assistant Professor";
                number = "01721101200";
                break;

            case R.id.b7:
                name = "Moumita Roy \n Assistant Professor";
                number = "01939828381";
                break;

            case R.id.b8:
                name = "Biplab Roy \n Assistant Professor";
                number = "01718555949";
                break;

            case R.id.b10:
                name = "Antara Biswas \nLecturer";
                number = "01946571181";
                break;

            case R.id.b9:
                name = "Shakil Alam \n Lecturer";
                number = "01778714974";
                break;
            

        }

        Intent intent = new Intent(this, TeacherProfile.class);
        intent.putExtra("name", name);
        intent.putExtra("number", number);
        startActivity(intent);
    }


}
