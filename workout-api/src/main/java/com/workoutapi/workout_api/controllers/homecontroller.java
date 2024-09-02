package com.workoutapi.workout_api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * homecontroller
 */
@RestController
public class homecontroller {

    @GetMapping(value="/Home")
    public String getMethodName() {
        return "Bem Vindo ao portal regulatório XD";
    }
    
}