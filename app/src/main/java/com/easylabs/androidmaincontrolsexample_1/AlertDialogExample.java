package com.easylabs.androidmaincontrolsexample_1;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AlertDialogExample extends AppCompatActivity
        implements View.OnClickListener {
    // AlertDialog - диалоговое окно, появляющееся поверх контейнера компоновки
    AlertDialog mAlertDialog;
    Button btShowDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_dialog_example);
        setTitle("AlertDialog Example");

        btShowDialog = (Button) findViewById(R.id.btShowDialog);
        btShowDialog.setOnClickListener(this);
        createAlertDialog();
    }

    private void createAlertDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Тайтл Диалога");
        builder.setMessage("Сообщение диалога");
        builder.setPositiveButton("Да",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(AlertDialogExample.this,
                                "Нажата позитвная кнопка",
                                Toast.LENGTH_SHORT).show();
                    }
                });
        builder.setNegativeButton("Нет",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(AlertDialogExample.this,
                                "Нажата отрицательная кнопка",
                                Toast.LENGTH_SHORT).show();
                    }
                });
        builder.setNeutralButton("Нейтрально",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(AlertDialogExample.this,
                                "Нажата нейтральная кнопка",
                                Toast.LENGTH_SHORT).show();
                    }
                });
        // Создаём AlertDialog с помощью builder
        mAlertDialog = builder.create();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btShowDialog:
                // Отображаем AlertDialog
                mAlertDialog.show();
                break;
        }
    }
}
