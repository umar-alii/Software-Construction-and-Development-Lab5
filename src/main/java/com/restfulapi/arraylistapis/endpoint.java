package com.restfulapi.arraylistapis;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class endpoint {

    @GetMapping(value="/greet")
    public String hello(){
        return "Hey, Umar Ali here";
    }
}
