package com.yt.jpa.service;

import com.yt.jpa.entity.Person;

import java.util.List;

public interface PersonService {
    void add(Person person);
    List<Person> listPersons();
}
