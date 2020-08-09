package com.covid19.backendcovid19.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Covid19Controller {


    @GetMapping(value="/test")

    public String testController() {

        return "Hello World";

    }


}
