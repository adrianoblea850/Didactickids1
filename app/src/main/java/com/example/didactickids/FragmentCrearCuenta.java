package com.example.didactickids;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.didactickids.databinding.FragmentCrearCuentaBinding;

public class FragmentCrearCuenta extends Fragment {
    FragmentCrearCuentaBinding binding;
    DataBaseHelper dataBase;
    Button btnCrearCuenta;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = FragmentCrearCuentaBinding.inflate(getLayoutInflater());
        binding.getRoot();
        dataBase = new DataBaseHelper(this.getContext());

        binding.btnCrearCuenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre = binding.nombreCC.getText().toString();
                String apellido = binding.apellidoCC.getText().toString();
                String email = binding.correoCC.getText().toString();
                String nombreUsuario = binding.nombreUsuarioCC.getText().toString();
                String password = binding.contrasenaCC.getText().toString();

                if (nombre.equals("") || apellido.equals("") || email.equals("") || nombreUsuario.equals("") || password.equals(""))
                    Toast.makeText(getActivity(), "Debe de llenar todos los campos", Toast.LENGTH_SHORT).show();
                else {
                    Boolean insert = dataBase.insertData(nombre, apellido, email, nombreUsuario, password);
                    if (insert == true) {
                        Toast.makeText(getActivity(), "Usuario Creado con exito", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(getActivity(), "Error al crear usuario", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //binding = FragmentCrearCuentaBinding.inflate(getLayoutInflater());
        //setContentView(binding.getRoot());
        //binding.getRoot();
        //dataBase = new DataBaseHelper(this);
        View view = inflater.inflate(R.layout.fragment_crear_cuenta, container, false);
        btnCrearCuenta = view.findViewById(R.id.btnCrearCuenta);

        btnCrearCuenta.setOnClickListener(new View.OnClickListener() {
            public void onClick (View view){
                //FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
                //FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                //fragmentTransaction.replace(R.id.fragment_container,new Menu());
                //fragmentTransaction.addToBackStack(null);
                //fragmentTransaction.commit();
                Intent intent = new Intent(getActivity(), Menu.class);
                startActivity(intent);
            }
        });
        return view;
    }
}