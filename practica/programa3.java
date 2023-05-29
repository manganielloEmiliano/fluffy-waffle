package com.example.practica3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import android.app.DatePickerDialog;
import android.widget.DatePicker;

public class MainActivity extends AppCompatActivity {

    private EditText etArchivo, etNotas,editTextDate;
    private Calendar calendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etArchivo = findViewById(R.id.nombreTaskET);
        etNotas = findViewById(R.id.descripcionTareaETMul);
        editTextDate = findViewById(R.id.editTextDate);
        calendar = Calendar.getInstance();

        editTextDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDatePickerDialog();
            }
        });

    }

    public void guardar(View view) {
        String nombreArchivo = etArchivo.getText().toString();
        String notas = etNotas.getText().toString();
        String fecha = editTextDate.getText().toString();

        try {
            File file = new File(getExternalFilesDir(null), nombreArchivo);
            OutputStreamWriter outputWriter = new OutputStreamWriter(new FileOutputStream(file));
            outputWriter.write("Fecha: " + fecha + "\n\n" + notas);
            outputWriter.flush();
            outputWriter.close();

            etNotas.setText("");
            etArchivo.setText("");
            editTextDate.setText("");

            Toast.makeText(this, "La información se grabó correctamente!", Toast.LENGTH_SHORT).show();
        } catch (IOException ioe) {
            Toast.makeText(this, "No ha sido posible grabar la información", Toast.LENGTH_SHORT).show();
        }
    }

    public void recuperar(View view) {
        String nombreArchivo = etArchivo.getText().toString();

        try {
            File file = new File(getExternalFilesDir(null), nombreArchivo);
            FileInputStream fileInputStream = new FileInputStream(file);
            InputStreamReader archivo = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(archivo);
            String line = bufferedReader.readLine();
            String notasGuardadas = "";
            String fecha = "";

            while (line != null) {
                if (line.startsWith("Fecha: ")) {
                    fecha = line.substring(7);
                } else {
                    notasGuardadas += line + "\n";
                }
                line = bufferedReader.readLine();
            }

            bufferedReader.close();
            archivo.close();

            etNotas.setText(notasGuardadas);
            editTextDate.setText(fecha);

            Toast.makeText(this, "La información se recuperó correctamente", Toast.LENGTH_SHORT).show();
        } catch (IOException e) {
            Toast.makeText(this, "No ha sido posible recuperar la información", Toast.LENGTH_SHORT).show();
        }
    }



    private void showDatePickerDialog() {
        DatePickerDialog.OnDateSetListener dateSetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                calendar.set(Calendar.YEAR, year);
                calendar.set(Calendar.MONTH, monthOfYear);
                calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
                updateDateEditText();
            }
        };

        DatePickerDialog datePickerDialog = new DatePickerDialog(
                this,
                dateSetListener,
                calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DAY_OF_MONTH)
        );

        datePickerDialog.show();
    }

    private void updateDateEditText() {
        String dateFormat = "dd/MM/yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat, Locale.getDefault());
        editTextDate.setText(sdf.format(calendar.getTime()));
    }






}



