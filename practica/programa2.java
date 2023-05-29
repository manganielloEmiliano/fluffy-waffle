package com.example.tp2practica2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/*
    Nos solicitan realizar una aplicación que nos permita realizar la __lista de la compra__ del supermercado y
    que la misma nos realice un __estimado__ de lo que vamos a gastar.
    Los datos de entrada serán el nombre del producto, el precio y la cantidad.
 */
public class MainActivity extends AppCompatActivity {

    EditText productoEntrada, precioEntrada, cantidadEntrada;
    TextView salidasTV;
    List<String> productos;
    List<Double> precios;
    List<Integer> cantidades;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        productoEntrada = (EditText) findViewById(R.id.productoET);
        precioEntrada = (EditText) findViewById(R.id.numeroEntradaET);
        cantidadEntrada= (EditText)findViewById(R.id.cantidadET);
        salidasTV = (TextView) findViewById(R.id.salidaTV);

        productos = new ArrayList<>();
        precios = new ArrayList<>();
        cantidades = new ArrayList<>();

    }
    public void guardarProductoBn(View view){
        productos.add(productoEntrada.getText().toString());
        precios.add(casteoNumeroDouble(precioEntrada));
        cantidades.add(casteoNumerosInteger(cantidadEntrada));

    }
    public void calcularProductoBn(View view){
        int contador = precios.size();
        double total = 0.0;
        for (int i = 0; i<contador;i++ ){
            total += sumaTotal(precios.get(i),cantidades.get(i));
        }
        salidasTV.setText("El total del precio es: "+ total);
    }

    private double sumaTotal(double precio,int cantidad){
        return precio*cantidad;
    }


    private Integer casteoNumerosInteger(EditText et){
        String s = et.getText().toString();
        int i = Integer.parseInt(s);
        return  i;
    }

    private Double casteoNumeroDouble(EditText et){
        String s = et.getText().toString();
        Double i = Double.parseDouble(s);
        return  i;
    }
}