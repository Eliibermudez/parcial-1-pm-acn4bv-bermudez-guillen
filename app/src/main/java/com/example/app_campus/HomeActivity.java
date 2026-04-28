package com.example.app_campus;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    private LinearLayout cardGrupos;
    private LinearLayout cardMaterias;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        cardMaterias = findViewById(R.id.cardMaterias);

        cardMaterias.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, MateriasActivity.class);
            startActivity(intent);
        });

        cardGrupos = findViewById(R.id.cardGrupos);

        cardGrupos.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, GruposActivity.class);
            startActivity(intent);
        });
    }
}