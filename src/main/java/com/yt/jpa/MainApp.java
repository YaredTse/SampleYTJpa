package com.yt.jpa;

import com.yt.jpa.config.AppConfig;
import com.yt.jpa.entity.Person;
import com.yt.jpa.service.PersonService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

public class MainApp {

    public static void main(String[] args) throws SQLException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        PersonService personService = context.getBean(PersonService.class);

        // Add Persons
        personService.add(new Person("Sunil", "Bora", "suni.bora@example.com"));
        personService.add(new Person("David", "Miller", "david.miller@example.com"));
        personService.add(new Person("Sameer", "Singh", "sameer.singh@example.com"));
        personService.add(new Person("Paul", "Smith", "paul.smith@example.com"));
        personService.add(new Person("Paul", "Smith", "paul.smith@example.com"));
        personService.add(new Person("Paul", "Smith", "paul.smith@example.com"));
        personService.add(new Person("Paul", "Smith", "paul.smith@example.com"));
        personService.add(new Person("Paul", "Smith", "paul.smith@example.com"));
        personService.add(new Person("Paul", "Smith", "paul.smith@example.com"));
        personService.add(new Person("Paul", "Smith", "paul.smith@example.com"));
        personService.add(new Person("Paul", "Smith", "paul.smith@example.com"));
        personService.add(new Person("Paul", "Smith", "paul.smith@example.com"));
        personService.add(new Person("Paul", "Smith", "paul.smith@example.com"));

        // Get Persons
        List<Person> persons = personService.listPersons();
        for (Person person : persons) {
            System.out.println("Id = "+person.getId());
            System.out.println("First Name = "+person.getFirstName());
            System.out.println("Last Name = "+person.getLastName());
            System.out.println("Email = "+person.getEmail());
            System.out.println();
        }

        System.out.println(Arrays.asList(context.getBeanDefinitionNames()));

        context.close();
    }

}
