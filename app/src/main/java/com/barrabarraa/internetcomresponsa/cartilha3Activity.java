package com.barrabarraa.internetcomresponsa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class cartilha3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cartilha3);
    }

    public void voltarCartilhas(View view){
        Intent intent = new Intent(cartilha3Activity.this, cartilhaActivity.class);
        startActivity(intent);
    }
}