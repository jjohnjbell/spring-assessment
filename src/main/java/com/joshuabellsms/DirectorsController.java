package com.joshuabellsms;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Controller
@RequestMapping("/directors")
public class DirectorsController {
    private final DirectorsRepository directorsRepository;

    public DirectorsController(DirectorsRepository directorsRepository) {
        this.directorsRepository = directorsRepository;
    }

    @GetMapping
    public List<Directors> getDirectors(){
        return directorsRepository.findAll();
    }

    static record AddDirectorRequest (Integer movie_id,Integer persons_id){ }
    @PostMapping
    public void addDirectors(@RequestBody AddDirectorRequest request){
        Directors director = new Directors();
        director.setMovieId(request.movie_id());
        director.setPersons_id(request.persons_id);
        directorsRepository.save(director);
    }

    @DeleteMapping("{directorId}")
    public void deleteDirector(@PathVariable("directorId") Integer id){
        directorsRepository.deleteById(id);
    }

}

