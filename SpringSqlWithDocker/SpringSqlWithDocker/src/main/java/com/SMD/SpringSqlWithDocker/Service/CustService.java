package com.SMD.SpringSqlWithDocker.Service;

import com.SMD.SpringSqlWithDocker.Model.Customer;

import java.util.List;

public interface CustService {
    public List<Customer> getAll();
    public String addCustomer(Customer customer);
}
