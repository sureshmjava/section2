package com.springsecurity.section2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController {
    @GetMapping("/loan")
    public String getLoanDetails(){
        return "Here it shows all Loan Details";
    }

}
