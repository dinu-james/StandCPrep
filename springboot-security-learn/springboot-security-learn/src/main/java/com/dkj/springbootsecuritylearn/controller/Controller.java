package com.dkj.springbootsecuritylearn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/")
public class Controller {

    @GetMapping(path="/test")
    public String test()
    {
        return "Hello - Testing ! DKJ";
    }
}
