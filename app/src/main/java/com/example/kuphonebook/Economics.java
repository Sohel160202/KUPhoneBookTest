package com.example.kuphonebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Economics extends AppCompatActivity {

    public String name, number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_economics);
    }


    public void click(View view) {
        switch (view.getId()) {
            case R.id.eco_Mohammed:
                name = "Dr. Mohammed Ziaul Haider \n Professor";
                number = "01730004131";
                break;


            case R.id.eco_Shahnewaz:
                name = "Dr. Shahnewaz Nazimuddin Ahmed \n Professor";
                number = "00000000000";
                break;

            case R.id.eco_Fauzia:
                name = "Dr. Fauzia Hamid \n Professor";
                number = "0000000000";
                break;

            case R.id.eco_Nasif:
                name = "Md.Nasif Ahsan, \n Professor";
                number = "0000000000";
                break;

            case R.id.eco_Sharafat:
                name = "Sk. Sharafat Hossen \n Professor";
                number = "0000000000";
                break;

            case R.id.eco_Nurun:
                name = "Nurun Naher Moni \n Professor";
                number = "01724039835";
                break;

            case R.id.eco_Kaniz:
                name = "Kaniz Fatima Mohsin \nProfessor";
                number = "01716702927";
                break;

            case R.id.eco_Sazia:
                name = "Sazia Ahmed \\n Lecturer \\n ";
                number = "01913555662";
                break;

            case R.id.eco_Faijan:
                name = "Sk. Faijan Bin Halim \n Lecturer";
                number = "01739052829";
                break;

            case R.id.eco_Tasnim:
                name = "Tasnim Murad Mamun \\n Assistant Professor";
                number = "00000000000";
                break;
            case R.id.eco_Sariful:
                name = "“Md. Sariful Islam \\n Assistant Professor";
                number = "01776266069";
                break;

            case R.id.eco_Fariha:
                name = "Fariha Farjana \\n Assistant Professor";
                number = "00000000000";
                break;

            case R.id.eco_Debasish:
                name = "Debasish Kumar Das \n Assistant Professor";
                number = "00000000000";
                break;

            case R.id.eco_Firoz:
                name = "Firoz Ahmed \n Associate Professor";
                number = "00000000000";
                break;

            case R.id.eco_Nishad:
                name = "Nishad Nasrin \n Associate Professor";
                number = "01727212501";
                break;

            case R.id.eco_Champa:
                name = "Champa Bati Dutta \n Associate Professor";
                number = "00000000000";
                break;

            case R.id.eco_Khan:
                name = "Khan Mehedi Hasan \n Associate Professor";
                number = "+88041751099";
                break;

            
        }

        Intent intent = new Intent(this, TeacherProfile.class);
        intent.putExtra("name", name);
        intent.putExtra("number", number);
        startActivity(intent);
    }
}
