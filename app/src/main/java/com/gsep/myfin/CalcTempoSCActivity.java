package com.gsep.myfin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class CalcTempoSCActivity extends AppCompatActivity {
    Button btnCalcular;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc_tempo_sc);

        final EditText desconto = (EditText)findViewById(R.id.desconto);
        final EditText vNominal = (EditText)findViewById(R.id.vNominal);
        final EditText taxaDesc = (EditText)findViewById(R.id.taxaDesc);
        btnCalcular = (Button)findViewById(R.id.btnCalc);
        final TextView res = (TextView)findViewById(R.id.iResultado);
        final TextView res2 = (TextView)findViewById(R.id.iResultado2);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (desconto.getText().toString().equals("")) {

                    desconto.setError("Campo vazio");

                } else if (vNominal.getText().toString().equals("")) {

                    vNominal.setError("Campo vazio");
                } else if (taxaDesc.getText().toString().equals("")) {

                    taxaDesc.setError("Campo vazio");
                } else {
                    float desc = Float.parseFloat(desconto.getText().toString());
                    float nom = Float.parseFloat(vNominal.getText().toString());
                    float juros = Float.parseFloat(taxaDesc.getText().toString());
                    float result = (desc/((juros/100)*nom));
                    DecimalFormat df = new DecimalFormat("##.##");
                    res.setText("Tempo: " + df.format(result));
                }
            }
        });
    }
}
