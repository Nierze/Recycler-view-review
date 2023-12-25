package com.example.recyclerviewreview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<ModelShit> arr = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RecyclerView recyclerView = findViewById(R.id.rv);

        ModelShit shit1 = new ModelShit("Ren", "69");
        ModelShit shit2 = new ModelShit("Hiro", "96");
        ModelShit shit3 = new ModelShit("Nir", "690000");
        ModelShit shit4 = new ModelShit("Nirze", "????");

        arr.add(shit1);
        arr.add(shit2);
        arr.add(shit3);
        arr.add(shit4);


        RVadapter rVadapter = new RVadapter(this, arr);
        recyclerView.setAdapter(rVadapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));




    }
}