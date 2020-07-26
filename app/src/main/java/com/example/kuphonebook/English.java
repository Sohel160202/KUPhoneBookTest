package com.example.kuphonebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class English extends AppCompatActivity {

    public String name, number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english);
    }

    public void click(View view) {
        switch (view.getId()) {
            case R.id.eng1:
                name = "Dr. Md. Emdadul Huq \\n Professor";
                number = "01912815110";
                break;


            case R.id.eng2:
                name = "Dr. Ahmed Ahsanuzzaman \\nProfessor";
                number = "01715387868";
                break;

            case R.id.eng3:
                name = "Dr. A R M Mostafizar Rahman \\n Professor";
                number = "01715299422";
                break;

            case R.id.eng4:
                name = "Dr. Sabiha Huq \\n Professor";
                number = "01914067565";
                break;

            case R.id.eng5:
                name = "Dr. Md. Shahjahan Kabir \n Professor";
                number = "01712023427";
                break;

            case R.id.eng6:
                name = "Dr. Abdur Rahman Shahin \\n Professor";
                number = "01712898860";
                break;

            case R.id.eng7:
                name = "Md. Samyul Haque \\n Professor";
                number = "01781656344";
                break;

            case R.id.eng8:
                name = "Sk Abdullah al Mamun \\n Professor";
                number = "01712207373";
                break;

            case R.id.eng9:
                name = "G.M. Javed Arif \n Associate Professor";
                number = "01914067562";
                break;

            case R.id.eng10:
                name = "Md. Sarwar Jahan \\n Associate Professor";
                number = "01914067563";
                break;
            case R.id.eng11:
                name = "Dr.Shayla Sharmin Snigdha \\n Associate Professor";
                number = "01703851545";
                break;

            case R.id.eng12:
                name = "Md. Nuruzzaman\\n Associate Professor";
                number = "01763453388";
                break;

            case R.id.eng13:
                name = "Molla Azizur Rahman \\n Associate Professor";
                number = "01712087465";
                break;

            case R.id.eng14:
                name = "Md Firoz Mahmud Ahsan \\n Associate Professor";
                number = "01772556015";
                break;

            case R.id.eng15:
                name = "Nahid Afroz \\n Associate Professor";
                number = "01793595208";
                break;

            case R.id.eng17:
                name = "Rumana Rahman \\n Assistant Professor";
                number = "01717011019";
                break;

            case R.id.eng16:
                name = "Dr. U. H. Ruhina Jesmin \\n Associate Professor";
                number = "01748318402";
                break;

            case R.id.eng18:
                name = "A.B.M. Monirul Huq \\n Assistant Professor";
                number = "01717669194";
                break;

            case R.id.eng19:
                name = "Hamalna Nizam \\n Assistant Professor";
                number = "01715144024";
                break;

            case R.id.eng20:
                name = "AishaRahman Asha \n Assistant Professor";
                number = "01711450205";
                break;


        }

        Intent intent = new Intent(this, TeacherProfile.class);
        intent.putExtra("name", name);
        intent.putExtra("number", number);
        startActivity(intent);
    }


}
