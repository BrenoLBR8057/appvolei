package com.example.appvolei;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PreparoParaPartida extends AppCompatActivity {

    private EditText textEdit1;
    private EditText textEdit2;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preparo_para_partida);

        textEdit1 = findViewById(R.id.editTextTextPersonName);
        textEdit2 = findViewById(R.id.editTextTextPersonName2);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PreparoParaPartida.this,Partida.class);
                String timeA = intent.getStringExtra(textEdit1.toString());
                String timeB = intent.getStringExtra(textEdit2.toString());

                intent.putExtra("Time A",timeA);
                intent.putExtra("Time B",timeB);

                startActivity(intent);
            }
        });
    }
}
