package com.example.controlhorario.negocio.entidad;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.text.SimpleDateFormat;
import java.util.Calendar;

@Entity(tableName = "registroHorario")
public class RegistroHorario {
    @PrimaryKey(autoGenerate = true)
    private long id;
    private Calendar fecha;

    public RegistroHorario(){
        this.fecha = Calendar.getInstance();
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public Calendar getFecha() {
        return fecha;
    }
    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm");
        if(fecha != null){
            return sdf.format(fecha.getTime());
        } else {
            return "Registro nulo";
        }
    }

    public String horaToString() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        if(fecha != null){
            return sdf.format(fecha.getTime());
        } else {
            return "Registro nulo";
        }
    }
}
