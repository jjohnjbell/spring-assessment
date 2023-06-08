package com.joshuabellsms;


import org.apache.catalina.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@SpringBootApplication
//@RestController
//@Controller
//@RequestMapping("/sms/next")
public class Main{
    public Main(){}

    public static void main(String[] args) {

        SpringApplication.run(Main.class, args);
    }

}

