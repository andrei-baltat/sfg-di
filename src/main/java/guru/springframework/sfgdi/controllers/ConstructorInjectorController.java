package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectorController {
    private final GreetingService greetingService;

    // daca nu gaseste constructorInjectedGreetingService pune bean=ul primar
    public ConstructorInjectorController(@Qualifier("constructorInjectedGreetingService") final GreetingService greetingService) {
//    public ConstructorInjectorController(final GreetingService greetingService) {

        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
