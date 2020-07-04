package com.example.kuphonebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class URP extends AppCompatActivity {
    public String name, number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u_r_p);
    }

    public void click(View view) {
        switch (view.getId()) {
            case R.id.Rezaul_Karim:
                name = "Md Rezaul Karim\nProfessor";
                number = "00000000000";
                break;


            case R.id.Mohsin_Uddin:
                name = "Mohsin Uddin Ahmed\nProfessor ";
                number = "00000000000";
                break;

            case R.id.Ghulam_Murta:
                name = "Md. Ghulam Murta\nProfessor";
                number = "01711483275";
                break;

            case R.id.Ashraful_Alam:
                name = "Md Ashraful Alam\\nProfessor";
                number = "0000000000";
                break;

            case R.id.Shamim_Mahabubul:
                name = "Shamim Mahabubul Haque\nProfessor";
                number = "000000000";
                break;

            case R.id.Ahsanul_Kabir:
                name = "Md Ahsanul Kabir\nProfessor";
                number = "01711375181";
                break;

            case R.id.Zakir_Hossain:
                name = "Md Zakir Hossain\\nProfessor";
                number = "01992644569";
                break;

            case R.id.Mursalin_Mamun:
                name = "Sheikh Md Mursalin Mamun\nProfessor";
                number = "00000000000";
                break;

            case R.id.Ashiq_Ur_Rahman:
                name = "Dr. Md Ashiq Ur Rahman\nProfessor";
                number = "01914066267";
                break;

            case R.id.Tanjil_Sowgat:
                name = "Dr. Tanjil Sowgat\nProfessor";
                number = "00000000000";
                break;
            case R.id.Mostafizur_Rahman:
                name = "“Md Mostafizur Rahman\nAssociate Professor";
                number = "01718110797";
                break;

            case R.id.Fawzia_Farzana:
                name = "Fawzia Farzana\nAssociate Professor";
                number = "000000000";
                break;

            case R.id.Salauddin:
                name = "Md Salauddin\nAssociate Professor";
                number = "00000000000";
                break;

            case R.id.Mahmud_U_Zaman:
                name = "Mahmud U. Zaman\nAssistant Professor";
                number = "01701831576";
                break;

            case R.id.Rabeya_Sultana:
                name = "Rabeya Sultana Leya\nAssistant Professor";
                number = "000000000";
                break;

            case R.id.Lopa_Islam:
                name = "Lopa Islam\nAssistant Professor";
                number = "000000000";
                break;

            case R.id.Mostaq_Ahmed:
                name = "“Mostaq Ahmed\nAssistant Professor";
                number = "0417201713";
                break;

            case R.id.Shilpi_Roy:
                name = "Shilpi Roy\nAssistant Professor";
                number = "0000000";
                break;

            case R.id.Maitry_Biswas:
                name = "Maitry Biswas\nAssistant Professor";
                number = "00000000000";
                break;

            case R.id.Mohammed_Shariful_Islam:
                name = "Mohammed Shariful Islam\nAssistant Professor";
                number = "00000000000";
                break;

        }

        Intent intent = new Intent(this, TeacherProfile.class);
        intent.putExtra("name", name);
        intent.putExtra("number", number);
        startActivity(intent);
    }


}
