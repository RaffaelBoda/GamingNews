package com.codecool.gamingnews.endpoints;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomepageController {

    @GetMapping
    public String getHome(){
        return "nein";
    }

    @GetMapping("/user")
    public String getUser(){
        return "nice";
    }
}
