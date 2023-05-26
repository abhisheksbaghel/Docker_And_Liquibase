package com.SMD.SpringSqlWithDocker.Service;

import com.SMD.SpringSqlWithDocker.Dao.CustDao;
import com.SMD.SpringSqlWithDocker.Model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustServiceImpl implements CustService{

    @Autowired
    private CustDao custDao;
    @Override
    public List<Customer> getAll() {
        return custDao.findAll();
    }

    @Override
    public String addCustomer(Customer customer) {
        String str="Customer "+customer.getName()+" added successfully!!";
        return str;
    }
}
