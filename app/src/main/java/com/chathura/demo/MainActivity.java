package com.chathura.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editText = null;
    private TextView textView = null;
    private static final String HELLO = "Hello ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.userName);
        textView = findViewById(R.id.textView);
    }
    protected void readText(View view) {
        String userName = editText.getText().toString();
        textView.setText(HELLO.concat(userName));
    }
}
