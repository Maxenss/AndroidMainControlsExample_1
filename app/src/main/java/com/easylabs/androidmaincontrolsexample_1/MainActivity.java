package com.easylabs.androidmaincontrolsexample_1;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    // Жизненный цикл Activity. Основные View-элементы.
    // Button, Switch, TextView, EditView, CheckBox,
    // LinearLayout, ScrollView.
    // Intent. Сохранение данныъ в Intent и чтение данных
    // из Intenta. Программное создание View-элементов.

    // Match Parent - заполнить всё свободное пространство родителя
    // Wrap Content - заполнить столько пространства, что компонент
    //                отображался корректно

    // Домащнее задание : прочитать про Context,

    LinearLayout llMainActivity;
    Button btNewButton;
    // Context - (упрощенно) это объект, который хранит все данные о Activity
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;

        llMainActivity =
                (LinearLayout) findViewById(R.id.llMainActivity);
        btNewButton = (Button) findViewById(R.id.btNewButton);
        btNewButton.setOnClickListener(btNewButtonOnClickListener);
    }


    View.OnClickListener btNewButtonOnClickListener =
            new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Button button = new Button(context);
                    button.setText("Новая кнопка");
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            view.setVisibility(View.GONE);
                        }
                    });
                    LinearLayout.LayoutParams buttonLayoutParams =
                            new LinearLayout.LayoutParams(
                                    LinearLayout.LayoutParams.MATCH_PARENT,
                                    LinearLayout.LayoutParams.WRAP_CONTENT);

                    llMainActivity.addView(button, buttonLayoutParams);
                }
            };
}
