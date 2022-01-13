package com.example.passing_valuesinactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button detail;
    TextView n,n1,n2,n3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        detail = findViewById(R.id.btn);
        n = findViewById(R.id.text);
        n1 = findViewById(R.id.text1);
        n2= findViewById(R.id.text2);
        n3= findViewById(R.id.text3);

        detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, InfoActivity.class);
                startActivity(i);
            }
        });
                Bundle bun = getIntent().getExtras();
                String val = bun.getString("fn");
                String val1 = bun.getString("add");
                String val2 = bun.getString("call");
                String val3 = bun.getString("email");
                n.setText(val);
                n1.setText(val1);
                n2.setText(val2);
                n3.setText(val3);

    }
}