package com.example.appplanteumaarvore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TerceiraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terceira);
    }

    public void verRanking(View view) {
        Intent intent = new Intent(this, QuartaActivity.class);
        startActivity(intent);
    }
}