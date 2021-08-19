package krg.springframework.krgdi.controller;

import krg.springframework.krgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18nGreetingController {
    GreetingService greetingService;

    public I18nGreetingController(@Qualifier("i18Service") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.getGreeting();
    }
}
