package com.gsep.myfin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class CalcDescSCActivity extends AppCompatActivity {
    Button btnCalcular;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc_desc_sc);

        final EditText vNominal = (EditText)findViewById(R.id.vNominal);
        final EditText taxaDesc = (EditText)findViewById(R.id.taxaDesc);
        final EditText tempoP = (EditText)findViewById(R.id.tempo);
        btnCalcular = (Button)findViewById(R.id.btnCalc);
        final TextView res = (TextView)findViewById(R.id.iResultado);
        final TextView res2 = (TextView)findViewById(R.id.iResultado2);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (vNominal.getText().toString().equals("")) {

                    vNominal.setError("Campo vazio");

                } else if (taxaDesc.getText().toString().equals("")) {

                    taxaDesc.setError("Campo vazio");
                } else if (tempoP.getText().toString().equals("")) {

                    tempoP.setError("Campo vazio");
                } else {
                    float vNom = Float.parseFloat(vNominal.getText().toString());
                    float juros = Float.parseFloat(taxaDesc.getText().toString());
                    float temp = Float.parseFloat(tempoP.getText().toString());
                    float result = vNom*(juros/100)*temp;
                    float result2 = vNom-result;
                    DecimalFormat df = new DecimalFormat("##.##");
                    res.setText("Desconto: R$" + df.format(result));
                    res2.setText("Valor Atual: R$"+df.format(result2));
                }
            }
        });
    }
}
