package com.joshuabellsms;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Controller
@RequestMapping("/people")
public class PeopleController {
    private final PeopleRepository peopleRepository;

    public PeopleController(PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository;
    }

    @GetMapping
    public List<People> getPeople(){
        return peopleRepository.findAll();
    }

    static record AddPeopleRequest (Integer id, String name, Integer birth){ }
    @PostMapping
    public void addPeople(@RequestBody AddPeopleRequest request){
        People people = new People();
        people.setId(request.id());
        people.setName(request.name());
        people.setBirth(request.birth());
        peopleRepository.save(people);
    }
    @DeleteMapping("{peopleId}")
    public void deletePeople(@PathVariable("peopleId") Integer id){
        peopleRepository.deleteById(id);
    }

}

