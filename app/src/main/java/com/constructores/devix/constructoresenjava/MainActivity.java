package com.constructores.devix.constructoresenjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Perro perro = new Perro();
        perro.setColor("Rojo");
        perro.setEdad(3);
        perro.setRaza("PitBull");

        //Toast.makeText(this,perro.toString(),Toast.LENGTH_LONG).show();


        Carro carro = new Carro("Negro","Carrera");
        Toast.makeText(this,carro.toString(),Toast.LENGTH_LONG).show();

    }
}
