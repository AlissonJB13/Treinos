package com.barrabarraa.internetcomresponsa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;

public class sobreActivity3 extends AppCompatActivity {
    //TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre3);
       /* textView = findViewById(R.id.txSobre);
        textView.setMovementMethod(new ScrollingMovementMethod());*/

    }

    public void voltarMenuPrincipal(View view){
        Intent intent = new Intent(sobreActivity3.this, MainActivity.class);
        startActivity(intent);
    }
}