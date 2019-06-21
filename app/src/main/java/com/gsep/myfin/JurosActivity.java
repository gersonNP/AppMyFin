package com.gsep.myfin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class JurosActivity extends Activity {
    private Button js,jc;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juros);

        js = (Button) findViewById(R.id.jsButton);
        jc = (Button)findViewById(R.id.jcButton);

        js.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(JurosActivity.this, JurosMenuActivity.class);
                startActivity(intent);
            }
        });

        jc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(JurosActivity.this, JurosCMenuActivity.class);
                startActivity(intent);
            }
        });
    }
}