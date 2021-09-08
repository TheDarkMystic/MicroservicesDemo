package com.jaykadam.microservices.limitsservice.controller;

import com.jaykadam.microservices.limitsservice.entity.Limits;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {
    @GetMapping("/limits")
    public Limits retriveLimits(){
        return new Limits(1,100);
    }

}
