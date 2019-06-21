package com.gsep.myfin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private CardView imageJ,imageD;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageJ = (CardView) findViewById(R.id.image1);
        imageD = (CardView) findViewById(R.id.image2);


        imageJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, JurosActivity.class);
                startActivity(intent);
            }
        });

        imageD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getApplicationContext(),"Imagem 2",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this, DescontoActivity.class);
                startActivity(intent);
            }
        });

    }
}
