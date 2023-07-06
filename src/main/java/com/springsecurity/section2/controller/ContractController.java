package com.springsecurity.section2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContractController {

    @GetMapping("/contact")
    public String getContactDetails(){
        return "Here it shows the alll the bank contacts";
    }
}
