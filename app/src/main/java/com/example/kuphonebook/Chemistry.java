package com.example.kuphonebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Chemistry extends AppCompatActivity {
    public String name, number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chemistry);
    }


    public void click(View view) {
        switch (view.getId()) {
            case R.id.chem_Rezaul_Haque:
                name = "Dr. Md. Rezaul Haque \n Professor";
                number = "01711579993";
                break;


            case R.id.chem_Mosummath_Hosna_Ara:
                name = "Dr. Mosummath Hosna Ara \n Professor";
                number = "01711365072";
                break;

            case R.id.chem_Kaykobad:
                name = "Kaykobad Md Rezaul Karim \n Assistant Professor";
                number = "+601137492014";
                break;

            case R.id.chem_Nirob_Kumar_Saha:
                name = "Nirob Kumar Saha \n Assistant Professor ";
                number = "+13344447556";
                break;

            case R.id.chem_Muhammad_Sarwar_Hossain:
                name = "Muhammad Sarwar Hossain \n Assistant Professor";
                number = "+821046636007";
                break;

            case R.id.chem_Mahiuddin:
                name = "Md. Mahiuddin \n Assistant Professor";
                number = "01726977630 ";
                break;

            case R.id.chem_Jamil_Ahmed:
                name = "Dr. Jamil Ahmed \n Assistant Professor";
                number = "01716602002";
                break;

            case R.id.chem_Kamrul_Hasan:
                name = "Md. Kamrul Hasan \n Assistant Professor";
                number = "9815 8616";
                break;

            case R.id.chem_Muhammad:
                name = "Muhammad Shamim Al Mamun \n Assistant Professor";
                number = "01722190049";
                break;

            case R.id.chem_Khairul:
                name = "Md. Khairul Amin \n Assistant Professor";
                number = "447448414588";
                break;
            case R.id.chem_Palash_Kumar_Dhar:
                name = "“Palash Kumar Dhar \n Assistant Professor";
                number = "01717515948";
                break;

            case R.id.chem_Nusrat_Tazeen_Tonu:
                name = "Nusrat Tazeen Tonu \n Assistant Professor";
                number = "01717610574";
                break;

            case R.id.chem_Sumon_Chakrabarty:
                name = "Sumon Chakrabarty \n Assistant Professor";
                number = "01746375708”,";
                break;

            case R.id.chem_Shishir_Kumar:
                name = "Shishir Kumar Dey \n Lecture";
                number = "01717945520";
                break;

            case R.id.chem_Rumpa_Kundu:
                name = "Rumpa Kundu \n Lecturer";
                number = "01751603550";
                break;

            case R.id.chem_Jannatul_Naime:
                name = "Jannatul Naime \n Lecturer";
                number = "01719416861";
                break;

            case R.id.chem_Prianka_Saha:
                name = "“Prianka Saha \n Lecturer";
                number = "01912161793";
                break;

            case R.id.chem_Ahsan_Habib_Kajol:
                name = "Dr. Md. Ahsan Habib Kajol \n Lecturer";
                number = "01757840291";
                break;

            case R.id.chem_Sagar_Kumar:
                name = "Sagar Kumar Dutta \n Lecturer";
                number = "01923941593";
                break;

            case R.id.chem_Rayhan_Khan:
                name = "Md. Abu Rayhan Khan \n Lecturer";
                number = "017610420863";
                break;

            case R.id.chem_Nazmul_Islam:
                name = "A.B.M. Nazmul Islam \n Assistant Professor";
                number = "01716891955”,";
                break;



        }

        Intent intent = new Intent(this, TeacherProfile.class);
        intent.putExtra("name", name);
        intent.putExtra("number", number);
        startActivity(intent);
    }



}
