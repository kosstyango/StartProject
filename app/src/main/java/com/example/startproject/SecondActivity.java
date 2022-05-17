package com.example.startproject;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle saved){
        super.onCreate(saved);
        setContentView(R.layout.second_activity);
        String text2 = getIntent().getStringExtra("TextForTransferring"); //достаём из Intent переданный текст
        TextView name2 = findViewById(R.id.textView2); //находим нужное окно
        name2.setText(text2); //вставляем туда текст из первой активити
    }

    public void finish(View view){ //обработчик нажатия второй кнопки
        Button button2 = findViewById(R.id.button2);
            Toast.makeText(this, R.string.Похвала, Toast.LENGTH_LONG).show();
            button2.setText("GAME OVER"); //меняем текст на кнопке
            button2.setEnabled(false); //деактивируем кнопку
    }
}