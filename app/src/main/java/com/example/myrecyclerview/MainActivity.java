package com.example.myrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.myrecyclerview.adapter.mycustomadapter;
import com.example.myrecyclerview.model.moviemodel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    mycustomadapter mycustomadapter;
    List<moviemodel> moviemodelList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerview);
        moviemodelList=new ArrayList<>();
        moviemodel m1=new moviemodel("AA",1, R.drawable.movie1);
        moviemodel m2=new moviemodel("AA",2, R.drawable.movie4);
        moviemodel m3=new moviemodel("AA",3, R.drawable.movie3);
        moviemodel m4=new moviemodel("AA",4, R.drawable.movie2);
        moviemodelList.add(m1);
        moviemodelList.add(m2);
        moviemodelList.add(m3);
        moviemodelList.add(m4);
        mycustomadapter mycustomadapter = new mycustomadapter(this,moviemodelList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(mycustomadapter);

    }
}