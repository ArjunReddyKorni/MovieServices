package com.niit.MovieServices.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class User {

    private int userId;
    private String userName;
    @Id
    private String email;
    private List<Movie> movieList;

    public User() {
    }

    public User(int userId, String userName, String email, List<Movie> movieList) {
        this.userId = userId;
        this.userName = userName;
        this.email = email;
        this.movieList = movieList;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Movie> getMovieList() {
        return movieList;
    }

    public void setMovieList(List<Movie> movieList) {
        this.movieList = movieList;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", movieList=" + movieList +
                '}';
    }
}
