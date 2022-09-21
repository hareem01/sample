package com.sample_project.sample;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PersonService {
    @Autowired
    private PersonRepository personRepository;
    public List<Person> listAll() {
        return personRepository.findAll();
    }

    public void savePerson(Person person) {
        personRepository.save(person);
    }

    public Person getPerson(Integer id) {
        return personRepository.findById(id).get();
    }

    public void deletePerson(Integer id) {
        personRepository.deleteById(id);
    }

    public <T extends JpaRepository> Person find(Person email, Pageable pageable) {
        return email;
    }

}
