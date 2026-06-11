package com.oad.cicdsetuppipelines;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {


    @GetMapping("/")
    public  String hello(){
        return "Hello from CI_CD setup for springboot app";
    }

}
