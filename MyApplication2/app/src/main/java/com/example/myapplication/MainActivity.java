package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    private EditText nombre,pin,contrasena;
    private RadioButton usuario,admin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombre=findViewById(R.id.editTextText);
        pin=findViewById(R.id.editTextNumberPassword);
        contrasena=findViewById(R.id.editTextTextPassword);
        usuario=findViewById(R.id.radioButton);
        admin =findViewById(R.id.radioButton2);


    }

    public void ingresar(View view) {
        String n = new String("pepe");
        int p = 123;
        String c = new String("perro");

        String nom = nombre.getText().toString();
        String pi = pin.getText().toString();
        String con = contrasena.getText().toString();

        int pp = Integer.parseInt(pi);


        if ((n.equals(nom)) && (con.equals(c)) && (p == pp)) {


            if (usuario.isChecked()) {

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("condicion", usuario.getText().toString());
                startActivity(intent);

            } else if (admin.isChecked()) {



                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    intent.putExtra("condicion", admin.getText().toString());
                    startActivity(intent);

                }


            } else {
                Toast.makeText(this, "no logueado", Toast.LENGTH_LONG).show();
            }
        }


    }