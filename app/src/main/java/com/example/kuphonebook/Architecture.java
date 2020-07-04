package com.example.kuphonebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Architecture extends AppCompatActivity {

    public String name, number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_architecture);
    }


    public void click(View view) {
        switch (view.getId()) {
            case R.id.Afroza_Parvin:
                name = "Dr. Afroza Parvin\nProfessor";
                number = "01550021759";
                break;


            case R.id.Anirban_Mostafa:
                name = "“Dr. Anirban Mostafa\nProfessor";
                number = "01550021761";
                break;

            case R.id.Kh_Mahfuz_Darain:
                name = "Dr. Kh. Mahfuz-ud-Darain\nProfessor";
                number = "01711985472";
                break;


            case R.id.Serajul_Hakim:
                name = "“Dr. Sheikh Serajul Hakim\nProfessor";
                number = "01700766600";
                break;

            case R.id.Tapan_Kumar_Dhar:
                name = "Dr. Tapan Kumar Dhar\nProfessor";
                number = "01711104487";
                break;

            case R.id.Masood_Reza:
                name = "Dr. A. T. M. Masood Reza\nAssociate Professor";
                number = "01711331277";
                break;

            case R.id.Gouri_Shankar:
                name = "Gouri Shankar Roy\nAssociate Professor";
                number = "01715712877";
                break;

            case R.id.Rumana_Asad:
                name = "Rumana Asad\\nAssociate Professor";
                number = "00000000000";
                break;

            case R.id.Kabir_Ahmed:
                name = "Sk. Kabir Ahmed\nAssociate Professor";
                number = "01711422742";
                break;
            case R.id.Maruf_Hossain:
                name = "“Md. Sk. Maruf Hossain\nAssociate Professor";
                number = "01711344155";
                break;

            case R.id.Nazimuddin:
                name = "S. M. Nazimuddin\\nAssistant Professor";
                number = "01763453388";
                break;

            case R.id.Lipon_Saha:
                name = "Lipon Saha\nAssistant Professor";
                number = "0000000000";
                break;

            case R.id.Shibu_Prashad:
                name = "Shibu Prashad Bosu\nAssistant Professor";
                number = "01717456862";
                break;

            case R.id.Sifat_Sarwar:
                name = "Sifat Sarwar\nAssistant Professor";
                number = "000000000";
                break;

            case R.id.Laila_Siddiqua:
                name = "Laila Siddiqua\nAssistant Professor";
                number = "8801911046898";
                break;

            case R.id.Esfaqur_Rahman:
                name = "“Md. Esfaqur Rahman\nAssistant Professor";
                number = "01712005425";
                break;

            case R.id.Imran_Hossain:
                name = "Imran Hossain Foishal\nAssistant Professor";
                number = "01924383673";
                break;

            case R.id.Sumaiya_Rahman:
                name = "Sumaiya Rahman Piashi\\nAssistant Professor";
                number = "01738260474";
                break;

            case R.id.Nur_Mohammad:
                name = "Nur Mohammad Khan\nLecturer";
                number = "01912321547";
                break;

            case R.id.Hassan_AlTanbin:
                name = "Sk. Hassan AlTanbin\nLecturer";
                number = "01718700069";
                break;

            case R.id.Azharul_Islam:
                name = "Md. Azharul Islam\nLecturer";
                number = "01671019579";
                break;

            case R.id.Antu_Das:
                name = "Antu Das\\nLecturer";
                number = "01815353539";
                break;

        }

        Intent intent = new Intent(this, TeacherProfile.class);
        intent.putExtra("name", name);
        intent.putExtra("number", number);
        startActivity(intent);
    }


}
