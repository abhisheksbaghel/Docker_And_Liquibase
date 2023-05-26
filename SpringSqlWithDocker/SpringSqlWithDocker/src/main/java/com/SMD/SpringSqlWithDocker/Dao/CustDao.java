package com.SMD.SpringSqlWithDocker.Dao;

import com.SMD.SpringSqlWithDocker.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustDao extends JpaRepository<Customer,Integer> {

}
