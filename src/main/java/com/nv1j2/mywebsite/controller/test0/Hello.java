package com.nv1j2.mywebsite.controller.test0;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hello")
@RestController
public class Hello {

    @RequestMapping("hi")
    public String home(String args){
        String aaa = "asdasd";
        String aaa1 = "asdasd";
        String aaa2 = "asdasd";
        String aaa3 = "asdasd";
        return "hello world1" ;
    }
}
