package com.example.certamen_n1_enzo_seplveda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    
    Button Btnaceptar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Btnaceptar = (Button)findViewById(R.id.btnAceptar);
        Btnaceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Btnaceptar = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(Btnaceptar);
            }
        });
    }
}