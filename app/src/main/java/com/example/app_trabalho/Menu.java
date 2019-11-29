package com.example.app_trabalho;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        final Button jogos = (Button) findViewById(R.id.btnJogos);
        jogos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jogosActivity();
            }
        });
        final Button times = (Button) findViewById(R.id.btnTimes);
        times.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                timesActivity();
            }
        });
        final Button competicao = (Button) findViewById(R.id.btnCompeticao);
        competicao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                competicaoActivity();
            }
        });
    }
    private void jogosActivity(){startActivity(new Intent(Menu.this, Jogos.class));}
    private void timesActivity(){startActivity(new Intent(Menu.this, Time_favorito.class));}
    private void competicaoActivity(){startActivity(new Intent(Menu.this, Competicao.class));}
}




