package com.example.rahulyiet.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Movie> movieList = new ArrayList<>();
    private RecyclerView recyclerView;
    private MovieAdapter movieAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);

        movieAdapter = new MovieAdapter(movieList);
        RecyclerView.LayoutManager movieLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(movieLayoutManager);

        recyclerView.setAdapter(movieAdapter);

        prepareMovieData();
    }

    private void prepareMovieData() {
        Movie movie = new Movie("Race3", "Action ", "2018");

        movieList.add(movie);
        movie.setImageView(R.drawable.race);


        movie = new Movie("Tiger Zinda Hai", "Action", "2018");

        movieList.add(movie);
        movie.setImageView(R.drawable.tiger);


        movie = new Movie("Star Wars: Episode VII - The Force Awakens", "Action", "2015");

        movieList.add(movie);
        movie.setImageView(R.drawable.starwar);


        movie = new Movie("Avengers = Infinity war", "Action", "2018");

        movieList.add(movie);
        movie.setImageView(R.drawable.avengers);


        movie = new Movie("Dhadkan", "Love story", "2002");

        movieList.add(movie);
        movie.setImageView(R.drawable.starwar);





        movieAdapter.notifyDataSetChanged();

    }


}
