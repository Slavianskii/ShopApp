package com.example.shopapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class CartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
    }

    public void Checkout(View view) {
        //TO DO something

        //Intent intent = new Intent(CartActivity.this, MainActivity.class);
        Toast.makeText(getApplicationContext(), "Thank you for your purchase!", Toast.LENGTH_SHORT).show();
        //startActivity(intent);
        finish();

    }
}