package com.niit.MovieServices.controller;

import com.niit.MovieServices.domain.Movie;
import com.niit.MovieServices.domain.User;
import com.niit.MovieServices.exceptions.UserAlreadyExcistException;
import com.niit.MovieServices.exceptions.UserNotFoundException;
import com.niit.MovieServices.services.UserMovieServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/usermovieapp/user")
public class UserMovieController {

    @Autowired
    private UserMovieServices userMovieServices;

    private UserMovieController userMovieController;


    public UserMovieController(UserMovieServices userMovieServices) {
        this.userMovieServices = userMovieServices;
    }

    @PostMapping("/register")
    public ResponseEntity<?> addUser(@RequestBody User user) throws UserAlreadyExcistException {
       try{
           user.setMovieList(new ArrayList<>());
           return new ResponseEntity<>(userMovieServices.addUser(user), HttpStatus.OK);
       } catch (UserAlreadyExcistException e) {
           throw new UserAlreadyExcistException();
       }
    }

    @PutMapping("addmovie/{email}")
    public ResponseEntity<?> addMovieForUser(@PathVariable String email, @RequestBody Movie movie) throws UserNotFoundException {
        try {

            return new ResponseEntity<>(userMovieServices.addMovieForUser(email, movie),HttpStatus.OK);
        } catch (UserNotFoundException e) {
            throw new UserNotFoundException();
        }
    }
}
