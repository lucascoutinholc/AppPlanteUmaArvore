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
import com.example.appplanteumaarvore.model.entity.Usuario;

public class CadastroActivity extends AppCompatActivity {

    EditText editTextNome, editTextEndereco, editTextEmail, editTextSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        editTextNome = findViewById(R.id.cadastroNome);
        editTextEndereco = findViewById(R.id.cadastroEndereco);
        editTextEmail = findViewById(R.id.cadastroEmail);
        editTextSenha = findViewById(R.id.cadastroSenha);
    }

    public void cadastrar(View view) {
        String nomeDigitado = editTextNome.getText().toString();
        String enderecoDigitado = editTextEndereco.getText().toString();
        String emailDigitado = editTextEmail.getText().toString();
        String senhaDigitado = editTextSenha.getText().toString();

        BancoUsuario bu = Room.databaseBuilder(this, BancoUsuario.class,
                "bd-app").allowMainThreadQueries().build();

        Usuario usuario = new Usuario();
        usuario.setNome(nomeDigitado);
        usuario.setEndereco(enderecoDigitado);
        usuario.setEmail(emailDigitado);
        usuario.setSenha(senhaDigitado);

        UsuarioDao uDao = bu.criarBanco();
        uDao.cadastrarUsuario(usuario);

        Toast.makeText(this, "Usuário cadastrado com sucesso!", Toast.LENGTH_SHORT).show();

        bu.close();

        Intent intent = new Intent(this, SegundaActivity.class);
        startActivity(intent);
    }
}