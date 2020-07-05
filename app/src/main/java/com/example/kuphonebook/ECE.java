package com.example.kuphonebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ECE extends AppCompatActivity {
    public String name, number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e_c_e);
    }

    public void click(View view) {
        switch (view.getId()) {
            case R.id.Mohammad_Ismat_Kadir:
                name = "Dr. Mohammad Ismat Kadir \n Professor";
                number = " 01711067831";
                break;


            case R.id.Maniruzzaman:
                name = "Dr. Md. Maniruzzaman\n Professor";
                number = "01914066284";
                break;

            case R.id.Sohel_Mahmud_Sher:
                name = "Dr. Md. Sohel Mahmud Sher \n Professor";
                number = "01814272202";
                break;

            case R.id.Shamim_Ahsan:
                name = "Dr. Md. Shamim Ahsan \n Professor";
                number = "01675328671";
                break;

            case R.id.Shamsul_Alam:
                name = "S. M.Shamsul Alam \n Associate Professor";
                number = "01712163906";
                break;

            case R.id.Mahbub_Hossain:
                name = "Md. Mahbub Hossain \nAssociate Professor";
                number = "01712633067";
                break;

            case R.id.Tariq_Hasan:
                name = "Md. Tariq Hasan \n Associate Professor";
                number = "01914066244";
                break;

            case R.id.Abdul_Awal:
                name = "Dr. Md. Abdul Awal \n Associate Professor";
                number = "01786196913";
                break;

            case R.id.Uzzal_Biswas:
                name = "Uzzal Biswas \n Assistant Professor";
                number = "610415477399";
                break;

            case R.id.Rafia_Nishat_Toma:
                name = "Rafia Nishat Toma \n Assistant Professor";
                number = "01727223985";
                break;
            case R.id.Nazmul_Hasan:
                name = "Md. Nazmul Hasan \n Assistant Professor";
                number = "01737736417";
                break;

            case R.id.Sehrish_Khan:
                name = "Ms. Sehrish Khan \n Professor";
                number = "00000000000";
                break;

            case R.id.Abdul_Alim:
                name = "Dr. Md. Abdul Alim \n Professor";
                number = "00000000";
                break;

            case R.id.Mizanur_Rahman:
                name = "Dr. Md. Mizanur Rahman \n Professor";
                number = "00000000000";
                break;

            case R.id.Younus_Ali:
                name = "Md. Younus Ali \n Associate Professor";
                number = "00000000";
                break;

            case R.id.Abdullah_Al_Nahid:
                name = "Dr. Abdullah-Al Nahid \n Associate Professor";
                number = "00000000";
                break;

            case R.id.Shakila_Naznin:
                name = "Shakila Naznin \\n Assistant Professor";
                number = "00000000";
                break;

            case R.id.Debasish_Chakroborti:
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
