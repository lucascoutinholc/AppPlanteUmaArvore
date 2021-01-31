package com.example.appplanteumaarvore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import com.example.appplanteumaarvore.model.dao.UsuarioDao;
import com.example.appplanteumaarvore.model.database.BancoUsuario;

public class MainActivity extends AppCompatActivity {

    EditText editTextNome, editTextEmail, editTextSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNome = findViewById(R.id.textoNome);
        editTextEmail = findViewById(R.id.textoEmail);
        editTextSenha = findViewById(R.id.textoSenha);
    }

    public void entrar(View view) {
        String nomeDigitado = editTextNome.getText().toString();
        String emailDigitado = editTextEmail.getText().toString();
        String senhaDigitado = editTextSenha.getText().toString();

        BancoUsuario bu = Room.databaseBuilder(this, BancoUsuario.class,
                "bd-app").allowMainThreadQueries().build();

        UsuarioDao uDao = bu.criarBanco();
        if (uDao.verificarUsuario(nomeDigitado, emailDigitado, senhaDigitado) != null) {
            Toast.makeText(this, "Bem vindo, " + nomeDigitado, Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(this, SegundaActivity.class);
            startActivity(intent);

            bu.close();
        } else {
            Toast.makeText(this, "Usuário não cadastrado! " +
                    "Se cadastre no link acima!", Toast.LENGTH_SHORT).show();

            bu.close();

            editTextNome.setText("");
            editTextEmail.setText("");
            editTextSenha.setText("");
        }
    }

    public void abrirCadastro(View view) {
        Intent intent = new Intent(this, CadastroActivity.class);
        startActivity(intent);
    }
}