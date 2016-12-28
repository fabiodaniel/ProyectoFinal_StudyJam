package com.example.daniel.intercambio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String password = "12345";

    private EditText nroPart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        nroPart = (EditText) findViewById(R.id.nroPart);
    }
    public void registrar(View v) {

        Intent intent = new Intent(getApplicationContext(), Registro.class);
        intent.putExtra("nom", nroPart.getText().toString());
        startActivity(intent);
    }
}
