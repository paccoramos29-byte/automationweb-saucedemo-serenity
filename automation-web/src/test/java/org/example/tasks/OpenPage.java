package org.example.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class OpenPage implements Task {

    public static OpenPage open(){
        return new OpenPage();
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Open.url("https://www.saucedemo.com/")
        );
    }
}