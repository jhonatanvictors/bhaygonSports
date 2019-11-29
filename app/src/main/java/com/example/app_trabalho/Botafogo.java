package com.example.app_trabalho;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Botafogo extends AppCompatActivity {

    private EditText time;
    private EditText txtTime;
    private Button btnAdicionar;

    SQLiteDatabase banco;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_botafogo);

        time = (EditText) findViewById(R.id.txtTime);

        banco = openOrCreateDatabase("app", Context.MODE_PRIVATE, null);
        banco.execSQL("CREATE TABLE IF NOT EXISTS cadastro" +
                "(id INTEGER PRIMARY KEY AUTOINCREMENT," +
                " time VARCHAR(50) NOT NULL);");

        txtTime = findViewById(R.id.txtTime);
        btnAdicionar = findViewById(R.id.btnAdicionar);

        btnAdicionar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = txtTime.getText().toString().toLowerCase();
                if (s.equals("real madrid")) {
                    Toast.makeText(Botafogo.this, "Time incluído", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(Botafogo.this, RealMadrid.class);
                    startActivity(intent);
                }
            }
        });
    }
}

