package com.andrewxue.sampleapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showText(View view) {
        EditText et = (EditText) findViewById(R.id.editText);
        TextView tv = (TextView) findViewById(R.id.textView);
        Button sendText = (Button) findViewById(R.id.send_text_button);

        String input = et.getText().toString();
        tv.setText(input);
    }
}
