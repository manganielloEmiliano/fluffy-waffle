package com.example.tp3ejercicio4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class WebActivity AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        webView= findViewById(R.id.webView2);
        String direccion = getIntent().getStringExtra("dirección");
        // String direccion = getIntent().getExtras().getString("direcciion");
        webView.loadUrl("https:\\"+direccion);

    }
