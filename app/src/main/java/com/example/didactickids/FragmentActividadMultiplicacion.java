package com.example.didactickids;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

public class FragmentActividadMultiplicacion extends Fragment {
    EditText multinum1,multinum2;
    TextView tvresultadomulti,tvcorrectomultplicacion;
    private int num1;
    private int num2;


    public FragmentActividadMultiplicacion() {

    }

    public static FragmentActividadMultiplicacion newInstance(String param1, String param2) {
        FragmentActividadMultiplicacion fragment = new FragmentActividadMultiplicacion();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_actividad_multiplicacion, container, false);
        multinum1 =  view.findViewById(R.id.multinum1);
        multinum2 = view.findViewById(R.id.multinum2);
        tvresultadomulti =  view.findViewById(R.id.tvresultadomulti);
        tvcorrectomultplicacion = view.findViewById(R.id.tvcorrectomultplicacion);
        return view;
    }
    public void verificar(View view){
        int num1 = Integer.parseInt(multinum1.getText().toString());
        int num2 = Integer.parseInt(multinum2.getText().toString());
        int multiplicacion =num1+num2;
        if (multiplicacion == 20) {
            tvresultadomulti.setText(multiplicacion);
            tvcorrectomultplicacion.setText("Respuesta Correcta");
        } else {
            tvresultadomulti.setText(multiplicacion);
            tvresultadomulti.setText("Respuesta Incorrecta");
        }

    }
}