package com.example.didactickids;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FragmentActividadMultiplicacion extends Fragment {
    EditText multinum1, multinum2;
    TextView tvresultadomulti, tvcorrectomultplicacion;
    Button resultadomultiplicacion;
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
        multinum1 = view.findViewById(R.id.multinum1);
        multinum2 = view.findViewById(R.id.multinum2);
        tvresultadomulti = view.findViewById(R.id.tvresultadomulti);
        tvcorrectomultplicacion = view.findViewById(R.id.tvcorrectomultplicacion);
        resultadomultiplicacion = view.findViewById(R.id.resultadomultiplicacion);

        resultadomultiplicacion.setOnClickListener(new View.OnClickListener() {
        public void onClick(View view) {
            int num1 = Integer.parseInt(multinum1.getText().toString());
            int num2 = Integer.parseInt(multinum2.getText().toString());
            int multiplicacion = num1 * num2;
            if (multiplicacion == 20) {
                tvresultadomulti.setText("La suma es: "+multiplicacion);
                tvcorrectomultplicacion.setText("Respuesta Correcta");
            } else {
                tvresultadomulti.setText("La suma es: "+multiplicacion);
                tvcorrectomultplicacion.setText("Respuesta Incorrecta");
            }

        }
    });
    return view;
    }
}