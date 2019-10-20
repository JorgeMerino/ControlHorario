package com.example.controlhorario.negocio.conversor;

import androidx.room.TypeConverter;

import java.util.Calendar;
import java.util.Date;

public class ConversorDatos {
    @TypeConverter
    public static Calendar aCalendar(Long milisegundos) {
        Calendar fecha = Calendar.getInstance();
        if(milisegundos != null){
            fecha.setTimeInMillis(milisegundos);
        } else {
            fecha = null;
        }

        return fecha;
    }

    @TypeConverter
    public static Long aEntero(Calendar fecha) {
        return fecha == null ? null : fecha.getTimeInMillis();
    }

}
