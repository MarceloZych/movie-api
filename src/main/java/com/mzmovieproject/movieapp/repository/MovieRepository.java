package com.mzmovieproject.movieapp.repository;

import com.mzmovieproject.movieapp.entity.Movie;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
    Optional<Movie> findMovieById(String id);
}
