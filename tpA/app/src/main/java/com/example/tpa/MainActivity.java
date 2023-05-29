package com.example.tpa;
/*a) Crear una aplicación que calcule el porcentaje de un número. El usuario deberá ingresar el valor
 del cual quiere calcular le porcentaje y el porcentaje. Deberá mostrar por pantalla el valor inicial junto con el porcentaje sumado. Ej: 100 + 21% = 121.*/

import androidx.appcompat.app.AppCompatActivity;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;

import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText ingreso;

    private TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ingreso= findViewById(R.id.ingreso);
        textView2=findViewById(R.id.textView2);

    }
    public void iva(View view){
        String valor1=ingreso.getText().toString();
        double val1=Double.parseDouble(valor1);
        double ope=((21*val1)/100)+val1;
        String res =String.valueOf(ope);
        textView2.setText(res);

    }
}