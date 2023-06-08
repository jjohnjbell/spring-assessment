package com.joshuabellsms;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Controller
@RequestMapping("/ratings")
public class RatingsController {
    private final RatingsRepository ratingsRepository;

    public RatingsController(RatingsRepository ratingsRepository) {
        this.ratingsRepository = ratingsRepository;
    }

    @GetMapping
    public List<Ratings> getRatings(){
        return ratingsRepository.findAll();
    }

    static record AddRatingsRequest (Integer movieid,Double rating, Integer votes){ }
    @PostMapping
    public void addRatings(@RequestBody AddRatingsRequest request){
        Ratings ratings = new Ratings();
        ratings.setMovieId(request.movieid());
        ratings.setRating(request.rating());
        ratings.setVotes(request.votes());
        ratingsRepository.save(ratings);
    }

}

