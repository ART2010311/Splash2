package com.example.splash2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=findViewById(R.id.changetext);
        String newString;
        if(savedInstanceState==null){
            Bundle extras=getIntent().getExtras();
            if(extras==null) {
                newString = "Empty";
            }else {
                newString = extras.getString("STRING_I_NEED");
            }
        }
        else{

                newString=(String) savedInstanceState.getSerializable("STRING_I_NEED");
            }
            t1.setText(newString);
        }
    }
