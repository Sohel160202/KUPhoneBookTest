package com.example.kuphonebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class statistic extends AppCompatActivity {
    public String name, number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistic);
    }


    public void click(View view) {
        switch (view.getId()) {
            case R.id.stat_Uttam_Kumar_Majumder:
                name = "Professor Dr. Uttam Kumar Majumder \n Professor";
                number = "01713163332";
                break;


            case R.id.stat_Masudul_Islam:
                name = "Masudul Islam \n Associate Professor";
                number = "00000000000";
                break;

            case R.id.stat_Benojir_Ahammed:
                name = "Benojir Ahammed \n Assistant Professor";
                number = "01714960969";
                break;

            case R.id.stat_Salauddin_Khan:
                name = "Md. Salauddin Khan \n Assistant Professor";
                number = "01715227828";
                break;

            case R.id.stata_Rasel:
                name = "Md. Rasel Kabir \n Assistant Professor";
                number = "00000000000";
                break;

            case R.id.stat_Mohammad:
                name = "Mohammad Ali \n Assistant Professor";
                number = "01745077767 ";
                break;

            case R.id.stat_Akhtarul:
                name = "Md. Akhtarul Islam \n Assistant Professor";
                number = "01722736875";
                break;

            case R.id.stat_Faisal:
                name = "N.A.M. Faisal Ahmed \n Assistant Professor";
                number = "9815 8616";
                break;

            case R.id.stat_Menhazul:
                name = "Md. Menhazul Abedin \n Assistant Professor";
                number = "01751385142";
                break;

            case R.id.stat_Sohani:
                name = "Sohani Afroja \n Assistant Professor";
                number = "01750429649";
                break;
            case R.id.stat_Ashis:
                name = "Ashis Talukder \n Assistant Professor";
                number = "01772063507";
                break;

            case R.id.stat_Maniruzzaman:
                name = "Md. Maniruzzaman \n Lecturer";
                number = "01737095565";
                break;

            case R.id.stat_Sharlene:
                name = "Sharlene Alauddin \n Lecturer";
                number = "01833968426";
                break;


        }

        Intent intent = new Intent(this, TeacherProfile.class);
        intent.putExtra("name", name);
        intent.putExtra("number", number);
        startActivity(intent);
    }







}
