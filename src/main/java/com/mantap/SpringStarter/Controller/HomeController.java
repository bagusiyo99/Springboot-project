package com.mantap.SpringStarter.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {
//route home
    @GetMapping("/")
    public String home (Model model){
        return "home";
    }

  

}