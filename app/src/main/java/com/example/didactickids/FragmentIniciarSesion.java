package com.example.didactickids;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.didactickids.databinding.FragmentCrearCuentaBinding;
import com.example.didactickids.databinding.FragmentIniciarSesionBinding;

public class FragmentIniciarSesion extends Fragment {

    FragmentIniciarSesionBinding binding;
    DataBaseHelper dataBase;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = FragmentIniciarSesionBinding.inflate(getLayoutInflater());
        binding.getRoot();
        dataBase = new DataBaseHelper(this.getContext());
        binding.btniniciarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = binding.nombreUsuarioIS.getText().toString();
                String password = binding.ContrasenaIS.getText().toString();

                if (email.equals("") || password.equals(""))
                    Toast.makeText(getActivity(), "Debe de llenar todos los campos", Toast.LENGTH_SHORT).show();
                else {
                    //Boolean revisarDatos = DataBaseHelper.revisarNombreUsuario(email,password);
                }
            }
        });

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_iniciar_sesion, container, false);
        //binding = FragmentIniciarSesionBinding.inflate(getLayoutInflater());
        //setContentView(binding.getRoot());
        //binding.getRoot();
        //dataBase = new DataBaseHelper(this.getContext());
    }
}