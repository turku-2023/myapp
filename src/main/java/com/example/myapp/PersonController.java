package com.example.myapp;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;

@RestController
@RequestMapping()

public class PersonController {

    static ArrayList persons;

    public PersonController() {
        persons = new ArrayList<>();
        persons.add(new Person("Matti", "Virta"));
        persons.add(new Person("Mauno", "Joki"));
        persons.add(new Person("Liisa", "Virta"));
    }

    @GetMapping("/person")
    public ArrayList findAll() {
        System.out.println("/person endpoint");
        return persons;
    }

    @GetMapping("/person/{id}")
    public Person findOne(@PathVariable(value = "id") int id) {
        System.out.println("Annettu arvo=" + id);
        Person pe = (Person) persons.get(id);
        return pe;
    }

    @PostMapping("/person")
    public String addPerson() {
        return "Lisään uuden henkilön";
    }

    @PutMapping("/person/{id}")
    public String updatePerson(@PathVariable(value = "id") int id) {
        return "Päivitän henkilö, jonka id=" + id;
    }
    @DeleteMapping("/person/{id}")
    public String deletePerson(@PathVariable(value = "id") int id) {
        return "Poistan henkilö, jonka id=" + id;
    }
}
