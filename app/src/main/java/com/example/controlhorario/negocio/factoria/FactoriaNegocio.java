package com.example.controlhorario.negocio.factoria;

import android.content.Context;

import com.example.controlhorario.negocio.servicioaplicacion.SAHorario;

public abstract class FactoriaNegocio {
    private static final FactoriaNegocio instancia = new FactoriaNegocioImp();

    public static FactoriaNegocio getInstance() {
        return instancia;
    }

    public abstract SAHorario getSAHorario(Context contexto);
}
