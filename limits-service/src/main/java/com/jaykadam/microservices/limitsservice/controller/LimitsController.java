package com.jaykadam.microservices.limitsservice.controller;

import com.jaykadam.microservices.limitsservice.configuration.Configuration;
import com.jaykadam.microservices.limitsservice.entity.Limits;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {
    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public Limits retriveLimits() {
        return new Limits(configuration.getMinimum(), configuration.getMaximum());
        //return new Limits(1, 100);
    }

}
