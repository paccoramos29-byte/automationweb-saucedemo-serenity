package org.example.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import org.example.ui.InventoryScreen;
import org.example.ui.CartScreen;

public class CartScreenData {

    public static Question<String> badgeValue(){
        return actor ->
                InventoryScreen.CART_BADGE
                        .resolveFor(actor)
                        .getText();
    }

    public static Question<Boolean> productVisible(){
        return actor ->
                CartScreen.PRODUCT_NAME
                        .resolveFor(actor)
                        .isVisible();
    }
    public static Question<Boolean> cartIsEmpty(){
        return actor ->
                InventoryScreen.CART_BADGE
                        .resolveAllFor(actor)
                        .isEmpty();
    }
}