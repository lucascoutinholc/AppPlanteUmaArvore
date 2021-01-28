package com.example.appplanteumaarvore;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Usuario.class}, version = 1, exportSchema = true)
public abstract class BancoUsuario extends RoomDatabase {

    public abstract UsuarioDao criarBanco();

}
