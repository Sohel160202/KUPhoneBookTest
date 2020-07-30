package com.example.kuphonebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Sociology extends AppCompatActivity {

    public String name, number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sociology);
    }


    public void click(View view) {
        switch (view.getId()) {
            case R.id.Sociology1:
                name = "Dr. Md. Abdul Jabbar \n Professor";
                number = "01914066233";
                break;


            case R.id.Sociology2:
                name = "Dr. Selina Ahmed \n Professor";
                number = "01866981360";
                break;

            case R.id.Sociology3:
                name = "Dr. Abdullah Abusayed Khan \n Professor";
                number = "00000000000";
                break;

            case R.id.Sociology4:
                name = "Dr. Mosammat Rowshan Ara \n Professor";
                number = "00000000000";
                break;

            case R.id.Sociology5:
                name = "Sanjoy Kumar Chanda \n Associate Professor";
                number = "01721047466";
                break;

            case R.id.Sociology6:
                name = "Dr. Tuhin Roy \n Associate Professor";
                number = "01716594779";
                break;

            case R.id.Sociology7:
                name = "Tunvir Ahamed Shohel \n Associate Professor";
                number = "00000000000";
                break;

            case R.id.Sociology8:
                name = "Md. Tanvir Hossain \n Associate Professor";
                number = "01841139616";
                break;

            case R.id.Sociology9:
                name = "Taufiq-E-Ahmed Shovo \n Assistant Professor";
                number = "00000000000";
                break;

            case R.id.Sociology10:
                name = "Shaharior Rahman Razu \n Assistant Professor";
                number = "01715333500";
                break;
            case R.id.Sociology11:
                name = "Nusrat Jahan \n Assistant Professor";
                number = "00000000000";
                break;

            case R.id.Sociology12:
                name = "Shahinur Akter \n Assistant Professor";
                number = "00000000000";
                break;

            case R.id.Sociology13:
                name = "Dipika Chandra \n Assistant Professor";
                number = "00000000000";
                break;

            case R.id.Sociology14:
                name = "Md. Ripul Kabir \nLecturer";
                number = "01904428520";
                break;

            case R.id.Sociology15:
                name = "S. M. Faizul Haq Eshan \n Lecturer";
                number = "00000000000";
                break;

            case R.id.Sociology16:
                name = "Afsana Polly \n Lecturer";
                number = "00000000000";
                break;


        }

        Intent intent = new Intent(this, TeacherProfile.class);
        intent.putExtra("name", name);
        intent.putExtra("number", number);
        startActivity(intent);
    }


}
