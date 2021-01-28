package com.example.appplanteumaarvore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class SegundaActivity extends AppCompatActivity {

    CheckBox checkBoxJacaranda, checkBoxIpe, checkBoxQuaresmeira;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        checkBoxJacaranda = findViewById(R.id.checkJacaranda);
        checkBoxIpe = findViewById(R.id.checkIpe);
        checkBoxQuaresmeira = findViewById(R.id.checkQuaresmeira);
    }

    public void comprar(View view) {
        String sementesEscolhidas = "";

        if (checkBoxJacaranda.isChecked()) {
            sementesEscolhidas += " Jacarandá. ";
        }
        if (checkBoxIpe.isChecked()) {
            sementesEscolhidas += " Ipê Amarelo. ";
        }
        if (checkBoxQuaresmeira.isChecked()) {
            sementesEscolhidas += " Quaresmeira. ";
        }

        Toast.makeText(this, "A(s) semente(s) escolhida(s) foi/foram:" + sementesEscolhidas,
                Toast.LENGTH_LONG).show();

        Intent intent = new Intent(this, TerceiraActivity.class);
        startActivity(intent);
    }
}