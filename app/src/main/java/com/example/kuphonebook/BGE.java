package com.example.kuphonebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BGE extends AppCompatActivity {

    public String name, number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b_g_e);
    }

    public void click(View view) {
        switch (view.getId()) {
            case R.id.bge1:
                name = "Dr. Md. Raihan Ali\\nProfessor";
                number = "00000000000";
                break;


            case R.id.bge2:
                name = "Dr. Khondoker Moazzem Hossain\\nProfessor";
                number = "00000000000";
                break;

            case R.id.bge3:
                name = "Dr. Sheikh Md. Enayetul Babar\\nProfessor";
                number = "00000000000";
                break;

            case R.id.bge4:
                name = "Dr. S. M. Mahbubur Rahman\\nProfessor";
                number = "041720171";
                break;

            case R.id.bge5:
                name = "Dr.Ayesha Ashraf\\nProfessor";
                number = "00000000000";
                break;

            case R.id.bge6:
                name = "Dr. Sheikh Julfikar Hossain\\nProfessor";
                number = "00000000000";
                break;

            case R.id.bge7:
                name = "Dr. Md. Morsaline Billah\\nProfessor";
                number = "0412831546";
                break;

            case R.id.bge8:
                name = "Dr. S. M. AbdulAwal\\nProfessor";
                number = "00000000000";
                break;

            case R.id.bge9:
                name = "Dr. Kazi Mohammed Didarul Islam\\nProfessor";
                number = "01726852004";
                break;

            case R.id.bge10:
                name = "Dr. Md. Shamim Akhter\\nProfessor";
                number = "01718482468";
                break;
            case R.id.bge11:
                name = "Dr. Sayda Rehana\\nProfessor";
                number = "00000000000";
                break;

            case R.id.bge12:
                name = "Ahsan Habib\\nProfessor";
                number = "01770058070";
                break;

            case R.id.bge13:
                name = "MahbubESobhani\\nAssociate Professor";
                number = "00000000000";
                break;

            case R.id.bge14:
                name = "Md. Emdadul Islam\\nAssociate Professor";
                number = "01712773266";
                break;

            case R.id.bge15:
                name = "Khandker Khaldun Islam\\nAssociate Professor";
                number = "00000000000";
                break;

            case R.id.bge16:
                name = "Dr. Asif Ahmed\\nAssociate Professor";
                number = "00000000000";
                break;

            case R.id.bge17:
                name = "Dr. Sk Amir Hossain\\nAssociate Professor";
                number = "01998902264";
                break;

            case R.id.bge18:
                name = "Dr. Chanchal Mandal\\nAssociate Professor";
                number = "01751772858";
                break;

            case R.id.bge19:
                name = "Tahmina Pervin\\nLecturer";
                number = "00000000000";
                break;

            case R.id.bge20:
                name = "Shaila Siddiqua\nLecturer";
                number = "00000000000";
                break;



        }

        Intent intent = new Intent(this, TeacherProfile.class);
        intent.putExtra("name", name);
        intent.putExtra("number", number);
        startActivity(intent);
    }


}
