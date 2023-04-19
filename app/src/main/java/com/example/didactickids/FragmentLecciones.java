package com.example.didactickids;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FragmentLecciones extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView =  inflater.inflate(R.layout.fragment_lecciones, container, false);
        //Button _btn_suma = rootView.findViewById(R.id.btn_suma);
        Button btnsuma = rootView.findViewById(R.id.btnSuma);
        Button btnResta = rootView.findViewById(R.id.btnResta);
        Button btnMUltiplicacion = rootView.findViewById(R.id.btnMultiplicacion);
        Button btnDivision = rootView.findViewById(R.id.btnDivision);


   btnResta.setOnClickListener(new View.OnClickListener() {
        public void onClick(View view){
            FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

            //FragmentLeccionResta fragmento= new FragmentLeccionResta();
            fragmentTransaction.replace(R.id.fragment_container,new FragmentLeccionResta());
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();

        }
   });
   btnsuma.setOnClickListener(new View.OnClickListener() {
        public void onClick(View view){
            FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

            fragmentTransaction.replace(R.id.fragment_container,new fragment_leccion_suma());
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
       });
   btnMUltiplicacion.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view){
            FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

            fragmentTransaction.replace(R.id.fragment_container,new FragmentLeccionMultiplicacion());
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    });
   btnDivision.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                fragmentTransaction.replace(R.id.fragment_container,new FragmentLeccionDivision());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
    });
        return  rootView;
    }
}