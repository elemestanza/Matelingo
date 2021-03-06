package com.example.matelingo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Ajustes extends AppCompatActivity {

    ImageView botonAtras;
    Button ajustes2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajustes);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        botonAtras = (ImageView) findViewById(R.id.botonatras);
        ajustes2 = (Button) findViewById(R.id.ajustes2);

        botonAtras.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                startActivity(new Intent(Ajustes.this,Principal.class));
            }
        });

        ajustes2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Ajustes.this,Ajustes2.class);
                setContentView(R.layout.activity_ajustes2);
                startActivity(intent);
                finish();
            }
        });
    }
}