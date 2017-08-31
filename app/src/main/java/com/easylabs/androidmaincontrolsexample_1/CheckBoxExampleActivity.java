package com.easylabs.androidmaincontrolsexample_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class CheckBoxExampleActivity extends AppCompatActivity
        implements View.OnClickListener {
    CheckBox cbIsCoordinates;
    CheckBox cbIsNotify;
    Button btShowInfo;

    // boolean CheckBox.isChecked() - возращает значение true,
    // если CheckBox выбран, или false, если не выбран

    // boolean CheckBox.setChecked() - изменяет значение checked (выбран ли)
    // CheckBox

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);

        cbIsCoordinates = (CheckBox) findViewById(R.id.cbIsCoordinates);
        cbIsNotify = (CheckBox) findViewById(R.id.cbIsNotify);
        btShowInfo = (Button) findViewById(R.id.btShowInfo);
        // Привязываем к кнопке обработчик на нажатие onClick
        btShowInfo.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btShowInfo: {
                String str = "";

                if (cbIsCoordinates.isChecked()) {
                    str += "Отслеживать координаты\n";
                }

                if (cbIsNotify.isChecked()) {
                    str += "Уведомления включены\n";
                }

                if (str.equals("")) {
                    str += "Не выбран ни один из CheckBox'ов";
                }

                Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
            }
        }
    }
}
