package com.gsep.myfin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DescontoActivity extends Activity {
    private Button dsButton;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descontos);

       dsButton = (Button)findViewById(R.id.dsButton);

        dsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DescontoActivity.this, DescontoCSMenuActivity.class);
                startActivity(intent);
            }
        });
    }
}
