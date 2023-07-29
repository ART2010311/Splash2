package com.example.splash2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;

public class Activity2 extends AppCompatActivity {
    Button b1;
    EditText e1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        b1=findViewById(R.id.button);

        e1=findViewById(R.id.editTextText);
        b1.setOnClickListener(view -> {
            Intent i = new Intent(Activity2.this, MainActivity.class);
            String str = e1.getText().toString();
            i.putExtra("STRING_I_NEED", str);
            startActivity(i);
        });

    }
}