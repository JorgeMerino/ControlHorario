package com.example.controlhorario.presentacion.registros;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.controlhorario.R;
import com.example.controlhorario.negocio.entidad.RegistroHorario;

import java.util.List;

public class RegistroHorarioFragment extends Fragment {

    private RegistroHorarioViewModel registroHorarioViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        registroHorarioViewModel = ViewModelProviders.of(this).get(RegistroHorarioViewModel.class);
        View root = inflater.inflate(R.layout.fragment_registros, container, false);
        final ListView listaRegistros = root.findViewById(R.id.list_registross);

        registroHorarioViewModel.getLista().observe(this, new Observer<List<RegistroHorario>>() {
            @Override
            public void onChanged(@Nullable List<RegistroHorario> listaRegHorario) {
                ArrayAdapter<RegistroHorario> adaptador = new ArrayAdapter<RegistroHorario>(getActivity(), android.R.layout.simple_list_item_1, listaRegHorario);
                listaRegistros.setAdapter(adaptador);
            }
        });

        return root;
    }
}