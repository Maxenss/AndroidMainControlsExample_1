package com.easylabs.androidmaincontrolsexample_1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class TextViewExampleActivity extends AppCompatActivity
        implements View.OnClickListener {
    EditText etTextForTextView;
    TextView textView;
    Button btShowText;
    Button btToTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view_example);
        setTitle("TextView Example");

        etTextForTextView = (EditText) findViewById(R.id.etTextForTextView);
        textView = (TextView) findViewById(R.id.textView);
        btShowText = (Button) findViewById(R.id.btShowText);
        btToTextView = (Button) findViewById(R.id.btToTextView);

        btShowText.setOnClickListener(this);
        btToTextView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            // Отображаем на экране текст из textView
            case R.id.btShowText:
                Toast.makeText(this,
                        "Текст в textView : " + textView.getText().toString(),
                        Toast.LENGTH_SHORT).show();
                break;
            // Переносим текст из EditText в TextView
            case R.id.btToTextView:
                String editTextContent = etTextForTextView.getText().toString();
                textView.setText(editTextContent);
                break;
        }
    }
}
