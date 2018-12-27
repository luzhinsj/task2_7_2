package com.example.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final EditText etLogin = (EditText) findViewById(R.id.editText3);
        final EditText etPassword = (EditText) findViewById(R.id.editText4);
        final Button bSave = (Button) findViewById(R.id.button2);

        bSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("login", etLogin.getText().toString());
                intent.putExtra("password", etPassword.getText().toString());
                setResult(RESULT_OK, intent);
                finish();
            }
        });

    }
}
