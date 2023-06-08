package com.joshuabellsms;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Controller
@RequestMapping("/stars")
public class StarsController {
    private final StarsRepository starsRepository;

    public StarsController(StarsRepository starsRepository) {
        this.starsRepository = starsRepository;
    }

    @GetMapping
    public List<Stars> getStars(){
        return starsRepository.findAll();
    }

    static record AddStarsRequest (Integer movie_id, Integer person_id){ }
    @PostMapping
    public void addStars(@RequestBody AddStarsRequest request){
        Stars stars = new Stars();
        stars.setMovie_id(request.movie_id());
        stars.setPerson_id(request.person_id());
        starsRepository.save(stars);
    }

}

