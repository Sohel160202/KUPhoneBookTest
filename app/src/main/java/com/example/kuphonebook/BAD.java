package com.example.kuphonebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BAD extends AppCompatActivity {
    public String name, number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b_a_d);
    }


    public void click(View view) {
        switch (view.getId()) {
            case R.id.bad1:
                name = "Dr. Feroz Ahmed\nProfessor";
                number = "01914066201";
                break;


            case R.id.bad2:
                name = "Md. Mizanur Rahman\nProfessor";
                number = "01707066202";
                break;

            case R.id.bad3:
                name = "Dr. ATM. Jahiruddin\nProfessor";
                number = "+00000000000";
                break;

            case R.id.bad4:
                name = "Dr. Md. Noor Un Nabi\nProfessor ";
                number = "00000000000";
                break;

            case R.id.bad5:
                name = "Ranajit Bairagi\nProfessor ";
                number = "01989602915";
                break;

            case R.id.bad6:
                name = "Sk.Mahmudul Hasan\nProfessor";
                number = "00000000000";
                break;

            case R.id.bad7:
                name = "Mehedi Hasan Md. Hefzur Rahman\nProfessor";
                number = "00000000000";
                break;

            case R.id.bad8:
                name = "Dr. Md. Nur Alam\nProfessor ";
                number = "00000000000";
                break;

            case R.id.bad9:
                name = "S. M. Zahidur Rahman\nProfessor";
                number = "01918868606";
                break;

            case R.id.bad10:
                name = "Dr. Rumana Haque\nProfessor";
                number = "00000000000";
                break;

            case R.id.bad11:
                name = "Md. Khashrul Alam\nProfessor";
                number = "00000000000";
                break;
            case R.id.bad12:
                name = "Dr. Eijaz Ahmed Khan\nProfessor";
                number = "00000000000";
                break;


            case R.id.bad13:
                name = "S M Towhidur Rahman\nProfessor";
                number = "00000000000”,";
                break;

            case R.id.bad14:
                name = "Sarif Mohammad Khan\nProfessor";
                number = "00000000000";
                break;

            case R.id.bad15:
                name = "Tania Afroze\nProfessor";
                number = "00000000000";
                break;

            case R.id.bad16:
                name = "Dr. Tarun Kanti Bose\nProfessor";
                number = "01911451044";
                break;

            case R.id.bad17:
                name = "Mir Sohrab Hossain\nAssociate Professor";
                number = "01911688788";
                break;

            case R.id.bad18:
                name = "Md. Enamul Haque\nAssociate Professor ";
                number = "00000000000";
                break;

            case R.id.bad19:
                name = "S. M. Arifuzzaman\nAssociate Professor ";
                number = "0417201713";
                break;

            case R.id.bad20:
                name = "Md. Reaz Uddin\nAssociate Professor";
                number = "00000000000";
                break;

            case R.id.bad21:
                name = "Protap Kumar Ghosh\nAssociate Professor";
                number = "01722375730";
                break;

            case R.id.bad22:
                name = "Nusrat Zahan Lopa\nAssociate Professor ";
                number = "00000000000";
                break;
            case R.id.bad23:
                name = "Md. Mourtuza Ahamed\nAssociate Professor";
                number = "01711464303";
                break;
            case R.id.bad24:
                name = "Rafia Zaman\\nAssistant Professor";
                number = "00000000000";
                break;


        }

        Intent intent = new Intent(this, TeacherProfile.class);
        intent.putExtra("name", name);
        intent.putExtra("number", number);
        startActivity(intent);
    }


}
