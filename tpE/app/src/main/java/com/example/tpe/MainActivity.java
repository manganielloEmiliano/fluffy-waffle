package com.example.tpe;
/*3)Crear una aplicación que permita calcular si una sustancia es ácida, neutra o básica. Recordemos que el pH es va del 0 al 14, siendo 0 a 6 ácido, 7 neutro y 8 a 14 básico.
Deberá guardar el dato de pH en una SharedPreferences para pode recuperar el último valor analizado al abrir nuevamente la apliación.*/
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editTextNumber;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextNumber=findViewById(R.id.editTextNumber);
        textView =findViewById(R.id.textView);
        SharedPreferences prefe=getSharedPreferences("ph",Context.MODE_PRIVATE);
        editTextNumber.setText(prefe.getString("ph",""));


    }
    public void calcular(View view){
        SharedPreferences preferencias=getSharedPreferences("ph", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=preferencias.edit();
        editor.putString("ph", editTextNumber.getText().toString());

        String valor1=editTextNumber.getText().toString();
        int val=Integer.parseInt(valor1);
        if(val<=6){
            textView.setText("es acida");

        } else if (val>=8) {
            textView.setText("es basica");


        }else{
            textView.setText("es neutra");

        }
        editor.commit();




    }
    public void fin(View view){
        finish();
    }

}