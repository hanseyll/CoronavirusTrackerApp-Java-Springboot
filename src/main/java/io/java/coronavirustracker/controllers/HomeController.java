package io.java.coronavirustracker.controllers;

import io.java.coronavirustracker.services.coronavirusDataService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class HomeController {

    coronavirusDataService coronavirusDataService;
    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("locationStats",coronavirusDataService.getAllStats());
        return "home";
    }
}
