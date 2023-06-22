package com.example.coffeshop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button minus;
    private Button plus;
    private TextView coffeenum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        minus = findViewById(R.id.bMinus);
        plus = findViewById(R.id.bPlus);
        coffeenum = findViewById(R.id.coffenumber);
    }

    public void btnPlus(){
        Toast.makeText(getApplicationContext(), "This is the addition button", Toast.LENGTH_SHORT).show();
    }
    public void btnMinus(){
        Toast.makeText(getApplicationContext(), "This is the subtraction button", Toast.LENGTH_SHORT).show();
    }
}