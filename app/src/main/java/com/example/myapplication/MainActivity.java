package com.example.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    static String login = "login";
    static String password = "12345";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button button = findViewById(R.id.button);
        final TextView textView = findViewById(R.id.textView);
        final EditText editText = findViewById(R.id.editText);
        final EditText editText2 = findViewById(R.id.editText2);

        editText.setText(login);
        editText2.setText(password);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((editText.getText().toString().equals(login)) && (editText2.getText().toString().equals(password))) {
                    textView.setTextColor(Color.GREEN);
                    textView.setText("Верно");
                } else {
                    Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                    startActivityForResult(intent, 1);
                }
                editText.setText("");
                editText2.setText("");
            }
        });

        }
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        final EditText editText = findViewById(R.id.editText);
        final EditText editText2 = findViewById(R.id.editText2);

        if (data == null) {return;}
        login = data.getStringExtra("login");
        password = data.getStringExtra("password");
        editText.setText(login);

    }
}

