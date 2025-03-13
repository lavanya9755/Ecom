package com.ecom.Controller;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
public class HomeController {

    @GetMapping("/home")
    public String HomeControllerHandler(){
        return "Welcome to ecom major project";
    }
}
