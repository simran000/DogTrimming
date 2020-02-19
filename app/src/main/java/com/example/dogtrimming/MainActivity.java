package com.example.dogtrimming;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    Adapter adapter;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image = findViewById(R.id.image);

        RecyclerView recyclerView =findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter= new Adapter(this,getMyList());
        recyclerView.setAdapter(adapter);

    }

    private ArrayList<Product> getMyList() {

        ArrayList<Product> products = new ArrayList<>();
        Product p = new Product();
        p.setTitle("BASIC TRIMMING");
        p.setImage(R.drawable.dog);
        p.setBreed("Breed Type");
        p.setPrice("Price/Charges");
        p.setBreed1("Small");
        p.setPrice1("₹700");
        p.setBreed2("Medium");
        p.setPrice2("₹700");
        p.setBreed3("Large");
        p.setPrice3("₹700");
        p.setBreed4("Extra Large");
        p.setPrice4("₹700");
        products.add(p);

        p = new Product();
        p.setTitle("FULL TRIMMING");
        p.setImage(R.drawable.dog);
        p.setBreed("Breed Type");
        p.setPrice("Price/Charges");
        p.setBreed1("Small");
        p.setPrice1("₹700");
        p.setBreed2("Medium");
        p.setPrice2("₹700");
        p.setBreed3("Large");
        p.setPrice3("₹700");
        p.setBreed4("Extra Large");
        p.setPrice4("₹700");
        products.add(p);

        p = new Product();
        p.setTitle("BATH");
        p.setImage(R.drawable.dog);
        p.setBreed("Breed Type");
        p.setPrice("Price/Charges");
        p.setBreed1("Small");
        p.setPrice1("₹700");
        p.setBreed2("Medium");
        p.setPrice2("₹700");
        p.setBreed3("Large");
        p.setPrice3("₹700");
        p.setBreed4("Extra Large");
        p.setPrice4("₹700");
        products.add(p);

        p = new Product();
        p.setTitle("Basic Trimming");
        p.setImage(R.drawable.dog);
        p.setBreed("Breed Type");
        p.setPrice("Price/Charges");
        p.setBreed1("Small");
        p.setPrice1("₹700");
        p.setBreed2("Medium");
        p.setPrice2("₹700");
        p.setBreed3("Large");
        p.setPrice3("₹700");
        p.setBreed4("Extra Large");
        p.setPrice4("₹700");
        products.add(p);

        return  products;
    }
}
