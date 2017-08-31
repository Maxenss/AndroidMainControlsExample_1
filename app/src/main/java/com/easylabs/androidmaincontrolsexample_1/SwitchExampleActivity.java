package com.easylabs.androidmaincontrolsexample_1;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Switch;

public class SwitchExampleActivity extends AppCompatActivity {
    Switch switchSetColor;
    LinearLayout llMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch_example);
        setTitle("Switch Example");

        llMain = (LinearLayout) findViewById(R.id.llMain);
        switchSetColor = (Switch) findViewById(R.id.switchSetColor);
        // Обработчик на изменения состояния Switch
        switchSetColor.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton,
                                         boolean b) {
                // boolean b - это значение Switch после изменения

                if (b) {
                    // Выставить зеленый фон для llMain
                    llMain.setBackgroundColor(Color.parseColor("#228B22"));
                    // Выставить цвет текста в switchSetColor на белый
                    switchSetColor.setTextColor(Color.parseColor("#FFFFFF"));
                } else {
                    // Выставить белый фон для llMain
                    llMain.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    // Выставить цвет текста в switchSetColor на черный
                    switchSetColor.setTextColor(Color.parseColor("#000000"));
                }
            }
        });

    }
}
