package com.learn_dbmigration.liquibase_practice.Controller;

import com.learn_dbmigration.liquibase_practice.Model.Person;
import com.learn_dbmigration.liquibase_practice.Service.PersonServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonCntr {

    @Autowired
    private PersonServ personServ;

    @GetMapping("/getAll")
    public List<Person> getAll()
    {
        return personServ.getAll();
    }

    @PostMapping("/addPerson")
    public String addIndividual(@RequestBody Person person)
    {
        personServ.addPerson(person);
        return "Added "+person.getName()+" in records";
    }

    @DeleteMapping("delete/{id}")
    public String deleteIndividual(@PathVariable int id)
    {
        personServ.deletePerson(id);
        return "Deleted person with Id '"+id+"' from the records";
    }


}
