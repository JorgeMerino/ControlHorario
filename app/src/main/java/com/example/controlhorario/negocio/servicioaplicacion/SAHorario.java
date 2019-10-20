package com.example.controlhorario.negocio.servicioaplicacion;

import com.example.controlhorario.negocio.entidad.RegistroHorario;

import java.util.List;

public interface SAHorario {
    public long guardarHorario(RegistroHorario registroHorario);
    public List<RegistroHorario> getRegistrosHorarios();
}
