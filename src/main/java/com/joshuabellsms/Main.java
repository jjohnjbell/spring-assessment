package com.joshuabellsms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RequestMapping
@SpringBootApplication
@RestController
//@RequestMapping("moviedb/jb/")
public class Main{
    private final PersonsRepository personsRepository;
    private final DirectorsRepository directorsRepository;
    private final MoviesRepository moviesRepository;
    private final RatingsRepository ratingsRepository;
    private final StarsRepository starsRepository;
    private final UsersRepository usersRepository;

    public Main(PersonsRepository personsRepository,DirectorsRepository directorsRepository,MoviesRepository moviesRepository,
                RatingsRepository ratingsRepository,StarsRepository starsRepository,
                UsersRepository usersRepository){
                this.personsRepository = personsRepository;
                this.directorsRepository = directorsRepository;
                this.moviesRepository = moviesRepository;
                this.ratingsRepository = ratingsRepository;
                this.starsRepository = starsRepository;
                this.usersRepository = usersRepository;
    }


    public static void main(String[] args) {

        SpringApplication.run(Main.class, args);
    }

//    @GetMapping("/")
    public String welcome(){
        return "welcome!";
    }
}