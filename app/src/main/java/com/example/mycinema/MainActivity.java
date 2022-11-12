package com.example.mycinema;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<MovieModel> movieModels = new ArrayList<>();
    int[] movieImg = {R.drawable.avengers, R.drawable.travelers, R.drawable.brooklyn,
            R.drawable.black_panther, R.drawable.ted2, R.drawable.shaft,
            R.drawable.wrong_missy, R.drawable.mud_myst};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.rcv);

        setupMovieList();

        MovieRecyclerViewAdapter adapter = new MovieRecyclerViewAdapter(this, movieModels);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    private void setupMovieList() {
        String[] movieName = getResources().getStringArray(R.array.list);

        for (int i = 0; i < movieName.length; i++) {
            movieModels.add(new MovieModel(movieImg[i], movieName[i]));
        }
    }

    private class MovieList {
    }
}