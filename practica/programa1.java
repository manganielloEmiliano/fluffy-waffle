package com.example.institucioneducativa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private int count = 0;
    private EditText nota1In, nota2In, nota3In;
    private TextView alumnoSaliente;
    private double totalPromedio;
    private List<String> nombres;
    private List<Integer> calificacion1,calificacion2,calificacion3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nota1In = (EditText) findViewById(R.id.calificacion1InET);
        nota2In = (EditText) findViewById(R.id.calificacion2InET);
        nota3In = (EditText) findViewById(R.id.calificacion3InET);
        alumnoSaliente  = (TextView) findViewById(R.id.nombreAlumnoTVOut);

        nombres = new ArrayList<>();
        calificacion1 = new ArrayList<>();
        calificacion2 = new ArrayList<>();
        calificacion3 = new ArrayList<>();

    }
 /*
     Una institución educativa nos solicita que realicemos una aplicación movil que permita a los docentes llevar un control de sus estudiantes.
     Deberá guardar el nombre del estudiante, sus calificaciones y el promedio hasta el momento.
     Cuando se desee ver el estado del estudiante deberá mostrar en la pantalla la condición de APROBADO o DESAPROBADO según corresponda.
  */
    public void consultaBn(View v){
        estaAprobado(v);
    }
    public void guardarBn(View v){
        alumnoSaliente.setText("Se ha guardado existosamente");
        Integer n1 = casteoNumeros(nota1In), n2 = casteoNumeros(nota2In), n3 = casteoNumeros(nota3In);
        calificacion1.add(n1);
        calificacion2.add(n2);
        calificacion3.add(n3);
        nombres.add(alumnoSaliente.getText().toString());
    }

    public void calcularPromedioBn(View v){
        double total = 0.0;
        int contador = calificacion1.size();
        for (int i = 0; i < contador;i++){
                int a = calificacion1.get(i);
                int b = calificacion1.get(i);
                int c = calificacion1.get(i);
                total += promedio(suma(a,b,c),3);
        }
        double promedioTotalAlumnos = promedio(total,contador);
        alumnoSaliente.setText("Promedio hasta el monento es: "+ promedioTotalAlumnos);
    }

    private double promedio(double total, int count){
        double promedio =0.0;
        promedio = total /count;
        return promedio;
    }

    private double suma(int a , int b, int c){
        int total = 0;
        total = a+b+c;
        return total;
    }

    private void estaAprobado(View v){
        alumnoSaliente.setText( promedio(suma(casteoNumeros(nota1In),casteoNumeros(nota2In),casteoNumeros(nota3In)),3) >= 4 ? "Este alumno está Aprobado" : "Este alumno está Desaprobado");
    }

    private int casteoNumeros(EditText et){
        String s = et.getText().toString();
        int i = Integer.parseInt(s);
        return  i;
    }

}