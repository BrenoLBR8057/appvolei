package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.EmptyStackException;

public class Imc extends AppCompatActivity {

    private EditText textEdit;
    private EditText textEdit2;
    private Button button;
    private String nivelDoPeso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imc);

        textEdit = findViewById(R.id.editTextNumberDecimal);
        textEdit2 = findViewById(R.id.editTextNumberDecimal2);

        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textEdit.getText().toString().isEmpty()){
                    textEdit.setError("Este campo está vazio");
                    return;
            }else if(textEdit2.getText().toString().isEmpty()){
                    textEdit2.setError("Este campo está vazio");
                    return;
                }else{

                }

                Intent intent = new Intent(Imc.this, Activity2.class);

                double peso = Double.parseDouble(textEdit.getText().toString());
                double altura = Double.parseDouble(textEdit2.getText().toString());
                double imc = peso / (altura * altura);

                if (imc < 18) {
                    nivelDoPeso = ("Abaixo do peso");

                } else if (imc < 25) {
                    nivelDoPeso = ("Peso normal");

                } else if (imc < 30) {
                    nivelDoPeso = ("Esta com sobrepeso");

                } else if (imc < 35) {
                    nivelDoPeso = ("Esta obeso(a)");

                } else if (imc < 40) {
                    nivelDoPeso = ("Esta com obesidade moderada");

                } else {
                    nivelDoPeso = ("Obesidade mórbida");
                }
                intent.putExtra("textEdit",imc);
                intent.putExtra("editName",nivelDoPeso);
                startActivity(intent);
                }
        });
    }
}