package com.example.certamen_n1_enzo_seplveda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

     private Button Btnvolver;
     private TextView Nom;
     private TextView Prom;
     private TextView Info;
     private TextView Carr;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        RecibirDatos();
        Btnvolver = (Button)findViewById(R.id.button2);

        Bundle extras = getIntent().getExtras();
        String N1 = extras.getString("Nombre");
        String C1 = extras.getString("Carrera");
        Float R1 = extras.getFloat("Resultado");

        Nom= (TextView) findViewById(R.id.NombreEstudiante);
        Nom.setText(N1);
        Carr= (TextView) findViewById(R.id.eTinformacion);
        Carr.setText(C1);
        Prom= (TextView) findViewById(R.id.Promedio);
        Prom.setText(R1.toString());
        Info= (TextView) findViewById(R.id.eTinformacion);
        Info.setText(N1+" Que estudia la carrera de "+C1+" y su promedio de notas es de:  "+R1);


        Btnvolver.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent Btnvolver = new Intent(MainActivity2.this,MainActivity.class);

                startActivity(Btnvolver);
            }
        });

    }

    private void  RecibirDatos(){
        Bundle Info_ = getIntent().getExtras();

    }
}