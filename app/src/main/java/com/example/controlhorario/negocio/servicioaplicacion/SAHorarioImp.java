package com.example.controlhorario.negocio.servicioaplicacion;

import android.content.Context;

import com.example.controlhorario.integracion.bd.ControlHorarioBD;
import com.example.controlhorario.integracion.dao.DAOHorario;
import com.example.controlhorario.negocio.entidad.RegistroHorario;

import java.util.List;

public class SAHorarioImp implements SAHorario {

    private DAOHorario daoHorario;

    public SAHorarioImp(Context contexto){
        ControlHorarioBD bd = ControlHorarioBD.getInstancia(contexto);
        daoHorario = bd.getDaoHorario();
    }

    public long guardarHorario(RegistroHorario registroHorario){
        return daoHorario.insert(registroHorario);
    }

    public List<RegistroHorario> getRegistrosHorarios(){
        return daoHorario.selectAll();
    }
}
