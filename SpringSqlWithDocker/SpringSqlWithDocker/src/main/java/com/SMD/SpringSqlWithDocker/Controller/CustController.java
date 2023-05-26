package com.SMD.SpringSqlWithDocker.Controller;

import com.SMD.SpringSqlWithDocker.Model.Customer;
import com.SMD.SpringSqlWithDocker.Service.CustService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cust")
public class CustController {
    @Autowired
    private CustService custService;

    @GetMapping("/getall")
    public List<Customer> fetchAll(){
        return custService.getAll();
    }

    @PostMapping("/add")
    public String addCustomer(@RequestBody Customer customer)
    {
        return custService.addCustomer(customer);
    }
}
