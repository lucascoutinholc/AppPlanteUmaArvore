package com.example.appplanteumaarvore.model.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.appplanteumaarvore.model.dao.UsuarioDao;
import com.example.appplanteumaarvore.model.entity.Usuario;

@Database(entities = {Usuario.class}, version = 1, exportSchema = true)
public abstract class BancoUsuario extends RoomDatabase {

    public abstract UsuarioDao criarBanco();

}
