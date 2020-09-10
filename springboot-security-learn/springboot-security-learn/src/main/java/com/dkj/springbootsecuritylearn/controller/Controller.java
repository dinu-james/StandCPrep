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
    @GetMapping(path="/home")
    public String home()
    {
        return "Welcome";
    }

    @GetMapping(path="/user")
    public String user()
    {
        return "Hello - User";
    }

    @GetMapping(path="/admin")
    public String admin()
    {
        return "Hello - Admin";
    }
}
