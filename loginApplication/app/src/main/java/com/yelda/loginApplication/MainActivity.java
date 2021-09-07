package com.yelda.loginApplication;

import static com.yelda.loginApplication.R.layout.activity2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView, textView2;
    EditText isim;
    RadioButton radioButton1, radioButton2;
    Button kayitOl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    void tanimlama(){
        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        isim = findViewById(R.id.isim);
        radioButton1 = findViewById(R.id.radioButton1);
        radioButton2 = findViewById(R.id.radioButton2);
        kayitOl = findViewById(R.id.kayitOl);

        kayitOl.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                textView2.setText("Kayit Basarili");

                Intent intent = new Intent(MainActivity.this,
                        Activity2.class);
                startActivity(intent);
            }
        });
    }
}