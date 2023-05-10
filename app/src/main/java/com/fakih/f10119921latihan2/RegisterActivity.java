package com.fakih.f10119921latihan2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;

import android.os.Bundle;
// Nama : Fakih Syafalik
// Kelas : IF-10K
// Tgl Pengerjaan : 09 Mei 2023
public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void Pindah(View view) {
        Intent intent = new Intent(RegisterActivity.this, AlmostActivity.class);
        startActivity(intent);
    }
}