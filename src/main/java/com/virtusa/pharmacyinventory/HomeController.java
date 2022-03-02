package com.virtusa.pharmacyinventory;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// @CrossOrigin
public class HomeController {
    @GetMapping("/a")
    public String home() {
        return "Hello Welcome to Pharmacy Inventory System";
    }

    @GetMapping("/login")
    public String getTablets() {
        
        return "Login Success";
    }

    @GetMapping("/abc")
    public String getTablets2() {
        return "We need Crocin for 2000 Patients";
    }


}
