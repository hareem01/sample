package com.sample_project.sample;

import org.springframework.beans.factory.annotation.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("")
    public List<Person> list() {
        return personService.listAll();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Person> get(@PathVariable Integer id) {
        try {
            Person person = personService.getPerson(id);
            return new ResponseEntity<Person>(person, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Person>(HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping("/")
    public void add(@RequestBody Person person) {
        personService.savePerson(person);
    }




}
