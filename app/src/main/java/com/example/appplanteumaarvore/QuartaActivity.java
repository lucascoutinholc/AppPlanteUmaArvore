package com.example.appplanteumaarvore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class QuartaActivity extends AppCompatActivity {

    private ListView ranking;
    private ArrayAdapter<String> arrayAdapterRanking;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quarta);

        ranking = findViewById(R.id.ranking);
        arrayAdapterRanking = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, popularRanking());
        ranking.setAdapter(arrayAdapterRanking);
    }

    private ArrayList<String> popularRanking() {
        ArrayList<String> ranking = new ArrayList<>();
        ranking.add("1                                  Júlia                        26");
        ranking.add("2                                 Roberto                       24");
        ranking.add("3                                 Cláudia                       22");
        return ranking;
    }
}