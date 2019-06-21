package com.gsep.myfin;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;
import java.text.NumberFormat;



import android.app.Activity;

import android.os.Bundle;

import android.text.Editable;

import android.text.TextWatcher;

import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.github.rtoshiro.util.format.SimpleMaskFormatter;
import com.github.rtoshiro.util.format.text.MaskTextWatcher;

import br.com.sapereaude.maskedEditText.MaskedEditText;


public class CalcJurosSActivity extends Activity {
    Button btnCalcular;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc_juros_s);

        final EditText valorMonetario = (EditText)findViewById(R.id.capital);
        final EditText valorPorcentagem = (EditText)findViewById(R.id.Taxa);
        final EditText tempoP = (EditText)findViewById(R.id.tempo);
        btnCalcular = (Button)findViewById(R.id.btnCalc);
        final TextView res = (TextView)findViewById(R.id.iResultado);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (valorMonetario.getText().toString().equals("")) {

                    valorMonetario.setError("Campo vazio");

                } else if (valorPorcentagem.getText().toString().equals("")) {

                    valorPorcentagem.setError("Campo vazio");
                } else if (tempoP.getText().toString().equals("")) {

                    tempoP.setError("Campo vazio");
                } else {
                    float cap = Float.parseFloat(valorMonetario.getText().toString());
                    float juros = Float.parseFloat(valorPorcentagem.getText().toString());
                    float temp = Float.parseFloat(tempoP.getText().toString());
                    float result = cap * (juros / 100) * temp;
                    DecimalFormat df = new DecimalFormat("##.##");
                    res.setText("Juros: R$" + df.format(result));
                }
            }
        });

    }

}
