package krg.springframework.krgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"EN", "default"})
@Service("i18Service")
public class I18nEnglishGreetingService implements  GreetingService{
    @Override
    public String getGreeting() {
        return "Hello World - EN";
    }
}
