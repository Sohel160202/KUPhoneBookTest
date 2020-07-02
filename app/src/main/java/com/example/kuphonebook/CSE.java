package com.example.kuphonebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class CSE extends AppCompatActivity {

    public String name, number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse);

    }

    public void click(View view) {
        switch (view.getId()) {
            case R.id.Rafiqul_Islam:
                name = "Dr. Md. Rafiqul Islam\nProfessor";
                number = "0412831551";
                break;


            case R.id.Anisur_Rahman:
                name = "“Dr. Md. Anisur Rahman\nProfessor";
                number = "041720171";
                break;

            case R.id.Kamrul_Hasan:
                name = "Dr. Kamrul Hasan Talukder\nProfessor";
                number = "8801925687763";
                break;

            case R.id.Shah_Nawaz:
                name = "Dr. Kazi Shah Nawaz Ripon\nProfessor";
                number = "0412831551";
                break;

            case R.id.Rameswar_Debnath:
                name = "“Dr. Rameswar Debnath\nProfessor";
                number = "01715182784";
                break;

            case R.id.Rafizul_Haque:
                name = "Dr. S.M. Rafizul Haque\nProfessor";
                number = "01736659547";
                break;

            case R.id.Abu_Shamim:
                name = "Dr. Abu Shamim Mohammad Arif\nProfessor";
                number = "01556327609";
                break;

            case R.id.Atiqur_Rahman:
                name = "“Dr. G M Atiqur Rahaman\nProfessor";
                number = "01715712877";
                break;

            case R.id.Alamgir_Hossain:
                name = "SK Alamgir Hossain\nAssociate Professor";
                number = "0417201713";
                break;

            case R.id.Masudul_Alam:
                name = "Dr. Kazi Masudul Alam\nAssociate Professor";
                number = "01711149360";
                break;
            case R.id.Mohidul_Islam:
                name = "“S. M. Mohidul Islam\nAssociate Professor";
                number = "01727043774";
                break;

            case R.id.Manishankar_Mondal:
                name = "Dr. Manishankar Mondal\nAssistant Professor";
                number = "01763453388";
                break;

            case R.id.Zahidul_Islam:
                name = "Md. Zahidul Islam\nAssistant Professor";
                number = "0412831551";
                break;

            case R.id.Amit_Kumar:
                name = "Amit Kumar Mondal\nAssistant Professor";
                number = "01722929524";
                break;

            case R.id.Saikat_Mondal:
                name = "Saikat Mondal\nAssistant Professor";
                number = "01736560790";
                break;

            case R.id.Sarfaraz_Newaz:
                name = "Sarfaraz Newaz\nAssistant Professor";
                number = "8801911046898";
                break;

            case R.id.Ratna_Saha:
                name = "“Ratna Saha\nLecturer";
                number = "0417201713";
                break;

            case R.id.Debasish_Chakroborti:
                name = "Debasish Chakroborti\nLecturer";
                number = "01718836714";
                break;

            case R.id.Fatima_Tabassum:
                name = "Fatima Tabassum\nLecturer";
                number = "0417201713";
                break;

            case R.id.Aysha_Akter:
                name = "Aysha Akther\nLecturer";
                number = "01950153793";
                break;

            case R.id.Atanu_Shome:
                name = "Atanu Shome\nLecturer";
                number = "801717250819";
                break;

            case R.id.Jabed_Al_Faysal:
                name = "Jabed Al Faysal\nLecturer";
                number = "01942295838";
                break;

            case R.id.Anupam_Kumar:
                name = "Dr. Anupam Kumar Bairagi\nAssociate Professor";
                number = "01304562229";
                break;

        }

        Intent intent = new Intent(this, TeacherProfile.class);
        intent.putExtra("name", name);
        intent.putExtra("number", number);
        startActivity(intent);
    }
}
