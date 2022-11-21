package com.niit.MovieServices.services;

import com.niit.MovieServices.domain.Movie;
import com.niit.MovieServices.domain.User;
import com.niit.MovieServices.exceptions.UserAlreadyExcistException;
import com.niit.MovieServices.exceptions.UserNotFoundException;

public interface UserMovieServices {

    User addUser(User user) throws UserAlreadyExcistException;
    User addMovieForUser(String email, Movie movie) throws UserNotFoundException;
}
