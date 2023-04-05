package com.example.didactickids;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentAjustesLecciones#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentAjustesLecciones extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    String ultimobotonPulsado;

    public FragmentAjustesLecciones() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentAjustesLecciones.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentAjustesLecciones newInstance(String param1, String param2) {
        FragmentAjustesLecciones fragment = new FragmentAjustesLecciones();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_ajustes_lecciones, container, false);
        Button guardar = rootView.findViewById(R.id.btnG);
        ImageButton principiante = rootView.findViewById(R.id.principiante);
        ImageButton intermedio = rootView.findViewById(R.id.intermedio);
        ImageButton avanzado = rootView.findViewById(R.id.avanzado);




        guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrarToast();
            }
        });
        principiante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ultimobotonPulsado = "Principiante";
                Toast.makeText(getActivity(), "ha seleccionado la dificultad principiante", Toast.LENGTH_SHORT).show();
            }
        });

        intermedio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ultimobotonPulsado = "Intermedia";
                Toast.makeText(getActivity(), "ha seleccionado la dificultad intermedia", Toast.LENGTH_SHORT).show();
            }
        });
        avanzado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ultimobotonPulsado = "Avanzada";
                Toast.makeText(getActivity(), "ha seleccionado la dificultad avanzada", Toast.LENGTH_SHORT).show();
            }
        });









        return rootView;



    }
    public void mostrarToast() {
        Toast.makeText(getActivity(), "Se ha guardado la dificultad:"+ultimobotonPulsado , Toast.LENGTH_SHORT).show();
    }
}