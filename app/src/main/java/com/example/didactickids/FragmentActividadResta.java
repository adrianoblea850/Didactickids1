package com.example.didactickids;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

public class FragmentActividadResta extends Fragment {
    EditText sumnum1,sumnum2;
    TextView tvresultado;
    private int num1 = 5;
    private int num2 = 3;


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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_actividad_resta, container, false);
        sumnum1 =  view.findViewById(R.id.sumnum1);
        sumnum2 = view.findViewById(R.id.sumnum2);
        tvresultado =  view.findViewById(R.id.tvresultado);
        return view;
    }
    public void verificar(View view){
        int num1_input = Integer.parseInt(sumnum1.getText().toString());
        int num2_input = Integer.parseInt(sumnum2.getText().toString());
        if (num1_input == num1 && num2_input == num2) {
            tvresultado.setText("8 Respuesta Correcta");
        } else {
            tvresultado.setText("Respuesta Incorrecta");
        }

    }
}