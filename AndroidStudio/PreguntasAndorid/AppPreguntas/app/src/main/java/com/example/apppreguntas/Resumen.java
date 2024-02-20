package com.example.apppreguntas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Resumen extends AppCompatActivity {
    TextView nombre_usuario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumen);

        nombre_usuario = findViewById(R.id.nombre_usuario);

        Intent intencion = getIntent();

        Bundle datos = intencion.getExtras();

        String nombres = datos.getString("nombres");

        nombre_usuario.setText(nombres);

    }
}