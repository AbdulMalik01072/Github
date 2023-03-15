package com.Abdul.helloproject.Myfirsthelloworldproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Helloworldcontroller {

    @GetMapping("/hello")
    public String gethello(){
        return "helloworld";
    }


}
