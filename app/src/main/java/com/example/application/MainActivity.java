package com.example.application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView nom, pre;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nom = (EditText)findViewById(R.id.prenom);
        pre = (EditText)findViewById(R.id.no);
        btn = (Button) findViewById(R.id.boutonenvoi);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String nomsaisi = nom.getText().toString();
                final String prenomsaisi = pre.getText().toString();
                Intent intent = new Intent(MainActivity.this, activited.class);
                intent.putExtra("lenom",nomsaisi);
                intent.putExtra("leprenom",prenomsaisi);
                MainActivity.this.startActivity(intent);

            }
        });
    }


}