package org.testautomation.danish;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloApi {


   @RequestMapping("/hello")
    public String hello(){

        return "hi";

    }
        }
