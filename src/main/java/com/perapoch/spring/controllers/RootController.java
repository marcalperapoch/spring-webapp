package com.perapoch.spring.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by marcal.perapoch on 16/02/17.
 */
@RestController
public class RootController {

    @RequestMapping("/")
    public String index() {
        return "Greeting from SpringBoot!";
    }
}
