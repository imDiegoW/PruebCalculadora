package com.example.pruebcalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public abstract class ventanasuma extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventanasuma);
    }
    public void anterior(View view)
}
    //objeto para cambiar de activity
    Intent intent2 = new Intent(this, MainActivity.class);
    //iniciar o lanzar actividad
    abstract startActivity(intent2);
}

