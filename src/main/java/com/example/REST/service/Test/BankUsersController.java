package com.example.REST.service.Test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")

public class BankUsersController {

    @GetMapping("{id}")
    public BankUsers getBankUsersDetails(@PathVariable String id){
        return new BankUsers("v1", "Gatitu", "50000");
    }
}