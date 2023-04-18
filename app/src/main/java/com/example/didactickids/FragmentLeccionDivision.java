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
 * Use the {@link FragmentLeccionDivision#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentLeccionDivision extends Fragment {


    public FragmentLeccionDivision() {

    }


    public static FragmentLeccionDivision newInstance(String param1, String param2) {
        FragmentLeccionDivision fragment = new FragmentLeccionDivision();
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
        View view =  inflater.inflate(R.layout.fragment_leccion_division, container, false);
        Button actDivision = view.findViewById(R.id.actDivision);

        actDivision.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                fragmentTransaction.replace(R.id.fragment_container,new FragmentActividadDivision());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
        return  view;
    }
}