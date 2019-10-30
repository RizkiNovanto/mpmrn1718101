package com.example.kuis1keluargaku1718101;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private KeluargaAdapter keluargaAdapter;
    private ArrayList<Keluarga> keluargaArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tambahData();
        recyclerView = findViewById(R.id.recyclerview);
        keluargaAdapter = new KeluargaAdapter(keluargaArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(keluargaAdapter);
    }
    private void tambahData(){
        keluargaArrayList = new ArrayList<>();
        keluargaArrayList.add(new Keluarga("Mujiwiyono", "Ayah",  getDrawable(R.drawable.ayh)));
        keluargaArrayList.add(new Keluarga("Sumiati", "Ibu", getDrawable(R.drawable.ibu)));
        keluargaArrayList.add(new Keluarga("Rizki", "Anak Pertama", getDrawable(R.drawable.rsk)));
        keluargaArrayList.add(new Keluarga("Najwa", "Anak Kedua", getDrawable(R.drawable.adk)));
    }
}

