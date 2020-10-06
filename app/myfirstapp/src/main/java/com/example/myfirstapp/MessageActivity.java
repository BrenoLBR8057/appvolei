package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


public class MessageActivity extends AppCompatActivity {

    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        text = findViewById(R.id.textView);

        //Recuperando a intent
        Intent intent  = getIntent();

        //Recuperando o texto da intent
        String texto = intent.getStringExtra("Mensagem");

        //Alterando o textView
        text.setText(texto);
    }
}