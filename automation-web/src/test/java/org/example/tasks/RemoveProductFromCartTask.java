package org.example.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import org.example.ui.CartScreen;

public class RemoveProductFromCartTask implements Task {

    public static RemoveProductFromCartTask remove(){
        return new RemoveProductFromCartTask();
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Click.on(CartScreen.REMOVE_BUTTON)
        );
    }
}
