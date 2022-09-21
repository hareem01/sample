package com.sample_project.sample;
import javax.persistence.*;

@Entity
@Table(name = "person")
public class Person {
    private Integer id;
    private String first_name;
    private String email;

    public Person() {
    }

    public Person(Integer id, String first_name, String email) {
        this.id = id;
        this.first_name = first_name;
        this.email = email;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getEmail() {
        return email;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}