package com.example.crudandroid;

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

    public void viewInsert(View vista ){
        Intent intencion = new Intent(getApplicationContext(), viewInsert.class);
        startActivity(intencion);
    }

    public void viewSelect(View vista){
        Intent intencion = new Intent(getApplicationContext(), viewInsert.class);
        startActivity(intencion);
    }
}