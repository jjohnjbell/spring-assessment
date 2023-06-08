package com.joshuabellsms;

import jakarta.transaction.Transactional;
import jakarta.websocket.server.PathParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@Controller
@RequestMapping("/movies")
public class MoviesController {
    private final MoviesRepository moviesRepository;

    public MoviesController(MoviesRepository moviesRepository) {
        this.moviesRepository = moviesRepository;
    }



    @GetMapping
    public List<Movies> getMovies(){
        return moviesRepository.findAll();
    }

    record AddMovieRequest (Integer id, String title,  Integer year ){ }
    @PostMapping
    public void addMovies(@RequestBody AddMovieRequest request){
        Movies movies = new Movies();
        movies.setId(request.id);
        movies.setYear(request.year);
        movies.setTitle(request.title);
        moviesRepository.save(movies);
    }

    @DeleteMapping("{movieId}")
    public void deleteCustomer(@PathVariable("movieId") Integer id) {
        moviesRepository.deleteById(id);
    }

    @Transactional
    @PutMapping("{movieId}")
    public void updateMovie(@PathVariable("movieId") Integer id, @RequestBody AddMovieRequest request){
        Movies movie = new Movies();
        movie.setId(id);
        movie.setTitle(request.title);
        moviesRepository.save(movie);
         }

}
