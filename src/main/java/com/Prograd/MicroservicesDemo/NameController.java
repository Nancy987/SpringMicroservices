package com.Prograd.MicroservicesDemo;

import com.Prograd.MicroservicesDemo.Bean.NameSender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {
    @GetMapping("/name")
    public NameSender displayName(){

        return new NameSender("Nancy","Mangla");

    }
}

