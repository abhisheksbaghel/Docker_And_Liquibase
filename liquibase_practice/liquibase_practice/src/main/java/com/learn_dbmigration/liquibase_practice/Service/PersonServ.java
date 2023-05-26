package com.learn_dbmigration.liquibase_practice.Service;

import com.learn_dbmigration.liquibase_practice.Model.Person;

import java.util.List;

public interface PersonServ {

    public String addPerson(Person person);

    public List<Person> getAll();

    public void deletePerson(int id);

}
