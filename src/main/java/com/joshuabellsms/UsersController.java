package com.joshuabellsms;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Controller
@RequestMapping("/users")
public class UsersController {
    private final UsersRepository usersRepository;
    public UsersController(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @GetMapping
    public List<Users> getUsers(){
        return usersRepository.findAll();
    }

    static record AddUserRequest (Integer id, String name, Integer birth){ }
    @PostMapping
    public void addUsers(@RequestBody AddUserRequest request){
        Users users = new Users();
        users.setId(request.id());
        users.setName(request.name());
        users.setBirth(request.birth());
        usersRepository.save(users);
    }

    @DeleteMapping("{userId}")
    public void deleteUser(@PathVariable("userId") Integer id){
        usersRepository.deleteById(id);
    }

}

