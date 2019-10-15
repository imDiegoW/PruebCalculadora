package com.example.pruebcalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button bt1, bt2, bt3, bt4;
    TextView msj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        bt1 = (Button) findViewById(R.id.btn1);
        bt2 = (Button)findViewById(R.id.btn2);
        bt3 = (Button)findViewById(R.id.btn3);
        bt4 = (Button)findViewById(R.id.btn4);
        msj = (TextView) findViewById(R.id.msg);


        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);
        bt4.setOnClickListener(this);

    }
    public void siguiente(View view)
    {
        //objeto que permite cambiar entre activities
        Intent intent = new Intent (this, ventanasuma.class);
        //Inicio la actividad o la lanza
        startActivity(intent);

    }

    @Override
    public void onClick(View view)
    {
        if(view.getId()==R.id.btn1)
        {
            msj.setText("Este es el primer boton");
        }
        else if(view.getId()==R.id.btn2)
        {
            Toast.makeText(this, "este es el segundo boton", Toast.LENGTH_LONG).show();
        }
        else if(view.getId()==R.id.btn3)
        {
            Intent intentbtn3 = new Intent(this, ventanasuma.class);
        }

    }
}
