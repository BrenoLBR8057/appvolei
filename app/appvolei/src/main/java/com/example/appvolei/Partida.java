package com.example.appvolei;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Partida extends AppCompatActivity {

    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button9;
    private EditText textEdit1;
    private EditText textEdit2;
    private EditText textEdit3;
    private EditText textEdit4;
    private EditText textEdit5;
    private EditText textEdit6;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_partida);

        textEdit1 = findViewById(R.id.editTextNumber);
        textEdit2 = findViewById(R.id.editTextNumber2);
        textEdit3 = findViewById(R.id.editTextNumber3);
        textEdit4 = findViewById(R.id.editTextNumber4);
        textEdit5 = findViewById(R.id.editTextNumber5);
        textEdit6 = findViewById(R.id.editTextNumber6);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button9 = findViewById(R.id.button9);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textEdit5.getText().toString().isEmpty()) {
                    textEdit5.setText("1");
                    textEdit2.setText("0");
                } else {
                    int placarDeA = Integer.parseInt(textEdit5.getText().toString());
                    int placarDeB = Integer.parseInt(textEdit2.getText().toString());
                    placarDeA++;
                    textEdit5.setText(String.valueOf(placarDeA));
                    if (placarDeA >= 25 && (placarDeA - 2) >= placarDeB) {
                        if (textEdit1.getText().toString().isEmpty()) {
                            textEdit1.setText("1");
                            placarDeA = 0;
                            placarDeB = 0;
                            textEdit2.setText(String.valueOf(placarDeB));
                            textEdit5.setText(String.valueOf(placarDeA));
                        } else {
                            int i = Integer.parseInt(textEdit1.getText().toString());
                            i++;
                            placarDeA = 0;
                            placarDeB = 0;
                            textEdit1.setText(String.valueOf(i));
                            textEdit2.setText(String.valueOf(placarDeB));
                            textEdit5.setText(String.valueOf(placarDeA));
                            if (i == 3) {
                                Intent intent = new Intent(Partida.this, FimDaPartida.class);
                                intent.putExtra("sets de A", String.valueOf(i));
                                startActivity(intent);
                            }
                        }
                    }
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textEdit2.getText().toString().isEmpty()) {
                    textEdit2.setText("1");
                    textEdit5.setText("0");
                } else {
                    int placarDeA = Integer.parseInt(textEdit5.getText().toString());
                    int placarDeB = Integer.parseInt(textEdit2.getText().toString());
                    placarDeB++;
                    textEdit2.setText(String.valueOf(placarDeB));
                    if (placarDeB >= 25 && (placarDeB - 2) >= placarDeA) {
                        if (textEdit6.getText().toString().isEmpty()) {
                            textEdit6.setText("0");
                            placarDeA = 0;
                            placarDeB = 0;
                            textEdit5.setText(String.valueOf(placarDeA));
                            textEdit2.setText(String.valueOf(placarDeB));
                        } else {
                            int i = Integer.parseInt(textEdit6.getText().toString());
                            i++;
                            placarDeB = 0;
                            placarDeA = 0;
                            textEdit2.setText(String.valueOf(placarDeB));
                            textEdit5.setText(String.valueOf(placarDeA));
                            textEdit6.setText(String.valueOf(i));
                            if (i == 3) {
                                Intent intent = new Intent(Partida.this, FimDaPartida.class);
                                intent.putExtra("sets de B", String.valueOf(i));
                                startActivity(intent);
                            }
                        }
                    }
                }
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textEdit3.getText().toString().isEmpty()) {
                    textEdit3.setText("0");
                }
                int faltasDeA = Integer.parseInt(textEdit3.getText().toString());
                faltasDeA++;
                textEdit3.setText(String.valueOf(faltasDeA));
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textEdit4.getText().toString().isEmpty()) {
                    textEdit4.setText("0");
                }
                int faltasDeB = Integer.parseInt(textEdit4.getText().toString());
                faltasDeB++;
                textEdit4.setText(String.valueOf(faltasDeB));
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textEdit1.setText("0");
                textEdit2.setText("0");
                textEdit3.setText("0");
                textEdit4.setText("0");
                textEdit5.setText("0");
                textEdit6.setText("0");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Partida.this, PreparoParaPartida.class);
                startActivity(intent);
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();
                String reset = intent.getStringExtra("reset");
                textEdit1.setText(reset);
                textEdit6.setText(reset);
            }
        });
    }
}