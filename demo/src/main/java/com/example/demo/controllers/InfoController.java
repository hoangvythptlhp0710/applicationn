package com.example.demo.controllers;

import com.example.demo.models.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(path = "/info/v1/Information")
public class InfoController {

    @GetMapping("")
    List<Person> returnInformation(){
        Person p1 = new Person("Jane", new Date(29), "hvtb@gmail.com", "07123840123", "");
        Person p2 = new Person("John", new Date(28), "jasdf@gmail.com", "07954131563", "");
        return List.of(p1, p2);
    }

}
