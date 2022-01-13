package com.example.passing_valuesinactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class InfoActivity extends AppCompatActivity {
    EditText na,ad, em, co;
    Button infor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        infor = findViewById(R.id.info);
        na = findViewById(R.id.name);
        ad = findViewById(R.id.address);
        em = findViewById(R.id.contact);
        co = findViewById(R.id.email);

        infor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fullName =  na.getText().toString();
                String location = ad.getText().toString();
                String email = em.getText().toString();
                String phone = co.getText().toString();

                Intent i = new Intent(InfoActivity.this,MainActivity.class);
                Bundle b = new Bundle();
                b.putString("fn",fullName);
                b.putString("add",location);
                b.putString("call",phone);
                b.putString("email",email);
                i.putExtras(b);
                startActivity(i);
            }
        });
    }
}