package com.example.kuphonebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Agrotechnology extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agrotechnology);
    }


    public void click(View view) {
        switch (view.getId()) {
            case R.id.es1:
                name = "Dr. Dilip Kumar Datta \n Professor";
                number = "00000000000";
                break;


            case R.id.es2:
                name = "Dr. Abul Kalam Azad \\n Professor";
                number = "00000000000";
                break;

            case R.id.es3:
                name = "Dr. Quazi Zahangir Hossain \\n Professor";
                number = "+00000000000";
                break;

            case R.id.es4:
                name = "Dr. Salma Begum \\n Professor ";
                number = "00000000000";
                break;

            case R.id.es5:
                name = "Dr. Abdullah Harun Chowdhury \\n Professor ";
                number = "880412831317";
                break;

            case R.id.es6:
                name = "Dr. Mujibor Rahman \\n Professor";
                number = "00000000000";
                break;

            case R.id.es7:
                name = "Dr. Atikul Islam \\n Professo";
                number = "00000000000";
                break;

            case R.id.es8:
                name = "Dr. Meher Un Nessa \\n Professor";
                number = "00000000000";
                break;

            case R.id.es9:
                name = "Dr. Abdullah Yousuf Al Harun \\n Professor";
                number = "01918868606";
                break;

            case R.id.es10:
                name = "Molla Mohammad Shafiqur Rahman \\n Associate Professor";
                number = "00000000000";
                break;

            case R.id.es11:
                name = "Nazia Hassan \\n Associate Professor";
                number = "01718125586";
                break;
            case R.id.es12:
                name = "Masudur Rahman \\n Associate Professor";
                number = "00000000000";
                break;


            case R.id.es13:
                name = "Prosun Kumar Ghosh \\n Associate Professor";
                number = "00000000000”,";
                break;

            case R.id.es14:
                name = "Farhana Haque \\n Assistant Professor";
                number = "00000000000";
                break;

            case R.id.es15:
                name = "Md. Ali Akber \\n Assistant Professor";
                number = "01911117329";
                break;

            case R.id.es16:
                name = "Abdullah-Al-Masud \\n Assistant Professor";
                number = "00000000000";
                break;

            case R.id.es17:
                name = "Md. Ashik-Ur-Rahman \\n Lecturer";
                number = "00000000000";
                break;

            case R.id.es18:
                name = "Sadhon Chandra Swarnokar \n Lecturer";
                number = "01723966502";
                break;

            case R.id.es19:
                name = "Simu Akter \n Lecturer";
                number = "01774599700";
                break;

            case R.id.es20:
                name = "Rabeya Sultana \\\n Lecturer";
                number = "01710451312";
                break;

            case R.id.es21:
                name = "Sadia Islam Mou \n Lecturer ";
                number = "01966031337”,";
                break;


        }

        Intent intent = new Intent(this, TeacherProfile.class);
        intent.putExtra("name", name);
        intent.putExtra("number", number);
        startActivity(intent);
    }
}
