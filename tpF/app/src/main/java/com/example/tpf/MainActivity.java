package com.example.tpf;
/*f) Crear un programa que muestre una lista de supermercado y al hacer click muestre el precio en la parte superior.*/

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ListView listaUno;
    private String[] productos = {"arroz","carne","papas","dentrifico"};
    private double[] precios = {10,15,20,30};
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textView);
        listaUno=findViewById(R.id.lista1);
        ArrayAdapter<String> adapter =  new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, productos);
        listaUno.setAdapter(adapter);

        listaUno.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView adapterView, View view, int i, long l){
            textView.setText("el precio es"+precios[i]);

        }


        });

    }
}