package com.fakih.f10119921latihan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
// Nama : Fakih Syafalik
// Kelas : IF-10K
// Tgl Pengerjaan : 09 Mei 2023
public class AlmostActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almost);
    }

    public void Pindah(View view) {
        Intent intent = new Intent(AlmostActivity.this, VerifyActivity.class);
        startActivity(intent);
    }
}