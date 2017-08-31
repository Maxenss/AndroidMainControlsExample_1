package com.easylabs.androidmaincontrolsexample_1;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class EditTextActivityExample extends AppCompatActivity {
    EditText etTextExample;
    Button btGetText;
    Activity mActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);
        setTitle("Example EditText");
        mActivity = this;

        etTextExample = (EditText) findViewById(R.id.etTextExample);
        btGetText = (Button) findViewById(R.id.btGetText);

        btGetText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mActivity,
                        etTextExample.getText().toString(),
                        Toast.LENGTH_SHORT).show();
            }
        });

        // События изменения текста в EditText
        etTextExample.addTextChangedListener(new TextWatcher() {
            String previousStr;
            String currentStr;

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                previousStr = charSequence.toString();
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                currentStr = charSequence.toString();
            }

            @Override
            public void afterTextChanged(Editable editable) {
                Toast.makeText(mActivity, "Строка " +
                                previousStr +
                                " изменилась на " +
                                currentStr,
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
