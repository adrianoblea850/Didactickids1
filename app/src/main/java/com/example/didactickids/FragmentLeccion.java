package com.example.didactickids;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.net.URI;

public class FragmentLeccion extends Fragment {

    private TextView t;

    Button _btn_suma,btnresta;
    String _url="https://www.youtube.com/watch?v=eLoJWiucZJE";
    String _url1="https://www.youtube.com/watch?v=dxBUiU0J9sg";
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView =  inflater.inflate(R.layout.fragment_leccion, container, false);

        _btn_suma = rootView.findViewById(R.id.btn_suma);
        btnresta = rootView.findViewById(R.id.btn_resta);


        _btn_suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri _link = Uri.parse(_url);
                Intent i = new Intent(Intent.ACTION_VIEW,_link);
                startActivity(i);

                //Log.d("Click", "ok");
            }
        });

        btnresta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri _link = Uri.parse(_url1);
                Intent i = new Intent(Intent.ACTION_VIEW,_link);
                startActivity(i);

                //Log.d("Click", "ok");
            }
        });
        return  rootView;


    }


}
