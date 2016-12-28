package com.example.daniel.intercambio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetalleActivity extends AppCompatActivity {

    private TextView tvNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);
        getSupportActionBar().hide();

        tvNombre = (TextView) findViewById(R.id.tvNombre);

        Bundle bundle = getIntent().getExtras();

        String nombre = bundle.getString("nomUsu", "").toString();

        tvNombre.setText(nombre);
    }
}
