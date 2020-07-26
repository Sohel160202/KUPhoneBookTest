package com.example.kuphonebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DS extends AppCompatActivity {

    public String name, number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d_s);
    }


    public void click(View view) {
        switch (view.getId()) {
            case R.id.ds_Kazi:
                name = "Kazi Humayun Kabir \n Associate Professor";
                number = "01713825538";
                break;


            case R.id.ds_Hasan:
                name = "Md. Hasan Howlader \n Associate Professor";
                number = "01710616110";
                break;

            case R.id.ds_Nuzhat:
                name = "Nuzhat Fatema \n Assistant Professor";
                number = "01816890515";
                break;

            case R.id.ds_Asma:
                name = "Asma Ul Husna \n Assistant Professor";
                number = "01766102060";
                break;

            case R.id.ds_Zobayer:
                name = "Md. Zobayer Hossain \n Assistant Professor";
                number = "01911239966";
                break;

            case R.id.ds_Bayezid:
                name = "Bayezid Khan \n Assistant Professor";
                number = "01710544294";
                break;

            case R.id.ds_Tasnuva:
                name = "Tasnuva Yesmin \n Lecturer";
                number = "01621730147";
                break;

            case R.id.ds_Umme:
                name = "Umme Habiba \n Lecturer";
                number = "01726201014";
                break;

            case R.id.ds_Kumrul:
                name = "Sk. Kumrul Hasan \n Lecturer";
                number = "01914780806";
                break;


        }

        Intent intent = new Intent(this, TeacherProfile.class);
        intent.putExtra("name", name);
        intent.putExtra("number", number);
        startActivity(intent);
    }

}
