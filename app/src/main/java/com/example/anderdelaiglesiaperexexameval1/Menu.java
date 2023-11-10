package com.example.anderdelaiglesiaperexexameval1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Menu extends AppCompatActivity {

    ImageView imgBarakaldo, imgSanturtzi, imgSestao, imgPortu;

    int contBarakaldo = 0;
    int contPortugalete = 0;
    int contSestao = 0;
    int contSanturtzi = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        imgBarakaldo = findViewById(R.id.imgBarakaldo);
        imgSanturtzi = findViewById(R.id.imgSanturtzi);
        imgSestao = findViewById(R.id.imgSestao);
        imgPortu = findViewById(R.id.imgPortu);

        Lugar barkaldo = new Lugar("Barakaldo", "Barakaldo Top 1", contBarakaldo, R.drawable.barakaldo);
        Lugar portugalete = new Lugar("Portugalete", "Portugalete cuidad de mayores", contPortugalete, R.drawable.portugalete);
        Lugar sestao = new Lugar("Sestao", "Hay un Carrefur", contSestao, R.drawable.sestao);
        Lugar santurtzi = new Lugar("Santurtzi", "Buenas vistas", contSanturtzi, R.drawable.santurtzi);

        imgBarakaldo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, Informacion.class);
                intent.putExtra("barkaldo", barkaldo);
                startActivity(intent);
            }
        });

        imgSanturtzi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, Informacion.class);
                intent.putExtra("santurtzi", santurtzi);
                startActivity(intent);
            }
        });

        imgSestao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, Informacion.class);
                intent.putExtra("sestao", sestao);
                startActivity(intent);
            }
        });

        imgPortu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, Informacion.class);
                intent.putExtra("portugalete", portugalete);
                startActivity(intent);
            }
        });
    }
}