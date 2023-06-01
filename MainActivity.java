package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText input1, input2;
    Button swap, check;
    String swapText1, swapText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input1 = findViewById(R.id.input1);
        input2 = findViewById(R.id.input2);
        swap = findViewById(R.id.swap);
        check = findViewById(R.id.check);

        swap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                swapText1 = input1.getText().toString();
                swapText2 = input2.getText().toString();

                input1.setText(swapText2);
                input2.setText(swapText1);
            }
        });

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String result = "";

                if (swapText1.equals(swapText2)) {
                    result = "SAME";
                } else {
                    result = "NOT SAME";
                }

                Intent intent = new Intent(MainActivity.this, display.class);
                intent.putExtra("displayResult", result);
                startActivity(intent);
            }
        });
    }


}