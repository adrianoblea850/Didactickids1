package com.example.didactickids;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FragmentLecciones extends Fragment {
    private DrawerLayout drawerLayout;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView =  inflater.inflate(R.layout.fragment_leccion, container, false);
        Button _btn_suma = rootView.findViewById(R.id.btn_suma);
        _btn_suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container, new fragment_leccion_suma());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        return  rootView;
    }
    public void cambiarSuma(View view){
        //FragmentManager fragmentManager = getSupportFragmentManager();
        //FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        //FragmentLeccionResta fragmento= new FragmentLeccionResta();
        //fragmentTransaction.add(R.id.,fragmento);
        //fragmentTransaction.commit();
    }


}