package com.example.controlhorario.negocio.factoria;

import android.content.Context;

import com.example.controlhorario.negocio.servicioaplicacion.SAHorario;
import com.example.controlhorario.negocio.servicioaplicacion.SAHorarioImp;

public class FactoriaNegocioImp extends FactoriaNegocio {
    public SAHorario getSAHorario(Context contexto){
        return new SAHorarioImp(contexto);
    }
}
