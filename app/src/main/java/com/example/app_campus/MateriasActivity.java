package com.example.app_campus;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MateriasActivity extends AppCompatActivity {

    private LinearLayout listaMaterias;

    String[] materias = {
            "Programación I",
            "Base de Datos",
            "Matemática",
            "Arquitectura de Computadoras",
            "Aplicaciones Móviles"
    };

    int index = 0;
    int MAX_INICIAL = 2;
    int MAX_TOTAL = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materias);

        listaMaterias = findViewById(R.id.layoutListaMaterias);
        Button btnAgregar = findViewById(R.id.btnAgregar);

        for (int i = 0; i < MAX_INICIAL; i++) {
            agregarCardMateria(materias[index]);
            index++;
        }

        btnAgregar.setOnClickListener(v -> agregarMateria());
    }

    private void agregarMateria() {

        if (index >= MAX_TOTAL) {
            Toast.makeText(this, "Ya agregaste todas las materias", Toast.LENGTH_SHORT).show();
            return;
        }

        agregarCardMateria(materias[index]);

        Toast.makeText(this, "Materia agregada", Toast.LENGTH_SHORT).show();

        index++;
    }

    private void agregarCardMateria(String nombreMateria) {

        LinearLayout card = new LinearLayout(this);
        card.setOrientation(LinearLayout.HORIZONTAL);
        card.setPadding(24, 20, 24, 20);
        card.setBackgroundResource(R.drawable.bg_card);
        card.setGravity(Gravity.CENTER_VERTICAL);

        LinearLayout.LayoutParams paramsCard = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                180
        );
        paramsCard.setMargins(0, 0, 0, 20);
        card.setLayoutParams(paramsCard);

        TextView icono = new TextView(this);
        icono.setText("📘");
        icono.setTextSize(26);
        icono.setGravity(Gravity.CENTER);

        LinearLayout.LayoutParams paramsIcono = new LinearLayout.LayoutParams(120, 120);
        icono.setLayoutParams(paramsIcono);
        icono.setBackgroundColor(0xFFE0D7FF);

        LinearLayout contenedorTexto = new LinearLayout(this);
        contenedorTexto.setOrientation(LinearLayout.VERTICAL);

        LinearLayout.LayoutParams paramsTexto = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        paramsTexto.setMargins(20, 0, 0, 0);
        contenedorTexto.setLayoutParams(paramsTexto);

        TextView titulo = new TextView(this);
        titulo.setText(nombreMateria);
        titulo.setTextSize(16);
        titulo.setTextColor(0xFF222222);
        titulo.setTypeface(null, Typeface.BOLD);

        TextView detalle = new TextView(this);
        detalle.setText("Pendiente de horario");
        detalle.setTextSize(13);
        detalle.setTextColor(0xFF666666);

        contenedorTexto.addView(titulo);
        contenedorTexto.addView(detalle);

        card.addView(icono);
        card.addView(contenedorTexto);

        listaMaterias.addView(card);

        card.setOnClickListener(v ->
                Toast.makeText(this, nombreMateria, Toast.LENGTH_SHORT).show()
        );
    }
}