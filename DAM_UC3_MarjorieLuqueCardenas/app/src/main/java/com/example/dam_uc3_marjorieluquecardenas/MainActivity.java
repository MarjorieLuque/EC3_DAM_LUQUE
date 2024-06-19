package com.example.dam_uc3_marjorieluquecardenas;
import android.widget.Toast;
import android.widget.Button;
import android.app.Activity;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("facebook");



        Button btn1 = findViewById(R.id.buttonRegistrar);
        btn1.setOnClickListener(view -> Toast.makeText(this, "Se envió sus datos", Toast.LENGTH_SHORT).show());
    }


}