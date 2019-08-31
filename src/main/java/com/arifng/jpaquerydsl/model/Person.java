package com.arifng.jpaquerydsl.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "persons")
@EqualsAndHashCode
public class Person {
    private static final long serialVersionUID = -4277100454311602070L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;

    @Version
    @Column(name = "version")
    private Long version = 0L;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "social_security_number")
    private String socialSecurityNumber;

    @Column(name = "home_phone")
    private String homePhone;

    @Column(name = "mobile")
    private String mobile;

    @Column(name = "birth_date")
    @Temporal(TemporalType.DATE)
    private Date birthDate;

    @Column(name = "email")
    private String email;
}
