package com.example.appvolei;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FimDaPartida extends AppCompatActivity {

    private TextView timeVencedor;
    private TextView pontosDeA;
    private TextView pontosDeB;
    private EditText textEdit1;
    private EditText textEdit6;
    private Button button9;
    private Button button10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fim_da_partida);

        timeVencedor = findViewById(R.id.textView8);
        pontosDeA = findViewById(R.id.textView10);
        pontosDeB = findViewById(R.id.textView17);
        textEdit1 = findViewById(R.id.editTextNumber);
        textEdit6 = findViewById(R.id.editTextNumber6);
        button9 = findViewById(R.id.button9);
        Intent intent = getIntent();
        String setsDeA = intent.getStringExtra("sets de A");
        String setsDeB = intent.getStringExtra("sets de B");
        if (setsDeA.equals("3")) {
            timeVencedor.setText("Time A");
        } else {
            timeVencedor.setText("Time B");
        }
        pontosDeA.setText(setsDeA);
        if (setsDeB == null) {
            pontosDeB.setText("0");
        }

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                String texto = "0";
                intent.putExtra("reset",texto);
                finish();
            }
        });
    }
}