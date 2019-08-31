package com.arifng.jpaquerydsl.repository;

import com.arifng.jpaquerydsl.model.Person;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.Optional;

@NoRepositoryBean
public interface PersonRepositoryCustom {
    Optional<Person> findByEmail(String email);
}
