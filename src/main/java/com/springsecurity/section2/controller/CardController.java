package com.springsecurity.section2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardController {

    @GetMapping("/card")
    public String getCardDetails(){
        return "all my card details";
    }
}
