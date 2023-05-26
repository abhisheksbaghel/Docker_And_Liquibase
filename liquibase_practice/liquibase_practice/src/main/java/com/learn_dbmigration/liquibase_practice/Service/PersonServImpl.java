package com.learn_dbmigration.liquibase_practice.Service;

import com.learn_dbmigration.liquibase_practice.Model.Person;
import com.learn_dbmigration.liquibase_practice.Repository.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServImpl implements PersonServ{


    @Autowired
    private PersonRepo personRepo;

    @Override
    public String addPerson(Person person) {
        personRepo.save(person);
        return "Saved";
    }

    @Override
    public List<Person> getAll() {
        return personRepo.findAll();
    }

    @Override
    public void deletePerson(int id) {
        personRepo.deleteById(id);
    }
}
