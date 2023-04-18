package com.example.didactickids;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

public class FragmentActividadDivision extends Fragment {
    EditText divnum1,divnum2;
    TextView tvresultadodivision,divisioncorrecto;
    private int num1;
    private int num2;


    public FragmentActividadDivision() {
        // Required empty public constructor
    }
    public static FragmentActividadDivision newInstance(String param1, String param2) {
        FragmentActividadDivision fragment = new FragmentActividadDivision();
        Bundle args = new Bundle();
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
        View view = inflater.inflate(R.layout.fragment_actividad_division, container, false);
        divnum1 =  view.findViewById(R.id.divnum1);
        divnum2 = view.findViewById(R.id.divinum2);
        tvresultadodivision =  view.findViewById(R.id.tvresultadodivision);
        divisioncorrecto =  view.findViewById(R.id.divisioncorrecto);
        return view;
    }
    public void verificar(View view){
        int num1 = Integer.parseInt(divnum1.getText().toString());
        int num2 = Integer.parseInt(divnum2.getText().toString());
        int division = num1/num2;
        if (division == 135) {
            tvresultadodivision.setText(division);
            tvresultadodivision.setText("Respuesta Correcta");
        } else {
            tvresultadodivision.setText(division);
            tvresultadodivision.setText("Respuesta Incorrecta");
        }

    }
}