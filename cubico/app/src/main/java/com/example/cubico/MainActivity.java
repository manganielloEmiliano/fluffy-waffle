package com.example.cubico;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editTextNumber;
    private TextView textView,textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextNumber=findViewById(R.id.editTextNumber);
        textView=findViewById(R.id.textView);
        textView2=findViewById(R.id.textView2);
    }
    public void calcular(View view){
        String valor1=editTextNumber.getText().toString();
        double val =Double.parseDouble(valor1);
        double decametro3=val*1000;
        double decimetro3=val*0.001;
        String resdam3=String.valueOf(decametro3)+"dam3";
        String resdm3=String.valueOf(decimetro3)+"dm3";
        textView.setText(resdam3);
        textView2.setText(resdm3);

    }
}