package com.example.recyclerview_using_java;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Adapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView abcd_recycler;
    List<String> abcd;
    List<Integer> abcdImage;
    RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        abcd_recycler = findViewById(R.id.abcd_recycler);

        abcd = new ArrayList<>();
        abcdImage = new ArrayList<>();

        abcd.add("Apple");
        abcd.add("Ball");
        abcd.add("Cat");
        abcd.add("Dog");
        abcd.add("Elephant");
        abcd.add("Fish");
        abcd.add("Apple");
        abcd.add("Ball");
        abcd.add("Cat");
        abcd.add("Dog");
        abcd.add("Elephant");
        abcd.add("Fish");

        abcdImage.add(R.drawable.apple);
        abcdImage.add(R.drawable.ball);
        abcdImage.add(R.drawable.cat);
        abcdImage.add(R.drawable.dog);
        abcdImage.add(R.drawable.elephant);
        abcdImage.add(R.drawable.fish);
        abcdImage.add(R.drawable.apple);
        abcdImage.add(R.drawable.ball);
        abcdImage.add(R.drawable.cat);
        abcdImage.add(R.drawable.dog);
        abcdImage.add(R.drawable.elephant);
        abcdImage.add(R.drawable.fish);

        adapter = new RecyclerAdapter(this,abcd,abcdImage);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2,GridLayoutManager.VERTICAL,false);

        abcd_recycler.setLayoutManager(gridLayoutManager);
        abcd_recycler.setAdapter(adapter);


    }
}