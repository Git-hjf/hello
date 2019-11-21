package spring.boot.test.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index")
public class HelloWorldController {

    @Value("${my.name}")
    private String name;

    @RequestMapping("/hello")
    public String index(){
        System.out.println("欢迎加入spring boot!");
        return "Hello World!"+name;
    }

}
