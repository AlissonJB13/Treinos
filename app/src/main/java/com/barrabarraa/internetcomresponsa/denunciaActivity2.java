package com.barrabarraa.internetcomresponsa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class denunciaActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_denuncia2);
    }

    public void voltarMenuPrincipal(View view){
        Intent intent = new Intent(denunciaActivity2.this, MainActivity.class);
        startActivity(intent);
    }
}