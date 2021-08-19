package krg.springframework.krgdi.controller;

import krg.springframework.krgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Qualifier(value = "propertyInjectedGreetingService")
    @Autowired
    GreetingService greetingService;

    public String getGreeting(){
        return greetingService.getGreeting();
    }
}
