package com.example.tpd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
/*d) Modificar el programa anterior con el fin de seleccionar la tasa de interés utilizando 3 radio buttom con los siguientes porcentajes: 20%, 30% y 35%. Mostrar el resultado en la pantalla.*/

public class MainActivity extends AppCompatActivity {
    private EditText editTextNumberDecimal;
    private TextView textView;
    private RadioButton radioButton,radioButton2,radioButton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextNumberDecimal=findViewById(R.id.editTextNumberDecimal);
        textView=findViewById(R.id.textView);
        radioButton=findViewById(R.id.radioButton);
        radioButton2=findViewById(R.id.radioButton2);
        radioButton3=findViewById(R.id.radioButton3);


    }
    public void calcular(View view){
        String valor1=editTextNumberDecimal.getText().toString();
        double val=Double.parseDouble(valor1);
        if(radioButton.isChecked()){
            double rendimiento =(20*val)/100+val;
            String resultado ="el resultado con un rendimiento del 20% es de "+ rendimiento;
            textView.setText(resultado);

        } else if (radioButton2.isChecked()) {
            double rendimiento =(30*val)/100+val;
            String resultado ="el resultado con un rendimiento del 30% es de "+ rendimiento;
            textView.setText(resultado);

        } else if (radioButton3.isChecked()) {
            double rendimiento =(35*val)/100+val;
            String resultado ="el resultado con un rendimiento del 35% es de "+ rendimiento;
            textView.setText(resultado);

        }


    }
}