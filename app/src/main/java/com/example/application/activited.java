package com.example.application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

public class activited extends AppCompatActivity {

    private String leprenom, lenom;
    private TextView textprenom, textnom,tail,poi,rst;
    private Button btn,btt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activited);

        lenom=getIntent().getStringExtra("lenom");
        leprenom=getIntent().getStringExtra("leprenom");

        textnom = (TextView)findViewById(R.id.textView1);
        textprenom=(TextView)findViewById(R.id.textnom);
        poi=(TextView)findViewById(R.id.poids);
        rst=(TextView)findViewById(R.id.textView7);
        tail=(TextView)findViewById(R.id.editText3);
        btn = (Button)findViewById(R.id.button1);
        btt = (Button)findViewById(R.id.button2);

        textnom.setText(lenom);
        textprenom.setText(leprenom);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double lataille = Double.parseDouble(tail.getText().toString());
                Double lepoids = Double.parseDouble(poi.getText().toString());
                Double imc = lepoids/(lataille*lataille);
                rst.setText("M."+lenom+" votre imc est: "+imc);
            }
        });
        btt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rst.setText("Pas encore implémenté !");

            }
        });

    }
}