package com.example.daniel.intercambio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.lang.reflect.Array;

public class IngresoActivity extends AppCompatActivity {

    private EditText inUser;
    private EditText inPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingreso);
        getSupportActionBar().hide();

        inUser = (EditText) findViewById(R.id.nomb);
        inPass = (EditText) findViewById(R.id.pasw);

        Bundle bundle = getIntent().getExtras();

        String num = bundle.getString("num", "").toString();
        int can = Integer.parseInt(num);
        if(can==3){
            String usu1 = bundle.getString("usu1", "").toString();
            String pass1 = bundle.getString("pass1", "").toString();
            String usu2 = bundle.getString("usu2", "").toString();
            String pass2 = bundle.getString("pass2", "").toString();
            String usu3 = bundle.getString("usu3", "").toString();
            String pass3 = bundle.getString("pass3", "").toString();
        }
        if(can==4){
            String usu1 = bundle.getString("usu1", "").toString();
            String pass1 = bundle.getString("pass1", "").toString();
            String usu2 = bundle.getString("usu2", "").toString();
            String pass2 = bundle.getString("pass2", "").toString();
            String usu3 = bundle.getString("usu3", "").toString();
            String pass3 = bundle.getString("pass3", "").toString();
            String usu4 = bundle.getString("usu4", "").toString();
            String pass4 = bundle.getString("pass4", "").toString();
        }
        if(can==5){
            String usu1 = bundle.getString("usu1", "").toString();
            String pass1 = bundle.getString("pass1", "").toString();
            String usu2 = bundle.getString("usu2", "").toString();
            String pass2 = bundle.getString("pass2", "").toString();
            String usu3 = bundle.getString("usu3", "").toString();
            String pass3 = bundle.getString("pass3", "").toString();
            String usu4 = bundle.getString("usu4", "").toString();
            String pass4 = bundle.getString("pass4", "").toString();
            String usu5 = bundle.getString("usu5", "").toString();
            String pass5 = bundle.getString("pass5", "").toString();
        }
        if(can==6){
            String usu1 = bundle.getString("usu1", "").toString();
            String pass1 = bundle.getString("pass1", "").toString();
            String usu2 = bundle.getString("usu2", "").toString();
            String pass2 = bundle.getString("pass2", "").toString();
            String usu3 = bundle.getString("usu3", "").toString();
            String pass3 = bundle.getString("pass3", "").toString();
            String usu4 = bundle.getString("usu4", "").toString();
            String pass4 = bundle.getString("pass4", "").toString();
            String usu5 = bundle.getString("usu5", "").toString();
            String pass5 = bundle.getString("pass5", "").toString();
            String usu6 = bundle.getString("usu6", "").toString();
            String pass6 = bundle.getString("pass6", "").toString();
        }
        if(can==7){
            String usu1 = bundle.getString("usu1", "").toString();
            String pass1 = bundle.getString("pass1", "").toString();
            String usu2 = bundle.getString("usu2", "").toString();
            String pass2 = bundle.getString("pass2", "").toString();
            String usu3 = bundle.getString("usu3", "").toString();
            String pass3 = bundle.getString("pass3", "").toString();
            String usu4 = bundle.getString("usu4", "").toString();
            String pass4 = bundle.getString("pass4", "").toString();
            String usu5 = bundle.getString("usu5", "").toString();
            String pass5 = bundle.getString("pass5", "").toString();
            String usu6 = bundle.getString("usu6", "").toString();
            String pass6 = bundle.getString("pass6", "").toString();
            String usu7 = bundle.getString("usu7", "").toString();
            String pass7 = bundle.getString("pass7", "").toString();
        }
        if(can==8){
            String usu1 = bundle.getString("usu1", "").toString();
            String pass1 = bundle.getString("pass1", "").toString();
            String usu2 = bundle.getString("usu2", "").toString();
            String pass2 = bundle.getString("pass2", "").toString();
            String usu3 = bundle.getString("usu3", "").toString();
            String pass3 = bundle.getString("pass3", "").toString();
            String usu4 = bundle.getString("usu4", "").toString();
            String pass4 = bundle.getString("pass4", "").toString();
            String usu5 = bundle.getString("usu5", "").toString();
            String pass5 = bundle.getString("pass5", "").toString();
            String usu6 = bundle.getString("usu6", "").toString();
            String pass6 = bundle.getString("pass6", "").toString();
            String usu7 = bundle.getString("usu7", "").toString();
            String pass7 = bundle.getString("pass7", "").toString();
            String usu8 = bundle.getString("usu8", "").toString();
            String pass8 = bundle.getString("pass8", "").toString();
        }
        if(can==9){
            String usu1 = bundle.getString("usu1", "").toString();
            String pass1 = bundle.getString("pass1", "").toString();
            String usu2 = bundle.getString("usu2", "").toString();
            String pass2 = bundle.getString("pass2", "").toString();
            String usu3 = bundle.getString("usu3", "").toString();
            String pass3 = bundle.getString("pass3", "").toString();
            String usu4 = bundle.getString("usu4", "").toString();
            String pass4 = bundle.getString("pass4", "").toString();
            String usu5 = bundle.getString("usu5", "").toString();
            String pass5 = bundle.getString("pass5", "").toString();
            String usu6 = bundle.getString("usu6", "").toString();
            String pass6 = bundle.getString("pass6", "").toString();
            String usu7 = bundle.getString("usu7", "").toString();
            String pass7 = bundle.getString("pass7", "").toString();
            String usu8 = bundle.getString("usu8", "").toString();
            String pass8 = bundle.getString("pass8", "").toString();
            String usu9 = bundle.getString("usu9", "").toString();
            String pass9 = bundle.getString("pass9", "").toString();
        }

    }
    public void ver(View view){

        Bundle bundle = getIntent().getExtras();

        String num = bundle.getString("num", "").toString();
        int can = Integer.parseInt(num);
        if(can==3){
            String usu1 = bundle.getString("usu1", "").toString();
            String pass1 = bundle.getString("pass1", "").toString();
            String usu2 = bundle.getString("usu2", "").toString();
            String pass2 = bundle.getString("pass2", "").toString();
            String usu3 = bundle.getString("usu3", "").toString();
            String pass3 = bundle.getString("pass3", "").toString();
            if(inUser.getText().toString().equals(usu1.toString()) && inPass.getText().toString().equals(pass1.toString())){
                Intent intent = new Intent(getApplicationContext(), DetalleActivity.class);
                intent.putExtra("nomUsu", usu3);
                startActivity(intent);
            }
            else{
                if(inUser.getText().toString().equals(usu2) && inPass.getText().toString().equals(pass2)){
                    Intent intent = new Intent(getApplicationContext(), DetalleActivity.class);
                    intent.putExtra("nomUsu", usu1);
                    startActivity(intent);
                }
                else{
                    if(inUser.getText().toString().equals(usu3) && inPass.getText().toString().equals(pass3)){
                        Intent intent = new Intent(getApplicationContext(), DetalleActivity.class);
                        intent.putExtra("nomUsu", usu2);
                        startActivity(intent);
                    }
                    else{
                                                Toast.makeText(getApplicationContext(),
                                                        "Usuario y contrasenia incorrectos",
                                                        Toast.LENGTH_SHORT).show();
                    }
                }
            }
        }
        if(can==4){
            String usu1 = bundle.getString("usu1", "").toString();
            String pass1 = bundle.getString("pass1", "").toString();
            String usu2 = bundle.getString("usu2", "").toString();
            String pass2 = bundle.getString("pass2", "").toString();
            String usu3 = bundle.getString("usu3", "").toString();
            String pass3 = bundle.getString("pass3", "").toString();
            String usu4 = bundle.getString("usu4", "").toString();
            String pass4 = bundle.getString("pass4", "").toString();
            if(inUser.getText().toString().equals(usu1) && inPass.getText().toString().equals(pass1)){
                Intent intent = new Intent(getApplicationContext(), DetalleActivity.class);
                intent.putExtra("nomUsu", usu3);
                startActivity(intent);
            }
            else{
                if(inUser.getText().toString().equals(usu2) && inPass.getText().toString().equals(pass2)){
                    Intent intent = new Intent(getApplicationContext(), DetalleActivity.class);
                    intent.putExtra("nomUsu", usu4);
                    startActivity(intent);
                }
                else{
                    if(inUser.getText().toString().equals(usu3) && inPass.getText().toString().equals(pass3)){
                        Intent intent = new Intent(getApplicationContext(), DetalleActivity.class);
                        intent.putExtra("nomUsu", usu2);
                        startActivity(intent);
                    }
                    else{
                        if(inUser.getText().toString().equals(usu4) && inPass.getText().toString().equals(pass4)){
                            Intent intent = new Intent(getApplicationContext(), DetalleActivity.class);
                            intent.putExtra("nomUsu", usu1);
                            startActivity(intent);
                        }
                        else{
                                                Toast.makeText(getApplicationContext(),
                                                        "Usuario y contrasenia incorrectos",
                                                        Toast.LENGTH_SHORT).show();
                        }
                    }
                }
            }
        }
        if(can==5){
            String usu1 = bundle.getString("usu1", "").toString();
            String pass1 = bundle.getString("pass1", "").toString();
            String usu2 = bundle.getString("usu2", "").toString();
            String pass2 = bundle.getString("pass2", "").toString();
            String usu3 = bundle.getString("usu3", "").toString();
            String pass3 = bundle.getString("pass3", "").toString();
            String usu4 = bundle.getString("usu4", "").toString();
            String pass4 = bundle.getString("pass4", "").toString();
            String usu5 = bundle.getString("usu5", "").toString();
            String pass5 = bundle.getString("pass5", "").toString();
            if(inUser.getText().toString().equals(usu1) && inPass.getText().toString().equals(pass1)){
                Intent intent = new Intent(getApplicationContext(), DetalleActivity.class);
                intent.putExtra("nomUsu", usu3);
                startActivity(intent);
            }
            else{
                if(inUser.getText().toString().equals(usu2) && inPass.getText().toString().equals(pass2)){
                    Intent intent = new Intent(getApplicationContext(), DetalleActivity.class);
                    intent.putExtra("nomUsu", usu4);
                    startActivity(intent);
                }
                else{
                    if(inUser.getText().toString().equals(usu3) && inPass.getText().toString().equals(pass3)){
                        Intent intent = new Intent(getApplicationContext(), DetalleActivity.class);
                        intent.putExtra("nomUsu", usu2);
                        startActivity(intent);
                    }
                    else{
                        if(inUser.getText().toString().equals(usu4) && inPass.getText().toString().equals(pass4)){
                            Intent intent = new Intent(getApplicationContext(), DetalleActivity.class);
                            intent.putExtra("nomUsu", usu5);
                            startActivity(intent);
                        }
                        else{
                            if(inUser.getText().toString().equals(usu5) && inPass.getText().toString().equals(pass5)){
                                Intent intent = new Intent(getApplicationContext(), DetalleActivity.class);
                                intent.putExtra("nomUsu", usu1);
                                startActivity(intent);
                            }
                            else{
                                                Toast.makeText(getApplicationContext(),
                                                        "Usuario y contrasenia incorrectos",
                                                        Toast.LENGTH_SHORT).show();
                            }
                        }
                    }
                }
            }
        }
        if(can==6){
            String usu1 = bundle.getString("usu1", "").toString();
            String pass1 = bundle.getString("pass1", "").toString();
            String usu2 = bundle.getString("usu2", "").toString();
            String pass2 = bundle.getString("pass2", "").toString();
            String usu3 = bundle.getString("usu3", "").toString();
            String pass3 = bundle.getString("pass3", "").toString();
            String usu4 = bundle.getString("usu4", "").toString();
            String pass4 = bundle.getString("pass4", "").toString();
            String usu5 = bundle.getString("usu5", "").toString();
            String pass5 = bundle.getString("pass5", "").toString();
            String usu6 = bundle.getString("usu6", "").toString();
            String pass6 = bundle.getString("pass6", "").toString();
            if(inUser.getText().toString().equals(usu1) && inPass.getText().toString().equals(pass1)){
                Intent intent = new Intent(getApplicationContext(), DetalleActivity.class);
                intent.putExtra("nomUsu", usu2);
                startActivity(intent);
            }
            else{
                if(inUser.getText().toString().equals(usu2) && inPass.getText().toString().equals(pass2)){
                    Intent intent = new Intent(getApplicationContext(), DetalleActivity.class);
                    intent.putExtra("nomUsu", usu4);
                    startActivity(intent);
                }
                else{
                    if(inUser.getText().toString().equals(usu3) && inPass.getText().toString().equals(pass3)){
                        Intent intent = new Intent(getApplicationContext(), DetalleActivity.class);
                        intent.putExtra("nomUsu", usu6);
                        startActivity(intent);
                    }
                    else{
                        if(inUser.getText().toString().equals(usu4) && inPass.getText().toString().equals(pass4)){
                            Intent intent = new Intent(getApplicationContext(), DetalleActivity.class);
                            intent.putExtra("nomUsu", usu1);
                            startActivity(intent);
                        }
                        else{
                            if(inUser.getText().toString().equals(usu5) && inPass.getText().toString().equals(pass5)){
                                Intent intent = new Intent(getApplicationContext(), DetalleActivity.class);
                                intent.putExtra("nomUsu", usu3);
                                startActivity(intent);
                            }
                            else{
                                if(inUser.getText().toString().equals(usu6) && inPass.getText().toString().equals(pass6)){
                                    Intent intent = new Intent(getApplicationContext(), DetalleActivity.class);
                                    intent.putExtra("nomUsu", usu5);
                                    startActivity(intent);
                                }
                                else{
                                                Toast.makeText(getApplicationContext(),
                                                        "Usuario y contrasenia incorrectos",
                                                        Toast.LENGTH_SHORT).show();
                                }
                            }
                        }
                    }
                }
            }
        }
        if(can==7){
            String usu1 = bundle.getString("usu1", "").toString();
            String pass1 = bundle.getString("pass1", "").toString();
            String usu2 = bundle.getString("usu2", "").toString();
            String pass2 = bundle.getString("pass2", "").toString();
            String usu3 = bundle.getString("usu3", "").toString();
            String pass3 = bundle.getString("pass3", "").toString();
            String usu4 = bundle.getString("usu4", "").toString();
            String pass4 = bundle.getString("pass4", "").toString();
            String usu5 = bundle.getString("usu5", "").toString();
            String pass5 = bundle.getString("pass5", "").toString();
            String usu6 = bundle.getString("usu6", "").toString();
            String pass6 = bundle.getString("pass6", "").toString();
            String usu7 = bundle.getString("usu7", "").toString();
            String pass7 = bundle.getString("pass7", "").toString();
            if(inUser.getText().toString().equals(usu1) && inPass.getText().toString().equals(pass1)){
                Intent intent = new Intent(getApplicationContext(), DetalleActivity.class);
                intent.putExtra("nomUsu", usu7);
                startActivity(intent);
            }
            else{
                if(inUser.getText().toString().equals(usu2) && inPass.getText().toString().equals(pass2)){
                    Intent intent = new Intent(getApplicationContext(), DetalleActivity.class);
                    intent.putExtra("nomUsu", usu5);
                    startActivity(intent);
                }
                else{
                    if(inUser.getText().toString().equals(usu3) && inPass.getText().toString().equals(pass3)){
                        Intent intent = new Intent(getApplicationContext(), DetalleActivity.class);
                        intent.putExtra("nomUsu", usu1);
                        startActivity(intent);
                    }
                    else{
                        if(inUser.getText().toString().equals(usu4) && inPass.getText().toString().equals(pass4)){
                            Intent intent = new Intent(getApplicationContext(), DetalleActivity.class);
                            intent.putExtra("nomUsu", usu3);
                            startActivity(intent);
                        }
                        else{
                            if(inUser.getText().toString().equals(usu5) && inPass.getText().toString().equals(pass5)){
                                Intent intent = new Intent(getApplicationContext(), DetalleActivity.class);
                                intent.putExtra("nomUsu", usu6);
                                startActivity(intent);
                            }
                            else{
                                if(inUser.getText().toString().equals(usu6) && inPass.getText().toString().equals(pass6)){
                                    Intent intent = new Intent(getApplicationContext(), DetalleActivity.class);
                                    intent.putExtra("nomUsu", usu4);
                                    startActivity(intent);
                                }
                                else{
                                    if(inUser.getText().toString().equals(usu7) && inPass.getText().toString().equals(pass7)){
                                        Intent intent = new Intent(getApplicationContext(), DetalleActivity.class);
                                        intent.putExtra("nomUsu", usu2);
                                        startActivity(intent);
                                    }
                                    else{
                                                Toast.makeText(getApplicationContext(),
                                                        "Usuario y contrasenia incorrectos",
                                                        Toast.LENGTH_SHORT).show();
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if(can==8){
            String usu1 = bundle.getString("usu1", "").toString();
            String pass1 = bundle.getString("pass1", "").toString();
            String usu2 = bundle.getString("usu2", "").toString();
            String pass2 = bundle.getString("pass2", "").toString();
            String usu3 = bundle.getString("usu3", "").toString();
            String pass3 = bundle.getString("pass3", "").toString();
            String usu4 = bundle.getString("usu4", "").toString();
            String pass4 = bundle.getString("pass4", "").toString();
            String usu5 = bundle.getString("usu5", "").toString();
            String pass5 = bundle.getString("pass5", "").toString();
            String usu6 = bundle.getString("usu6", "").toString();
            String pass6 = bundle.getString("pass6", "").toString();
            String usu7 = bundle.getString("usu7", "").toString();
            String pass7 = bundle.getString("pass7", "").toString();
            String usu8 = bundle.getString("usu8", "").toString();
            String pass8 = bundle.getString("pass8", "").toString();
            if(inUser.getText().toString().equals(usu1) && inPass.getText().toString().equals(pass1)){
                Intent intent = new Intent(getApplicationContext(), DetalleActivity.class);
                intent.putExtra("nomUsu", usu5);
                startActivity(intent);
            }
            else{
                if(inUser.getText().toString().equals(usu2) && inPass.getText().toString().equals(pass2)){
                    Intent intent = new Intent(getApplicationContext(), DetalleActivity.class);
                    intent.putExtra("nomUsu", usu6);
                    startActivity(intent);
                }
                else{
                    if(inUser.getText().toString().equals(usu3) && inPass.getText().toString().equals(pass3)){
                        Intent intent = new Intent(getApplicationContext(), DetalleActivity.class);
                        intent.putExtra("nomUsu", usu7);
                        startActivity(intent);
                    }
                    else{
                        if(inUser.getText().toString().equals(usu4) && inPass.getText().toString().equals(pass4)){
                            Intent intent = new Intent(getApplicationContext(), DetalleActivity.class);
                            intent.putExtra("nomUsu", usu8);
                            startActivity(intent);
                        }
                        else{
                            if(inUser.getText().toString().equals(usu5) && inPass.getText().toString().equals(pass5)){
                                Intent intent = new Intent(getApplicationContext(), DetalleActivity.class);
                                intent.putExtra("nomUsu", usu1);
                                startActivity(intent);
                            }
                            else{
                                if(inUser.getText().toString().equals(usu6) && inPass.getText().toString().equals(pass6)){
                                    Intent intent = new Intent(getApplicationContext(), DetalleActivity.class);
                                    intent.putExtra("nomUsu", usu2);
                                    startActivity(intent);
                                }
                                else{
                                    if(inUser.getText().toString().equals(usu7) && inPass.getText().toString().equals(pass7)){
                                        Intent intent = new Intent(getApplicationContext(), DetalleActivity.class);
                                        intent.putExtra("nomUsu", usu3);
                                        startActivity(intent);
                                    }
                                    else{
                                        if(inUser.getText().toString().equals(usu8) && inPass.getText().toString().equals(pass8)){
                                            Intent intent = new Intent(getApplicationContext(), DetalleActivity.class);
                                            intent.putExtra("nomUsu", usu4);
                                            startActivity(intent);
                                        }
                                        else{
                                                Toast.makeText(getApplicationContext(),
                                                        "Usuario y contrasenia incorrectos",
                                                        Toast.LENGTH_SHORT).show();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if(can==9){
            String usu1 = bundle.getString("usu1", "").toString();
            String pass1 = bundle.getString("pass1", "").toString();
            String usu2 = bundle.getString("usu2", "").toString();
            String pass2 = bundle.getString("pass2", "").toString();
            String usu3 = bundle.getString("usu3", "").toString();
            String pass3 = bundle.getString("pass3", "").toString();
            String usu4 = bundle.getString("usu4", "").toString();
            String pass4 = bundle.getString("pass4", "").toString();
            String usu5 = bundle.getString("usu5", "").toString();
            String pass5 = bundle.getString("pass5", "").toString();
            String usu6 = bundle.getString("usu6", "").toString();
            String pass6 = bundle.getString("pass6", "").toString();
            String usu7 = bundle.getString("usu7", "").toString();
            String pass7 = bundle.getString("pass7", "").toString();
            String usu8 = bundle.getString("usu8", "").toString();
            String pass8 = bundle.getString("pass8", "").toString();
            String usu9 = bundle.getString("usu9", "").toString();
            String pass9 = bundle.getString("pass9", "").toString();

            if(inUser.getText().toString().equals(usu1) && inPass.getText().toString().equals(pass1)){
                Intent intent = new Intent(getApplicationContext(), DetalleActivity.class);
                intent.putExtra("nomUsu", usu9);
                startActivity(intent);
            }
            else{
                if(inUser.getText().toString().equals(usu2) && inPass.getText().toString().equals(pass2)){
                    Intent intent = new Intent(getApplicationContext(), DetalleActivity.class);
                    intent.putExtra("nomUsu", usu1);
                    startActivity(intent);
                }
                else{
                    if(inUser.getText().toString().equals(usu3) && inPass.getText().toString().equals(pass3)){
                        Intent intent = new Intent(getApplicationContext(), DetalleActivity.class);
                        intent.putExtra("nomUsu", usu8);
                        startActivity(intent);
                    }
                    else{
                        if(inUser.getText().toString().equals(usu4) && inPass.getText().toString().equals(pass4)){
                            Intent intent = new Intent(getApplicationContext(), DetalleActivity.class);
                            intent.putExtra("nomUsu", usu2);
                            startActivity(intent);
                        }
                        else{
                            if(inUser.getText().toString().equals(usu5) && inPass.getText().toString().equals(pass5)){
                                Intent intent = new Intent(getApplicationContext(), DetalleActivity.class);
                                intent.putExtra("nomUsu", usu7);
                                startActivity(intent);
                            }
                            else{
                                if(inUser.getText().toString().equals(usu6) && inPass.getText().toString().equals(pass6)){
                                    Intent intent = new Intent(getApplicationContext(), DetalleActivity.class);
                                    intent.putExtra("nomUsu", usu3);
                                    startActivity(intent);
                                }
                                else{
                                    if(inUser.getText().toString().equals(usu7) && inPass.getText().toString().equals(pass7)){
                                        Intent intent = new Intent(getApplicationContext(), DetalleActivity.class);
                                        intent.putExtra("nomUsu", usu6);
                                        startActivity(intent);
                                    }
                                    else{
                                        if(inUser.getText().toString().equals(usu8) && inPass.getText().toString().equals(pass8)){
                                            Intent intent = new Intent(getApplicationContext(), DetalleActivity.class);
                                            intent.putExtra("nomUsu", usu4);
                                            startActivity(intent);
                                        }
                                        else{
                                            if(inUser.getText().toString().equals(usu9) && inPass.getText().toString().equals(pass9)){
                                                Intent intent = new Intent(getApplicationContext(), DetalleActivity.class);
                                                intent.putExtra("nomUsu", usu5);
                                                startActivity(intent);
                                            }
                                            else{
                                                Toast.makeText(getApplicationContext(),
                                                        "Usuario y contrasenia incorrectos",
                                                        Toast.LENGTH_SHORT).show();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
