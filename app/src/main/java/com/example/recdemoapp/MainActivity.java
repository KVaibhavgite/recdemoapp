package com.example.recdemoapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity
{
   RecyclerView rcv;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcv=(RecyclerView)findViewById(R.id.rclview);
        rcv.setLayoutManager(new LinearLayoutManager(this));

        String arr[]={"Salad",
                "Sandwich",
                "Bread",
                "Steak",
                "Tuna Steak",
                "Fish",
                "Shrimp",
                "Rice",
                "Spaghetti",
                "Pizza",
                "Hamburger",
                "Eggs",
                "Cheese",
                "Sausages",
                "Apple Juice",
                "Grape Juice",
                "Milk",
                "Candy",
                "Cookie",
                "Pie",
                "Cake",
                "Cupcake"
        };
        rcv.setAdapter(new myAdapter(arr));

    }
}
