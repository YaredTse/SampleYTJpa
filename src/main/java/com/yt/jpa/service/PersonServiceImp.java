package com.yt.jpa.service;

import com.yt.jpa.dao.Dao;
import com.yt.jpa.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author imssbora
 *
 */
@Service
public class PersonServiceImp implements PersonService {

   @Autowired
   private Dao<Person> userDao;

   @Transactional
   @Override
   public void add(Person person) {
      userDao.add(person);
   }

   @Transactional(readOnly = true)
   @Override
   public List<Person> listPersons() {
      return userDao.listT();
   }

}
