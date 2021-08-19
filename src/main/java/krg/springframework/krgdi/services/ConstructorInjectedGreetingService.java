package krg.springframework.krgdi.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorInjectedGreetingService implements GreetingService {
    @Override
    public String getGreeting() {
        return "Hello World from Constructor Injected Greeting Service ";
    }
}
