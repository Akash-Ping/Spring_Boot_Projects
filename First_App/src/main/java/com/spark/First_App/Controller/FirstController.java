package com.spark.First_App.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/genie")
public class FirstController {

        @GetMapping("/test")
        public String kaiseho(){
            return "Kaise ho bhaiya";
        }
}
