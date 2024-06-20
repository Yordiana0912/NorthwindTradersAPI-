package com.pluralsight.NorthwindTradersAPI.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {


    @Autowired
    public HomeController() {

    }


    @RequestMapping(path="/", method= RequestMethod.GET)
    public String index(@RequestParam(defaultValue = "World") String name) {
        return "Hello " + name;
    }

    @RequestMapping(path="/home", method=RequestMethod.GET)
    public String home() {
        return "home";
    }
}
