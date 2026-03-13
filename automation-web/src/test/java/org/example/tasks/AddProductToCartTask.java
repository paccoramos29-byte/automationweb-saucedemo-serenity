package org.example.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import org.example.ui.InventoryScreen;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AddProductToCartTask implements Task {

    public static AddProductToCartTask add(){
        return new AddProductToCartTask();
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Click.on(InventoryScreen.ADD_TO_CART_BACKPACK),

                WaitUntil.the(InventoryScreen.CART_BADGE, isVisible())
                        .forNoMoreThan(10).seconds()
        );
    }
}
