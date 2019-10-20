package com.example.controlhorario.integracion.bd;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import com.example.controlhorario.integracion.dao.DAOHorario;
import com.example.controlhorario.negocio.conversor.ConversorDatos;
import com.example.controlhorario.negocio.entidad.RegistroHorario;

@Database(entities = {RegistroHorario.class}, version = 1)
@TypeConverters({ConversorDatos.class})
public abstract class ControlHorarioBD extends RoomDatabase {

    private static volatile ControlHorarioBD instancia;

    public static ControlHorarioBD getInstancia(final Context contexto) {
        if (instancia == null) {
            synchronized (ControlHorarioBD.class) {
                if (instancia == null) {
                    instancia = Room.databaseBuilder(contexto.getApplicationContext(),
                            ControlHorarioBD.class, "controlHorario")
                            .allowMainThreadQueries().build();
                }
            }
        }
        return instancia;
    }

    public abstract DAOHorario getDaoHorario();
}
