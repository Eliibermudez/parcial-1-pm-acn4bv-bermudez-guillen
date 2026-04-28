package com.example.app_campus;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class GruposActivity extends AppCompatActivity {

    private Button btnCrearGrupo;
    private LinearLayout contenedorListaGrupos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grupos);

        btnCrearGrupo = findViewById(R.id.btnCrearGrupo);
        contenedorListaGrupos = findViewById(R.id.contenedorListaGrupos);

        btnCrearGrupo.setOnClickListener(v -> crearGrupoDinamico());
    }

    private void crearGrupoDinamico() {
        LinearLayout cardGrupo = new LinearLayout(this);
        cardGrupo.setOrientation(LinearLayout.VERTICAL);
        cardGrupo.setPadding(24, 20, 24, 20);
        cardGrupo.setBackgroundResource(R.drawable.bg_card);

        LinearLayout.LayoutParams parametrosCard = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );

        parametrosCard.setMargins(0, 0, 0, 20);
        cardGrupo.setLayoutParams(parametrosCard);

        TextView tituloGrupo = new TextView(this);
        tituloGrupo.setText(getString(R.string.grupo_creado_titulo));
        tituloGrupo.setTextSize(16);
        tituloGrupo.setTextColor(0xFF222222);
        tituloGrupo.setTypeface(null, android.graphics.Typeface.BOLD);

        TextView detalleGrupo = new TextView(this);
        detalleGrupo.setText(getString(R.string.grupo_creado_detalle));
        detalleGrupo.setTextSize(13);
        detalleGrupo.setTextColor(0xFF666666);

        cardGrupo.addView(tituloGrupo);
        cardGrupo.addView(detalleGrupo);

        contenedorListaGrupos.addView(cardGrupo);
    }
}