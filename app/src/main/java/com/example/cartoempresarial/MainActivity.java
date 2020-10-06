package com.example.cartoempresarial;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView siteTextView;
    private TextView phoneTextView;
    private TextView locateTextView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        siteTextView = findViewById(R.id.textViewsite);
        phoneTextView = findViewById(R.id.textViewPhone);
        //locateTextView = findViewById(R.id.);
    }

    private void openWebPage(String url){
        Uri webPage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webPage);
        startActivity(intent);
    }

    private void dialPhoneNumber(String number){
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse(number));
        startActivity(intent);
    }

    private final String LOCATION = "geo: -1.448335, -48.491765?z=18";
}
