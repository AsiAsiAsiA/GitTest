package com.example.gittest;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button, button2;
    EditText editText;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editText);
        textView.setText("Privet");

        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        textView = findViewById(R.id.textView);
        button.setOnClickListener((v) -> {
            Toast.makeText(this, "Click", Toast.LENGTH_LONG).show();
            textView.setText("Clicked");
        });

        button2.setOnClickListener((v) -> {
            button.setText("Тряпка");
            Toast.makeText(this, "Change name button", Toast.LENGTH_LONG).show();
        });
    }
}
