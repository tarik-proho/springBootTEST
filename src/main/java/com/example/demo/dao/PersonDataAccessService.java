package com.example.demo.dao;

import com.example.demo.model.Person;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("postgres") //Grab this if you need other database
public class PersonDataAccessService implements PersonDAO {
    @Override
    public int insertPerson(UUID id, Person person) {
        return 0;
    }

    @Override
    public List<Person> selectAllPeople() {
        return List.of(new Person(UUID.randomUUID(), "FROM POSTGRES DB"));
    }

    @Override
    public Optional<Person> selectPersonByID(UUID id) {
        return Optional.empty();
    }

    @Override
    public int deletePersonByID(UUID id) {
        return 0;
    }

    @Override
    public int updatePersonByID(UUID id, Person person) {
        return 0;
    }
}
