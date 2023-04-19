package com.example.didactickids;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.didactickids.databinding.FragmentIniciarSesionBinding;

public class FragmentIniciarSesion extends Fragment {

    //FragmentIniciarSesionBinding binding;
    DataBaseHelper dataBase;
    Button  btniniciarSesion,btncrearr;
    TextView crearCuenta;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /**binding = FragmentIniciarSesionBinding.inflate(getLayoutInflater());
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
        });**/

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_iniciar_sesion, container, false);
        //binding = FragmentIniciarSesionBinding.inflate(getLayoutInflater());
        //setContentView(binding.getRoot());
        //binding.getRoot();
        //dataBase = new DataBaseHelper(this.getContext());
        btniniciarSesion = view.findViewById(R.id.btniniciarSesion);
        crearCuenta = view.findViewById(R.id.crearCuenta);
    btniniciarSesion.setOnClickListener(new View.OnClickListener() {
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
    crearCuenta.setOnClickListener(new View.OnClickListener() {
        public void onClick (View view){
                //FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
                //FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                //fragmentTransaction.replace(R.id.fragment_container,new Menu());
                //fragmentTransaction.addToBackStack(null);
                //fragmentTransaction.commit();
            Intent intento = new Intent(getActivity(), Cuenta.class);
            startActivity(intento);
        }
    });
    return view;
    }
}