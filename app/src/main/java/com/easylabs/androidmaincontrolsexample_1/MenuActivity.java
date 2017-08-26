package com.easylabs.androidmaincontrolsexample_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MenuActivity extends AppCompatActivity
        implements View.OnClickListener {

    Button btStartButtonExample;
    Button btStartEditTextActivity;
    Button btStartSwitchExample;
    Button btStartCheckBoxExample;
    Button btStartTextViewExample;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        setTitle("Выберите пункт меню");

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
                        EditText.class);
                startActivity(intent);
                break;
            case R.id.btStartSwitchExample:
                break;
            case R.id.btStartCheckBoxExample:
                break;
            case R.id.btStartTextViewExample:
                break;
        }
    }
}
