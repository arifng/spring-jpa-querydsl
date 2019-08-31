package com.arifng.jpaquerydsl.repository;

import com.arifng.jpaquerydsl.model.Person;
import com.arifng.jpaquerydsl.model.QPerson;
import com.querydsl.jpa.impl.JPAQuery;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class PersonRepositoryImpl extends QuerydslRepositorySupport implements PersonRepositoryCustom {
    public PersonRepositoryImpl() {
        super(Person.class);
    }

    @Override
    public Optional<Person> findByEmail(String email) {
        JPAQuery<Person> query = getQuerydsl()
                .createQuery()
                .from(QPerson.person)
                .where(QPerson.person.email.equalsIgnoreCase(email))
                .select(QPerson.person);
        return query.fetch().stream().findFirst();
    }
}
