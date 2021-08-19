package krg.springframework.krgdi.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingService implements GreetingService {
    @Override
    public String getGreeting() {
        return "Hello World from Property Injected Greeting Service ";
    }
}