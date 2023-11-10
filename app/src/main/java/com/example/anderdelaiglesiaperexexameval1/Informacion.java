package com.example.anderdelaiglesiaperexexameval1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Informacion extends AppCompatActivity {

    Button btnDarLike, btnVolver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion);

        btnDarLike = findViewById(R.id.btnDarLike);
        btnVolver = findViewById(R.id.btnVolver);

        Intent intent = getIntent();

        if (intent.hasExtra("barakaldo")) {
            Lugar barakaldo = (Lugar) intent.getSerializableExtra("barakaldo");

            ImageView imgLugar = findViewById(R.id.imgLugar);
            TextView txtNombre = findViewById(R.id.txtNombre);
            TextView txtTexto = findViewById(R.id.txtTexto);
            TextView txtNumero = findViewById(R.id.txtNumero);

            imgLugar.setImageResource(barakaldo.getImagenResourceId());

            txtNombre.setText(barakaldo.getTitulo());
            txtTexto.setText(barakaldo.getDescripcion());
            txtNumero.setText(barakaldo.getPuntuacion());
        }

        if (intent.hasExtra("santurtzi")) {
            Lugar santurtzi = (Lugar) intent.getSerializableExtra("santurtzi");

            ImageView imgLugar = findViewById(R.id.imgLugar);
            TextView txtNombre = findViewById(R.id.txtNombre);
            TextView txtTexto = findViewById(R.id.txtTexto);
            TextView txtNumero = findViewById(R.id.txtNumero);

            imgLugar.setImageResource(santurtzi.getImagenResourceId());

            txtNombre.setText(santurtzi.getTitulo());
            txtTexto.setText(santurtzi.getDescripcion());
            txtNumero.setText(santurtzi.getPuntuacion());
        }

        if (intent.hasExtra("sestao")) {
            Lugar sestao = (Lugar) intent.getSerializableExtra("sestao");

            ImageView imgLugar = findViewById(R.id.imgLugar);
            TextView txtNombre = findViewById(R.id.txtNombre);
            TextView txtTexto = findViewById(R.id.txtTexto);
            TextView txtNumero = findViewById(R.id.txtNumero);

            imgLugar.setImageResource(sestao.getImagenResourceId());

            txtNombre.setText(sestao.getTitulo());
            txtTexto.setText(sestao.getDescripcion());
            txtNumero.setText(sestao.getPuntuacion());
        }

        if (intent.hasExtra("sestao")) {
            Lugar sestao = (Lugar) intent.getSerializableExtra("sestao");

            ImageView imgLugar = findViewById(R.id.imgLugar);
            TextView txtNombre = findViewById(R.id.txtNombre);
            TextView txtTexto = findViewById(R.id.txtTexto);
            TextView txtNumero = findViewById(R.id.txtNumero);

            imgLugar.setImageResource(sestao.getImagenResourceId());

            txtNombre.setText(sestao.getTitulo());
            txtTexto.setText(sestao.getDescripcion());
            txtNumero.setText(sestao.getPuntuacion());
        }
        btnDarLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Informacion.this, Menu.class);
                startActivity(intent);
            }
        });

        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Informacion.this, Menu.class);
                startActivity(intent);
            }
        });
    }
}