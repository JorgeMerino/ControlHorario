package com.example.controlhorario.presentacion.registros;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.controlhorario.negocio.entidad.RegistroHorario;
import com.example.controlhorario.negocio.factoria.FactoriaNegocio;
import com.example.controlhorario.negocio.servicioaplicacion.SAHorario;

import java.util.List;

public class RegistroHorarioViewModel extends AndroidViewModel {

    private MutableLiveData<List<RegistroHorario>> ldRegistros;

    public RegistroHorarioViewModel(@NonNull Application aplicacion) {
        super(aplicacion);

        SAHorario saHorario = FactoriaNegocio.getInstance().getSAHorario(aplicacion);
        List<RegistroHorario> registroHorario = saHorario.getRegistrosHorarios();


        ldRegistros = new MutableLiveData<>();
        ldRegistros.setValue(registroHorario);
    }

    public LiveData<List<RegistroHorario>> getLista() {
        return ldRegistros;
    }
}