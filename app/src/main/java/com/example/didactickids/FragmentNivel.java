package com.example.didactickids;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;

public class FragmentNivel extends Fragment {
    Button btnFacil,btnMedio,btnDificil;
    private int dificultadActual = 1; // 1 = fácil, 2 = medio, 3 = difícil


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView =  inflater.inflate(R.layout.fragment_nivel, container, false);
        btnFacil = rootView.findViewById(R.id.button5);
        btnMedio = rootView.findViewById(R.id.button6);
        btnDificil = rootView.findViewById(R.id.button7);

       /* actualizarEjercicios();


        btnFacil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cambiarDificultad(1);
            }
        });

        btnMedio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cambiarDificultad(2);
            }
        });

        btnDificil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cambiarDificultad(3);
            }
        });

        return rootView;
    }
    public void actualizarEjercicios() {
        // Obtener una lista de ejercicios según la dificultad actual
        List<Ejercicio> ejercicios = obtenerEjerciciosSegunDificultad();

        // Actualizar la vista para mostrar los nuevos ejercicios
        RecyclerView recyclerView = rootView.findViewById(R.id.button5);
        EjercicioAdapter adapter = new EjercicioAdapter(ejercicios);
        recyclerView.setAdapter(adapter);
    }


    public List<Ejercicio> obtenerEjerciciosSegunDificultad() {
        // Obtener los ejercicios apropiados según la dificultad actual
        switch (dificultadActual) {
            case 1:
                return obtenerEjerciciosFaciles();
            case 2:
                return obtenerEjerciciosMedios();
            case 3:
                return obtenerEjerciciosDificiles();
            default:
                throw new IllegalArgumentException("Dificultad no válida: " + dificultadActual);
        }
    }

    private void cambiarDificultad(int nuevaDificultad) {
        // Cambiar la dificultad actual seleccionada y actualizar los ejercicios
        dificultadActual = nuevaDificultad;
        actualizarEjercicios();
    }

    // Métodos para obtener los ejercicios apropiados según la dificultad
    private List<Ejercicio> obtenerEjerciciosFaciles() {
        // Retorna los ejercicios fáciles
        return new ArrayList<Ejercicio>();
    }

    private List<Ejercicio> obtenerEjerciciosMedios() {
        // Retorna los ejercicios medianos
        return new ArrayList<Ejercicio>();
    }

    public List<Ejercicio> obtenerEjerciciosDificiles() {
        // Retorna los ejercicios difíciles
        return new ArrayList<Ejercicio>();
    }*/


}