package com.example.appplanteumaarvore.model.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import com.example.appplanteumaarvore.model.entity.Usuario;

@Dao
public interface UsuarioDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void cadastrarUsuario(Usuario usuario);

    @Query("SELECT * FROM tab_usuario WHERE nome LIKE :nome " +
            "AND email LIKE :email AND senha LIKE :senha")
    Usuario verificarUsuario(String nome, String email, String senha);

}
