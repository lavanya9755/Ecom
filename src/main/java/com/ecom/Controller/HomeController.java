package com.ecom.Controller;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ecom.response.ApiResposne;
@RestController
public class HomeController {

    @GetMapping("/home")
    public ApiResposne HomeControllerHandler(){
        ApiResposne response = new ApiResposne();
        response.setMessage("Welcome to major project"); //first api ready 
        return response;
    }
}
