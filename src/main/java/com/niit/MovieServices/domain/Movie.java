package com.niit.MovieServices.domain;

import org.springframework.data.annotation.Id;

public class Movie {

    @Id
    private int movieId;
    private String movieName;
    private String actorName;
    private float ratings;

    public Movie() {
    }

    public Movie(int movieId, String movieName, String actorName, float ratings) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.actorName = actorName;
        this.ratings = ratings;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getActorName() {
        return actorName;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
    }

    public float getRatings() {
        return ratings;
    }

    public void setRatings(float ratings) {
        this.ratings = ratings;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieId=" + movieId +
                ", movieName='" + movieName + '\'' +
                ", actorName='" + actorName + '\'' +
                ", ratings=" + ratings +
                '}';
    }
}
