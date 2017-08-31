package com.easylabs.androidmaincontrolsexample_1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity
        implements View.OnClickListener {

    Button btStartButtonExample;
    Button btStartEditTextActivity;
    Button btStartSwitchExample;
    Button btStartCheckBoxExample;
    Button btStartTextViewExample;

    private void initialize() {
        btStartButtonExample =
                (Button) findViewById(R.id.btStartButtonExample);
        btStartEditTextActivity =
                (Button) findViewById(R.id.btStartEditTextActivity);
        btStartSwitchExample =
                (Button) findViewById(R.id.btStartSwitchExample);
        btStartCheckBoxExample =
                (Button) findViewById(R.id.btStartCheckBoxExample);
        btStartTextViewExample =
                (Button) findViewById(R.id.btStartTextViewExample);

        btStartButtonExample.setOnClickListener(this);
        btStartEditTextActivity.setOnClickListener(this);
        btStartSwitchExample.setOnClickListener(this);
        btStartCheckBoxExample.setOnClickListener(this);
        btStartTextViewExample.setOnClickListener(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        setTitle("Выберите пункт меню");

        try {
            initialize();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.btStartButtonExample:
                intent = new Intent(this,
                        ButtonCreateExampleActivity.class);
                startActivity(intent);
                break;
            case R.id.btStartEditTextActivity:
                intent = new Intent(this,
                        EditTextActivityExample.class);
                startActivity(intent);
                break;
            case R.id.btStartSwitchExample:
                intent = new Intent(this,
                        SwitchExampleActivity.class);
                startActivity(intent);
                break;
            case R.id.btStartCheckBoxExample:
                intent = new Intent(this,
                        CheckBoxExampleActivity.class);
                startActivity(intent);
                break;
            case R.id.btStartTextViewExample:
                intent = new Intent(this,
                        TextViewExampleActivity.class);
                startActivity(intent);
                break;
        }
    }
}
