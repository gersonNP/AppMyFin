package com.gsep.myfin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class JurosCMenuActivity extends AppCompatActivity {
    private Button mButton,cButton,tButton,pButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juros_cmenu);

        mButton = (Button)findViewById(R.id.mButton);
        cButton = (Button)findViewById(R.id.cButton);
        tButton = (Button)findViewById(R.id.tButton);
        pButton = (Button)findViewById(R.id.pButton);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(JurosCMenuActivity.this, CalcMontCActivity.class);
                startActivity(intent);
            }
        });

        cButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(JurosCMenuActivity.this, CalcCapCActivity.class);
                startActivity(intent);
            }
        });

        tButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(JurosCMenuActivity.this, CalcTaxaCActivity.class);
                startActivity(intent);
            }
        });

        pButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(JurosCMenuActivity.this, CalcTempoCActivity.class);
                startActivity(intent);
            }
        });

    }
}
