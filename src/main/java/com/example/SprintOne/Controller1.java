package com.example.SprintOne;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controller1 {
    @GetMapping ("/str1")
        public String str1(){
        System.out.println("запрос к template1");
        return "template1";
        }

}
