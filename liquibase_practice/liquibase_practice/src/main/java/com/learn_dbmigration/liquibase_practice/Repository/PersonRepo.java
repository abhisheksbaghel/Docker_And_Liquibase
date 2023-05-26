package com.learn_dbmigration.liquibase_practice.Repository;

import com.learn_dbmigration.liquibase_practice.Model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepo extends JpaRepository<Person,Integer> {
}
