package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView mensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mensaje=findViewById(R.id.textView);
        Bundle bundle = getIntent().getExtras();
        mensaje.setText(bundle.getString("condicion"));






    }
    public void cerrar(View view){
        finish();
    }


}