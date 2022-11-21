package com.niit.MovieServices.services;

import com.niit.MovieServices.domain.Movie;
import com.niit.MovieServices.domain.User;
import com.niit.MovieServices.exceptions.UserAlreadyExcistException;
import com.niit.MovieServices.exceptions.UserNotFoundException;
import com.niit.MovieServices.repository.UserMovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserMovieServiceImpl implements UserMovieServices{

    @Autowired
    private UserMovieRepository userMovieRepository;

    @Override
    public User addUser(User user) throws UserAlreadyExcistException {
        if(userMovieRepository.findById(user.getEmail()).isPresent()){
            throw  new UserAlreadyExcistException();
        }
        return userMovieRepository.insert(user);
    }

    @Override
    public User addMovieForUser(String email, Movie movie) throws UserNotFoundException {
        if (userMovieRepository.findById(email).isEmpty()){
            throw  new UserNotFoundException();
        }
        User user = userMovieRepository.findById(email).get();
        if (user.getMovieList() == null){
            user.setMovieList(Arrays.asList(movie));
        }else {
            List<Movie> movies = user.getMovieList();
            movies.add(movie);
            user.setMovieList(movies);
        }
        return userMovieRepository.save(user);
    }
}
