package com.example.kuphonebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class physics extends AppCompatActivity {

    public String name, number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physics);
    }

    public void click(View view) {
        switch (view.getId()) {
            case R.id.Harunor_Rashid_Khan:
                name = "Dr. Md. Harunor Rashid Khan \n Professor";
                number = "01914067573";
                break;


            case R.id.Farzana_Nahid:
                name = "Dr. Farzana Nahid \n Professor";
                number = "01727422812";
                break;

            case R.id.Rashedur_Rahman:
                name = "Dr. Md. Rashedur Rahman \n Associate Professor";
                number = "01911767689";
                break;

            case R.id.Torikul_Islam:
                name = "Dr. Md. Torikul Islam \n Associate Professor";
                number = "01767277654";
                break;

            case R.id.Gopal_Biswas:
                name = "Goshtha Gopal Biswas \n Assistant Professor";
                number = "01712930630";
                break;

            case R.id.Omar_Faruk_Rasel:
                name = "Dr. Md. Omar Faruk Rasel \n Assistant Professor";
                number = "01717815313";
                break;

            case R.id.Salahuddin_Mina:
                name = "Md. Salahuddin Mina \n Assistant Professor";
                number = "821028383718";
                break;

            case R.id.Ahasan_Habib:
                name = "Md. Ahasan Habib \n Assistant Professor ";
                number = "01719164590";
                break;

            case R.id.Emran_Hossain:
                name = "Md. Emran Hossain \\n Assistant Professor";
                number = "01710440612";
                break;

            case R.id.Karimul_Hoque:
                name = "Karimul Hoque \n Assistant Professor";
                number = "01701747859";
                break;
            case R.id.Rinku_Majumder:
                name = "Rinku Majumder \n Assistant Professor";
                number = "01787535443";
                break;

            case R.id.Shohel_Parvez:
                name = "Md. Shohel Parvez \n Assistant Professor";
                number = "01737090901";
                break;

            case R.id.Preangka_Roy:
                name = "Preangka Roy \nAssistant Professor";
                number = "01730867483";
                break;

            case R.id.Malek:
                name = "Dr. Md. A. Malek \n Assistant Professor ";
                number = "01558588545";
                break;

            case R.id.Abdullah_Al_Mamun:
                name = "Abdullah Al-Mamun \n Lecturer";
                number = "01723434043";
                break;

            case R.id.Sohel_Sikder:
                name = "Md. Sohel Sikder \n Lecturer ";
                number = "01977941271";
                break;

            case R.id.Zarin_Tasnim_Nijhum:
                name = "Zarin Tasnim Nijhum \n Lecturer";
                number = "01704886972";
                break;


        }

        Intent intent = new Intent(this, TeacherProfile.class);
        intent.putExtra("name", name);
        intent.putExtra("number", number);
        startActivity(intent);
    }


}
