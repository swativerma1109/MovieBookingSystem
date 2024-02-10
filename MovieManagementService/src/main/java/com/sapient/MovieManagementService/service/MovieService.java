package com.sapient.MovieManagementService.service;

import com.sapient.MovieManagementService.model.Movie;
import com.sapient.MovieManagementService.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {
//    @Autowired
//    private MovieRepository movieRepository;
    static List<Movie> movieList = new ArrayList<>();
    static{
        movieList.add(new Movie(1L,"Movie1","language1","genre1"));
        movieList.add(new Movie(2L,"Movie2","language2","genre2"));
        movieList.add(new Movie(3L,"Movie3","language3","genre3"));
        movieList.add(new Movie(4L,"Movie4","language4","genre4"));
        movieList.add(new Movie(5L,"Movie5","language5","genre5"));
    }

    public List<Movie> getAllMovies() {
        //return movieRepository.findAll();
        return movieList;
    }

    public Movie addMovie(Movie movie) {
       // return movieRepository.save(movie);
        movieList.add(movie);
        return movie;
    }

    // Other CRUD operations
}
