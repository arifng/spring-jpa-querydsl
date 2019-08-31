package com.arifng.jpaquerydsl.service;

import com.arifng.jpaquerydsl.model.Person;
import com.arifng.jpaquerydsl.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonRepository personRepository;

    @Override
    public Optional<Person> findById(Long id) {
        return personRepository.findById(id);
    }

    @Override
    public Optional<Person> findByEmail(String email) {
        return personRepository.findByEmail(email);
    }
}
