package com.example.kuphonebook;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ECE extends AppCompatActivity {
    public String name, number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e_c_e);
    }

    public void click(View view) {
        switch (view.getId()) {
            case R.id.ece_Mohammad_Ismat_Kadir://got it
                name = "Dr. Mohammad Ismat Kadir \n Professor";
                number = " 01711067831";
                break;


            case R.id.ece_Maniruzzaman://got it
                name = "Dr. Md. Maniruzzaman\n Professor";
                number = "01914066284";
                break;

            case R.id.ece_Sohel_Mahmud_Sher://got it
                name = "Dr. Md. Sohel Mahmud Sher \n Professor";
                number = "01814272202";
                break;

            case R.id.ece_Shamim_Ahsan://got it
                name = "Dr. Md. Shamim Ahsan \n Professor";
                number = "01675328671";
                break;

            case R.id.ece_Shamsul_Alam://got it
                name = "S. M.Shamsul Alam \n Associate Professor";
                number = "01712163906";
                break;

            case R.id.ece_Mahbub_Hossain://got it
                name = "Md. Mahbub Hossain \nAssociate Professor";
                number = "01712633067";
                break;

            case R.id.ece_Tariq_Hasan://got it
                name = "Md. Tariq Hasan \n Associate Professor";
                number = "01914066244";
                break;

            case R.id.ece_Abdul_Awal://got it
                name = "Dr. Md. Abdul Awal \n Associate Professor";
                number = "01786196913";
                break;

            case R.id.ece_Uzzal_Biswas://got it
                name = "Uzzal Biswas \n Assistant Professor";
                number = "610415477399";
                break;

            case R.id.ece_Rafia_Nishat_Toma://got it
                name = "Rafia Nishat Toma \n Assistant Professor";
                number = "01727223985";
                break;
            case R.id.ece_Nazmul_Hasan://got it
                name = "Md. Nazmul Hasan \n Assistant Professor";
                number = "01737736417";
                break;

            case R.id.ece_Sehrish_Khan:///last
                name = "Ms. Sehrish Khan \n Professor";
                number = "00000000000";
                break;

            case R.id.ece_Abdul_Alim://got it
                name = "Dr. Md. Abdul Alim \n Professor";
                number = "00000000";
                break;

            case R.id.ece_Mizanur_Rahman://got it
                name = "Dr. Md. Mizanur Rahman \n Professor";
                number = "00000000000";
                break;

            case R.id.ece_Younus_Ali:
                name = "Md. Younus Ali \n Associate Professor";
                number = "00000000";
                break;

            case R.id.ece_Abdullah_Al_Nahid:
                name = "Dr. Abdullah-Al Nahid \n Associate Professor";
                number = "00000000";
                break;

            case R.id.ece_Shakila_Naznin:
                name = "Shakila Naznin \\n Assistant Professor";
                number = "00000000";
                break;

            case R.id.ece_Ragib_Shakil_Rafi:
                name = "Ragib Shakil Rafi \n Assistant Professor ";
                number = "00000000";
                break;


        }

        Intent intent = new Intent(this, TeacherProfile.class);
        intent.putExtra("name", name);
        intent.putExtra("number", number);
        startActivity(intent);
    }


}
