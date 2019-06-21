package com.gsep.myfin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class JurosMenuActivity extends AppCompatActivity {
    private Button jButton,cButton,tButton,pButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juros_menu);

        jButton = (Button) findViewById(R.id.jButton);
        cButton = (Button)findViewById(R.id.cButton);
        tButton = (Button) findViewById(R.id.tButton);
        pButton = (Button)findViewById(R.id.pButton);

        jButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(JurosMenuActivity.this, CalcJurosSActivity.class);
                startActivity(intent);
            }
        });

        cButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(JurosMenuActivity.this, CalcCapitalSActivity.class);
                startActivity(intent);
            }
        });

        tButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(JurosMenuActivity.this, CalcTaxaSActivity.class);
                startActivity(intent);
            }
        });

        pButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(JurosMenuActivity.this, CalcTempoSActivity.class);
                startActivity(intent);
            }
        });
    }
}
