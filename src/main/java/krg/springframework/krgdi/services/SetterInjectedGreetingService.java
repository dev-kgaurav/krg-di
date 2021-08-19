package krg.springframework.krgdi.services;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectedGreetingService implements GreetingService {
    @Override
    public String getGreeting() {
        return "Hello World from Setter Injected Greeting Service ";
    }
}
