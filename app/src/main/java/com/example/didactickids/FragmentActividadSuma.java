/*package com.example.didactickids;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public  class FragmentActividadSuma extends Fragment implements  View.OnClickListener{
    EditText txt1, txt2;
    Button btnCalcular;
    TextView txtResultados;
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt1=(EditText) findViewById(R.id.txt1);
        txt2=(EditText) findViewById(R.id.txt2);
        txtResultados=(TextView) findViewById(R.id.txtResultados);
        btnCalcular=(Button) findViewById(R.id.bntCalcular);
        btnCalcular.setOnClickListener(this);
    }

    public void onClick(View v){
        int valor1 = Integer.parseInt(txt1.getText().toString());
        int valor2 = Integer.parseInt(txt2.getText().toString());
        int r = valor1 + valor2;

        txtResultados.setText("La suma es: "+r);
    }
}*/
package com.example.didactickids;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FragmentActividadSuma extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_actividad_suma, container, false);
        EditText txt1 = rootView.findViewById(R.id.txt1);
        EditText txt2 = rootView.findViewById(R.id.txt2);
        TextView txtResultados= rootView.findViewById(R.id.txtResultados);
        Button btnCalcular= rootView.findViewById(R.id.bntCalcular);



        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int valor1 = Integer.parseInt(txt1.getText().toString());
                int valor2 = Integer.parseInt(txt2.getText().toString());
                int r = valor1 + valor2;

                txtResultados.setText("La suma es: "+r);

            }


        });
        return rootView;


    }

}