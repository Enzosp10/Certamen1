package com.example.certamen_n1_enzo_seplveda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

     Button btncalc;
     EditText Nombre;
     EditText Carrera;
     TextView Resultado;
     EditText nota1;
     EditText nota2;
     EditText nota3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nota1 = (EditText) findViewById(R.id.nota1);
        nota2 = (EditText) findViewById(R.id.nota2);
        nota3 = (EditText) findViewById(R.id.nota3);
        Intent act = new Intent(this,MainActivity2.class);
        Nombre = (EditText)findViewById(R.id.eTnombre);
        Carrera = (EditText)findViewById(R.id.eTcarrera);

        btncalc = (Button)findViewById(R.id.btncalc1);

        btncalc.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String prueba = Nombre.getText().toString();
                if (Nombre.getText().toString().equals("")|| Carrera.getText().toString().equals("") || nota1.getText().toString().equals("")|| nota2.getText().toString().equals("")||nota3.getText().toString().equals("")||prueba.equals("")){
                    Snackbar mySnackbar = Snackbar.make(view, "Debe ingresar sus datos",Snackbar.LENGTH_LONG);
                    mySnackbar.show();

                }
                else{
                    float Resultado=(Float.parseFloat(nota1.getText().toString())+Float.parseFloat(nota2.getText().toString())+Float.parseFloat(nota3.getText().toString()))/3;
                    act.putExtra("Nombre",Nombre.getText().toString());
                    act.putExtra("Carrera",Carrera.getText().toString());
                    act.putExtra("Resultado",Resultado);

                    Intent btncalc = new Intent(MainActivity.this,MainActivity2.class);

                    startActivity(act);
                }

            }
        });
    }
}