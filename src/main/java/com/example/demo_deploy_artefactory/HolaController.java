package com.example.demo_deploy_artefactory;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaController {

    @Value("${app.message}")
    String message;

    @GetMapping("/hola")
    public String Holamundo(){

        System.out.println(message);
        return "hola mundo";
    }
}
