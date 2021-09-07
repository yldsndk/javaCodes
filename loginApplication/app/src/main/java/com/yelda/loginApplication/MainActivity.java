package com.yelda.loginApplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
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

                Intent intent = new Intent(getApplicationContext(), Activity2.class);
            }

        });
    }
}