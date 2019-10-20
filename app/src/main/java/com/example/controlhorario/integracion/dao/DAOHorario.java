package com.example.controlhorario.integracion.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.controlhorario.negocio.entidad.RegistroHorario;

import java.util.List;

@Dao
public interface DAOHorario {
    @Insert
    public long insert(RegistroHorario registroHorario);

    @Query("SELECT * FROM registroHorario ORDER BY fecha DESC")
    List<RegistroHorario> selectAll();
}
