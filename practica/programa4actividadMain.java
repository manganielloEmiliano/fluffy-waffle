package com.example.tp3ejercicio4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText pagina;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pagina = findViewById(R.id.paginaET);

    }

    public void ingrsarBn(View v){
        Intent intento = new Intent( this, WebActivity.class);
        intento.putExtra("dirección", pagina.getText().toString());

        startActivity(intento);
    }

}