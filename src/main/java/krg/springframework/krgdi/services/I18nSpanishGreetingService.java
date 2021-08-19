package krg.springframework.krgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18Service")
public class I18nSpanishGreetingService implements GreetingService {
    @Override
    public String getGreeting() {
        return "Hola Mundo - ES";
    }
}
