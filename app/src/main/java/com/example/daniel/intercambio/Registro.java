package com.example.daniel.intercambio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Registro extends AppCompatActivity {

    private TextView tvNombre;
    private EditText user1;
    private EditText pass1;
    private EditText user2;
    private EditText pass2;
    private EditText user3;
    private EditText pass3;
    private EditText user4;
    private EditText pass4;
    private EditText user5;
    private EditText pass5;
    private EditText user6;
    private EditText pass6;
    private EditText user7;
    private EditText pass7;
    private EditText user8;
    private EditText pass8;
    private EditText user9;
    private EditText pass9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_registro);

        tvNombre = (TextView) findViewById(R.id.tv_uno);

        Bundle bundle = getIntent().getExtras();

        String nombre = bundle.getString("nom", "").toString();
        int num = Integer.parseInt(nombre);
        if(num==3){
            LinearLayout cuatro = (LinearLayout) findViewById(R.id.fila4);
            cuatro.setVisibility(View.GONE);
            LinearLayout sinco = (LinearLayout) findViewById(R.id.fila5);
            sinco.setVisibility(View.GONE);
            LinearLayout seis = (LinearLayout) findViewById(R.id.fila6);
            seis.setVisibility(View.GONE);
            LinearLayout siete = (LinearLayout) findViewById(R.id.fila7);
            siete.setVisibility(View.GONE);
            LinearLayout ocho = (LinearLayout) findViewById(R.id.fila8);
            ocho.setVisibility(View.GONE);
            LinearLayout nueve = (LinearLayout) findViewById(R.id.fila9);
            nueve.setVisibility(View.GONE);

            user1 = (EditText) findViewById(R.id.usu1);
            pass1 = (EditText) findViewById(R.id.pass1);
            user2 = (EditText) findViewById(R.id.usu2);
            pass2 = (EditText) findViewById(R.id.pass2);
            user3 = (EditText) findViewById(R.id.usu3);
            pass3 = (EditText) findViewById(R.id.pass3);

        }
        if(num==4){
            LinearLayout sinco = (LinearLayout) findViewById(R.id.fila5);
            sinco.setVisibility(View.GONE);
            LinearLayout seis = (LinearLayout) findViewById(R.id.fila6);
            seis.setVisibility(View.GONE);
            LinearLayout siete = (LinearLayout) findViewById(R.id.fila7);
            siete.setVisibility(View.GONE);
            LinearLayout ocho = (LinearLayout) findViewById(R.id.fila8);
            ocho.setVisibility(View.GONE);
            LinearLayout nueve = (LinearLayout) findViewById(R.id.fila9);
            nueve.setVisibility(View.GONE);

            user1 = (EditText) findViewById(R.id.usu1);
            pass1 = (EditText) findViewById(R.id.pass1);
            user2 = (EditText) findViewById(R.id.usu2);
            pass2 = (EditText) findViewById(R.id.pass2);
            user3 = (EditText) findViewById(R.id.usu3);
            pass3 = (EditText) findViewById(R.id.pass3);
            user4 = (EditText) findViewById(R.id.usu4);
            pass4 = (EditText) findViewById(R.id.pass4);

        }
        if(num==5){
            LinearLayout seis = (LinearLayout) findViewById(R.id.fila6);
            seis.setVisibility(View.GONE);
            LinearLayout siete = (LinearLayout) findViewById(R.id.fila7);
            siete.setVisibility(View.GONE);
            LinearLayout ocho = (LinearLayout) findViewById(R.id.fila8);
            ocho.setVisibility(View.GONE);
            LinearLayout nueve = (LinearLayout) findViewById(R.id.fila9);
            nueve.setVisibility(View.GONE);

            user1 = (EditText) findViewById(R.id.usu1);
            pass1 = (EditText) findViewById(R.id.pass1);
            user2 = (EditText) findViewById(R.id.usu2);
            pass2 = (EditText) findViewById(R.id.pass2);
            user3 = (EditText) findViewById(R.id.usu3);
            pass3 = (EditText) findViewById(R.id.pass3);
            user4 = (EditText) findViewById(R.id.usu4);
            pass4 = (EditText) findViewById(R.id.pass4);
            user5 = (EditText) findViewById(R.id.usu5);
            pass5 = (EditText) findViewById(R.id.pass5);

        }
        if(num==6){
            LinearLayout siete = (LinearLayout) findViewById(R.id.fila7);
            siete.setVisibility(View.GONE);
            LinearLayout ocho = (LinearLayout) findViewById(R.id.fila8);
            ocho.setVisibility(View.GONE);
            LinearLayout nueve = (LinearLayout) findViewById(R.id.fila9);
            nueve.setVisibility(View.GONE);

            user1 = (EditText) findViewById(R.id.usu1);
            pass1 = (EditText) findViewById(R.id.pass1);
            user2 = (EditText) findViewById(R.id.usu2);
            pass2 = (EditText) findViewById(R.id.pass2);
            user3 = (EditText) findViewById(R.id.usu3);
            pass3 = (EditText) findViewById(R.id.pass3);
            user4 = (EditText) findViewById(R.id.usu4);
            pass4 = (EditText) findViewById(R.id.pass4);
            user5 = (EditText) findViewById(R.id.usu5);
            pass5 = (EditText) findViewById(R.id.pass5);
            user6 = (EditText) findViewById(R.id.usu6);
            pass6 = (EditText) findViewById(R.id.pass6);

        }
        if(num==7){
            LinearLayout ocho = (LinearLayout) findViewById(R.id.fila8);
            ocho.setVisibility(View.GONE);
            LinearLayout nueve = (LinearLayout) findViewById(R.id.fila9);
            nueve.setVisibility(View.GONE);

            user1 = (EditText) findViewById(R.id.usu1);
            pass1 = (EditText) findViewById(R.id.pass1);
            user2 = (EditText) findViewById(R.id.usu2);
            pass2 = (EditText) findViewById(R.id.pass2);
            user3 = (EditText) findViewById(R.id.usu3);
            pass3 = (EditText) findViewById(R.id.pass3);
            user4 = (EditText) findViewById(R.id.usu4);
            pass4 = (EditText) findViewById(R.id.pass4);
            user5 = (EditText) findViewById(R.id.usu5);
            pass5 = (EditText) findViewById(R.id.pass5);
            user6 = (EditText) findViewById(R.id.usu6);
            pass6 = (EditText) findViewById(R.id.pass6);
            user7 = (EditText) findViewById(R.id.usu7);
            pass7 = (EditText) findViewById(R.id.pass7);

        }
        if(num==8){
            LinearLayout nueve = (LinearLayout) findViewById(R.id.fila9);
            nueve.setVisibility(View.GONE);

            user1 = (EditText) findViewById(R.id.usu1);
            pass1 = (EditText) findViewById(R.id.pass1);
            user2 = (EditText) findViewById(R.id.usu2);
            pass2 = (EditText) findViewById(R.id.pass2);
            user3 = (EditText) findViewById(R.id.usu3);
            pass3 = (EditText) findViewById(R.id.pass3);
            user4 = (EditText) findViewById(R.id.usu4);
            pass4 = (EditText) findViewById(R.id.pass4);
            user5 = (EditText) findViewById(R.id.usu5);
            pass5 = (EditText) findViewById(R.id.pass5);
            user6 = (EditText) findViewById(R.id.usu6);
            pass6 = (EditText) findViewById(R.id.pass6);
            user7 = (EditText) findViewById(R.id.usu7);
            pass7 = (EditText) findViewById(R.id.pass7);
            user8 = (EditText) findViewById(R.id.usu8);
            pass8 = (EditText) findViewById(R.id.pass8);

        }
        if(num==9){
            user1 = (EditText) findViewById(R.id.usu1);
            pass1 = (EditText) findViewById(R.id.pass1);
            user2 = (EditText) findViewById(R.id.usu2);
            pass2 = (EditText) findViewById(R.id.pass2);
            user3 = (EditText) findViewById(R.id.usu3);
            pass3 = (EditText) findViewById(R.id.pass3);
            user4 = (EditText) findViewById(R.id.usu4);
            pass4 = (EditText) findViewById(R.id.pass4);
            user5 = (EditText) findViewById(R.id.usu5);
            pass5 = (EditText) findViewById(R.id.pass5);
            user6 = (EditText) findViewById(R.id.usu6);
            pass6 = (EditText) findViewById(R.id.pass6);
            user7 = (EditText) findViewById(R.id.usu7);
            pass7 = (EditText) findViewById(R.id.pass7);
            user8 = (EditText) findViewById(R.id.usu8);
            pass8 = (EditText) findViewById(R.id.pass8);
            user9 = (EditText) findViewById(R.id.usu9);
            pass9 = (EditText) findViewById(R.id.pass9);

        }
    }
    public void sortear(View view){
        Bundle bundle = getIntent().getExtras();

        String nombre = bundle.getString("nom", "").toString();
        int num = Integer.parseInt(nombre);

        Intent intent = new Intent(getApplicationContext(), IngresoActivity.class);
        intent.putExtra("num", nombre);
        if(num==9){
            intent.putExtra("usu1", user1.getText().toString());
            intent.putExtra("pass1", pass1.getText().toString());
            intent.putExtra("usu2", user2.getText().toString());
            intent.putExtra("pass2", pass2.getText().toString());
            intent.putExtra("usu3", user3.getText().toString());
            intent.putExtra("pass3", pass3.getText().toString());
            intent.putExtra("usu4", user4.getText().toString());
            intent.putExtra("pass4", pass4.getText().toString());
            intent.putExtra("usu5", user5.getText().toString());
            intent.putExtra("pass5", pass5.getText().toString());
            intent.putExtra("usu6", user6.getText().toString());
            intent.putExtra("pass6", pass6.getText().toString());
            intent.putExtra("usu7", user7.getText().toString());
            intent.putExtra("pass7", pass7.getText().toString());
            intent.putExtra("usu8", user8.getText().toString());
            intent.putExtra("pass8", pass8.getText().toString());
            intent.putExtra("usu9", user9.getText().toString());
            intent.putExtra("pass9", pass9.getText().toString());
        }
        if(num==8){
            intent.putExtra("usu1", user1.getText().toString());
            intent.putExtra("pass1", pass1.getText().toString());
            intent.putExtra("usu2", user2.getText().toString());
            intent.putExtra("pass2", pass2.getText().toString());
            intent.putExtra("usu3", user3.getText().toString());
            intent.putExtra("pass3", pass3.getText().toString());
            intent.putExtra("usu4", user4.getText().toString());
            intent.putExtra("pass4", pass4.getText().toString());
            intent.putExtra("usu5", user5.getText().toString());
            intent.putExtra("pass5", pass5.getText().toString());
            intent.putExtra("usu6", user6.getText().toString());
            intent.putExtra("pass6", pass6.getText().toString());
            intent.putExtra("usu7", user7.getText().toString());
            intent.putExtra("pass7", pass7.getText().toString());
            intent.putExtra("usu8", user8.getText().toString());
            intent.putExtra("pass8", pass8.getText().toString());
        }
        if(num==7){
            intent.putExtra("usu1", user1.getText().toString());
            intent.putExtra("pass1", pass1.getText().toString());
            intent.putExtra("usu2", user2.getText().toString());
            intent.putExtra("pass2", pass2.getText().toString());
            intent.putExtra("usu3", user3.getText().toString());
            intent.putExtra("pass3", pass3.getText().toString());
            intent.putExtra("usu4", user4.getText().toString());
            intent.putExtra("pass4", pass4.getText().toString());
            intent.putExtra("usu5", user5.getText().toString());
            intent.putExtra("pass5", pass5.getText().toString());
            intent.putExtra("usu6", user6.getText().toString());
            intent.putExtra("pass6", pass6.getText().toString());
            intent.putExtra("usu7", user7.getText().toString());
            intent.putExtra("pass7", pass7.getText().toString());
        }
        if(num==6){
            intent.putExtra("usu1", user1.getText().toString());
            intent.putExtra("pass1", pass1.getText().toString());
            intent.putExtra("usu2", user2.getText().toString());
            intent.putExtra("pass2", pass2.getText().toString());
            intent.putExtra("usu3", user3.getText().toString());
            intent.putExtra("pass3", pass3.getText().toString());
            intent.putExtra("usu4", user4.getText().toString());
            intent.putExtra("pass4", pass4.getText().toString());
            intent.putExtra("usu5", user5.getText().toString());
            intent.putExtra("pass5", pass5.getText().toString());
            intent.putExtra("usu6", user6.getText().toString());
            intent.putExtra("pass6", pass6.getText().toString());
        }
        if(num==5){
            intent.putExtra("usu1", user1.getText().toString());
            intent.putExtra("pass1", pass1.getText().toString());
            intent.putExtra("usu2", user2.getText().toString());
            intent.putExtra("pass2", pass2.getText().toString());
            intent.putExtra("usu3", user3.getText().toString());
            intent.putExtra("pass3", pass3.getText().toString());
            intent.putExtra("usu4", user4.getText().toString());
            intent.putExtra("pass4", pass4.getText().toString());
            intent.putExtra("usu5", user5.getText().toString());
            intent.putExtra("pass5", pass5.getText().toString());
        }
        if(num==4){
            intent.putExtra("usu1", user1.getText().toString());
            intent.putExtra("pass1", pass1.getText().toString());
            intent.putExtra("usu2", user2.getText().toString());
            intent.putExtra("pass2", pass2.getText().toString());
            intent.putExtra("usu3", user3.getText().toString());
            intent.putExtra("pass3", pass3.getText().toString());
            intent.putExtra("usu4", user4.getText().toString());
            intent.putExtra("pass4", pass4.getText().toString());
        }
        if(num==3){
            intent.putExtra("usu1", user1.getText().toString());
            intent.putExtra("pass1", pass1.getText().toString());
            intent.putExtra("usu2", user2.getText().toString());
            intent.putExtra("pass2", pass2.getText().toString());
            intent.putExtra("usu3", user3.getText().toString());
            intent.putExtra("pass3", pass3.getText().toString());
        }
        startActivity(intent);
    }
}