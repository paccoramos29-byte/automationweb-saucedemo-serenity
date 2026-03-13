package org.example.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.example.ui.InventoryScreen;

public class OpenShoppingCartTask implements Task {

    public static OpenShoppingCartTask open(){
        return new OpenShoppingCartTask();
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Click.on(InventoryScreen.CART_BUTTON)
        );
    }
}
