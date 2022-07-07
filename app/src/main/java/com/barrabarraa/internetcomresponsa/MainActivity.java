package com.barrabarraa.internetcomresponsa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void abrirDenuncia(View view){
        Intent intent = new Intent(MainActivity.this, denunciaActivity2.class);
        startActivity(intent);
    }

    public void abrirCartilhas(View view){
        Intent intent = new Intent(MainActivity.this, cartilhaActivity.class);
        startActivity(intent);
    }
    public void abrirSobre(View view){
        Intent intent = new Intent(MainActivity.this, sobreActivity3.class);
        startActivity(intent);
    }
}