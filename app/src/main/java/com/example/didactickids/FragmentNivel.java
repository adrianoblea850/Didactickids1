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

        return  rootView;





    }






}
