package com.arifng.jpaquerydsl.repository;

import com.arifng.jpaquerydsl.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>,
        QuerydslPredicateExecutor<Person>, PersonRepositoryCustom {
}
