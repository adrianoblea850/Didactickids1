package com.example.didactickids;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public abstract class MainActivity extends AppCompatActivity implements  View.OnClickListener{
    EditText txt1, txt2;
    Button btnCalcular;
    TextView txtResultados;
    @Override
    protected void onCreate(Bundle savedInstanceState){
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
}