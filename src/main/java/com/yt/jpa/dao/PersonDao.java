package com.yt.jpa.dao;

import com.yt.jpa.entity.Person;

import java.util.List;

public interface PersonDao {
   void add(Person person);
   List<Person> listPersons();
}
