package com.gsep.myfin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DescontoCSMenuActivity extends AppCompatActivity {
    private Button dButton,vButton,tButton,pButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desconto_csmenu);

        dButton = (Button)findViewById(R.id.dButton);
        vButton = (Button)findViewById(R.id.vButton);
        tButton = (Button)findViewById(R.id.tButton);
        pButton = (Button)findViewById(R.id.pButton);

        dButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DescontoCSMenuActivity.this, CalcDescSCActivity.class);
                startActivity(intent);
            }
        });

        vButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DescontoCSMenuActivity.this, CalcNominalSCActivity.class);
                startActivity(intent);
            }
        });

        tButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DescontoCSMenuActivity.this, CalcTaxaSCActivity.class);
                startActivity(intent);
            }
        });

        pButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DescontoCSMenuActivity.this, CalcTempoSCActivity.class);
                startActivity(intent);
            }
        });
    }
}
