package com.example.kuphonebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SWE extends AppCompatActivity {


    public String name, number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s_w_e);
    }


    public void click(View view) {
        switch (view.getId()) {
            case R.id.SWE1:
                name = "Afroza Begum \n Professor";
                number = "01685396287";
                break;


            case R.id.SWE2:
                name = "Dr. Shaikh Motasim Billah \n Professor";
                number = "01711441463";
                break;

            case R.id.SWE3:
                name = "Khandoker Qudrata Kibria \n Professor";
                number = "01789441882";
                break;

            case R.id.SWE4:
                name = "Md. Sanaul Islam\n Professor";
                number = "01822822866";
                break;

            case R.id.SWE5:
                name = "Mohammad Zaber Hossain \n Professor";
                number = "01911799229";
                break;

            case R.id.SWE6:
                name = "Dr. Jagadish Chandra Joardar \n Professor";
                number = "01913454881";
                break;

            case R.id.SWE7:
                name = "Md Sadiqul Amin \n Associate Professor";
                number = "01720314151";
                break;

            case R.id.SWE8:
                name = "Md. Hanif \n Associate Professor";
                number = "447424945541";
                break;

            case R.id.SWE9:
                name = "Sonia Nasrin \n Associate Professor";
                number = "01711010773";
                break;

            case R.id.SWE10:
                name = "Nipa Adhikary \n Associate Professor";
                number = "01920635755";
                break;
            case R.id.SWE11:
                name = "Monowara Khatun \n Assistant Professor";
                number = "01736302718";
                break;

            case R.id.SWE12:
                name = "Milton Halder \n Lecturer";
                number = "00000000000";
                break;

            case R.id.SWE13:
                name = "Falguni Akter \n Lecturer";
                number = "01716078872";
                break;

            case R.id.SWE14:
                name = "Md. Tareq Bin Salam \n Lecturer";
                number = "01911045067";
                break;


        }

        Intent intent = new Intent(this, TeacherProfile.class);
        intent.putExtra("name", name);
        intent.putExtra("number", number);
        startActivity(intent);
    }

}
