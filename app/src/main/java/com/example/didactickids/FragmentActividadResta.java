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

public class FragmentActividadResta extends Fragment {
    EditText sumnum1,sumnum2;
    TextView tvresultado,tvcorrectosuma;
    Button resultadosuma;
    private int num1;
    private int num2;


    public FragmentActividadResta() {
        // Required empty public constructor
    }
    public static FragmentActividadResta newInstance(String param1, String param2) {
        FragmentActividadResta fragment = new FragmentActividadResta();
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
        View view = inflater.inflate(R.layout.fragment_actividad_resta, container, false);
        sumnum1 =  view.findViewById(R.id.sumnum1);
        sumnum2 = view.findViewById(R.id.sumnum2);
        tvresultado =  view.findViewById(R.id.tvresultado);
        tvcorrectosuma = view.findViewById(R.id.tvcorrectosuma);
        resultadosuma = view.findViewById(R.id.resultadosuma);

    resultadosuma.setOnClickListener(new View.OnClickListener() {
        public void onClick(View view) {
            int num1 = Integer.parseInt(sumnum1.getText().toString());
            int num2 = Integer.parseInt(sumnum2.getText().toString());
            int suma = num1 + num2;
            if (suma == 8) {
                tvresultado.setText("La suma es: "+suma);
                tvcorrectosuma.setText("Respuesta Correcta");

            } else {
                tvresultado.setText("La suma es:"+suma);
                tvcorrectosuma.setText("Respuesta Incorrecta");
            }
        }
    });
        return view;
    }
}