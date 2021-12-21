package com.example.shopapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class GoodsActivity extends AppCompatActivity {
    Item item;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goods);
        Bundle arguments = getIntent().getExtras();
        item = new Item(arguments.get("name").toString(),
                Integer.parseInt(arguments.get("price").toString()),
                Integer.parseInt(arguments.get("img").toString()));


        ImageView imgView = findViewById(R.id.good_img);
        TextView nameView = findViewById(R.id.nam);
        TextView priceView = findViewById(R.id.prc);


        imgView.setImageResource(item.getImg());
        nameView.setText(item.getName());
        priceView.setText(String.valueOf(item.getPrice() + "Руб."));

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab_cart);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GoodsActivity.this, CartActivity.class);
                startActivity(intent);
            }
        });

    }


    public void Add_to_Cart(View view){


    }

}