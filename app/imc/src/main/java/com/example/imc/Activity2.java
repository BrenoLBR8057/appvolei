package com.example.imc;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Activity2 extends AppCompatActivity {

    private Button button;
    private EditText textEdit;
    private TextView textName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        textName = findViewById(R.id.textView4);
        textEdit = findViewById(R.id.editTextNumberDecimal3);
        button = findViewById(R.id.button2);

        Intent intent = getIntent();
        double imc = intent.getDoubleExtra("textEdit",0);
        NumberFormat formatter = new DecimalFormat("##.##");
        textEdit.setText(formatter.format(imc));
        String texto = intent.getStringExtra("editName");
        textName.setText(texto);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity2.this,Imc.class);
                startActivity(intent);
            }
        });
    }
}