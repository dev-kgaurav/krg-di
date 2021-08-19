package krg.springframework.krgdi;

import krg.springframework.krgdi.controller.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class KrgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(KrgDiApplication.class, args);

		System.out.println("----------------- I18nGreetingController");
		I18nGreetingController i18nGreetingController = (I18nGreetingController) ctx.getBean("i18nGreetingController");
		System.out.println(i18nGreetingController.sayHello());

		System.out.println("----------------- MyController");
		MyController myController = (MyController) ctx.getBean("myController");
		System.out.println(myController.getGreeting());

		System.out.println("----------------- PropertyInjectedController");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("----------------- GetterInjectedController");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("----------------- ConstructorInjectedController");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
	}

}
