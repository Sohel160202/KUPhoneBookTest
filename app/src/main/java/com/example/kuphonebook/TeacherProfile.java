package com.example.kuphonebook;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class TeacherProfile extends AppCompatActivity {

    public TextView name, number;
    public ImageView copy, phone;
    private static final int REQUEST_CALL = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_profile);

        name = findViewById(R.id.Name);
        number = findViewById(R.id.MobileNumber);

        copy = findViewById(R.id.COPY);
        phone = findViewById(R.id.PHONE);

        name.setText(getIntent().getStringExtra("name"));
        number.setText(getIntent().getStringExtra("number"));

        copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String value = String.valueOf(number);

                if (value.isEmpty()) {
                    Toast.makeText(TeacherProfile.this, "No Number", Toast.LENGTH_SHORT).show();
                } else {
                    ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                    ClipData clipData = ClipData.newPlainText("Data", value);
                    clipboardManager.setPrimaryClip(clipData);
                    Toast.makeText(TeacherProfile.this, "Number Copied", Toast.LENGTH_SHORT).show();
                }
            }
        });

        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phonenumber = number.getText().toString();

                if (phonenumber.isEmpty()) {
                    Toast.makeText(TeacherProfile.this, "No Phone Number", Toast.LENGTH_LONG).show();
                } else {
                    if (ContextCompat.checkSelfPermission(TeacherProfile.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(TeacherProfile.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                    }
                    String dial = "tel:" + phonenumber;
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse(dial));
                    startActivity(intent);
                }
            }
        });


    }


    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if (requestCode == REQUEST_CALL) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                Toast.makeText(TeacherProfile.this, "Permission Accepted", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(TeacherProfile.this, "Permission Denied", Toast.LENGTH_SHORT).show();
            }
        }
    }
}

