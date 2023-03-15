package com.ThisisSecondProject.ThisisSecondProject;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestController
public class Second {

    @GetMapping("/ABDULMALIK")
     public String getABDULMALIK(){
        return "ABDUL MALIK";
    }

}
