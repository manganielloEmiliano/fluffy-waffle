package com.example.tpe;

import androidx.appcompat.app.AppCompatActivity;

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
    }
    public void calcular(View view){
        String valor1=editTextNumber.getText().toString();
        int val=Integer.parseInt(valor1);
        if(val<=6){
            textView.setText("es acida");
        } else if (val>=8) {
            textView.setText("es basica");

        }else{
            textView.setText("es neutra");
        }
    }
}