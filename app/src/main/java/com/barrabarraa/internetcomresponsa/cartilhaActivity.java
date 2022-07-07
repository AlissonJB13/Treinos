package com.barrabarraa.internetcomresponsa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class cartilhaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cartilha);
    }

    public void voltarMenuPrincipal(View view){
        Intent intent = new Intent(cartilhaActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void mostrarCartilha1(View view){
        Intent intent = new Intent(cartilhaActivity.this, cartilha1Activity.class);
        startActivity(intent);
    }

    public void mostrarCartilha2(View view){
        Intent intent = new Intent(cartilhaActivity.this, cartilha2Activity.class);
        startActivity(intent);
    }

    public void mostrarCartilha3(View view){
        Intent intent = new Intent(cartilhaActivity.this, cartilha3Activity.class);
        startActivity(intent);
    }
}