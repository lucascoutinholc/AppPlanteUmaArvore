package com.example.appplanteumaarvore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SegundaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
    }

    public void comprar(View view) {
        Intent intent = new Intent(this, TerceiraActivity.class);
        startActivity(intent);
    }
}