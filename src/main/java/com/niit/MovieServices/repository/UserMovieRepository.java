package com.niit.MovieServices.repository;

import com.niit.MovieServices.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMovieRepository extends MongoRepository<User,String> {
}
