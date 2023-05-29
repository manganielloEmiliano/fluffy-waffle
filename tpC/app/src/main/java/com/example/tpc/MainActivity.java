package com.example.tpc;
/*
Nos solicitan crear una aplicación que calcule los rendimientos (cuanto dinero ganamos) en donde el usuario ingrese un capital inicial y
nosotros coloquemos una tasa.
*/
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editTextNumberDecimal;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextNumberDecimal=findViewById(R.id.editTextNumberDecimal);
        textView=findViewById(R.id.textView);

    }
public void calcular(View view){
    String valor1=editTextNumberDecimal.getText().toString();
    double val=Double.parseDouble(valor1);
    double rendimiento =(10*val)/100+val;
    String resultado ="el resultado con un rendimiento del 10% es de "+ rendimiento;
    textView.setText(resultado);



}
}
