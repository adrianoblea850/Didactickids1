package com.example.didactickids;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentLeccionMultiplicacion#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentLeccionMultiplicacion extends Fragment {



    public FragmentLeccionMultiplicacion() {
        // Required empty public constructor
    }

    public static FragmentLeccionMultiplicacion newInstance(String param1, String param2) {
        FragmentLeccionMultiplicacion fragment = new FragmentLeccionMultiplicacion();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_leccion_multiplicacion, container, false);
        Button actMulti = view.findViewById(R.id.actMulti);
        actMulti.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                fragmentTransaction.replace(R.id.fragment_container,new FragmentActividadMultiplicacion());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        return  view;
    }
}