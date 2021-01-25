package com.accolite.hibernateau.repository;

import com.accolite.hibernateau.entity.Movie;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MovieJPARepository extends CrudRepository<Movie, Integer> 
{
    public List<Movie> findMovieByName(String name);

    public Movie findMovieByReleaseYear(int year);

    public List<Movie> findMoviesByDirectorNameOrderByName(String name);
}
