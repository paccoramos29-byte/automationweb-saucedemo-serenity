package org.example.ui;

import net.serenitybdd.screenplay.targets.Target;

public class CartScreen {

    public static final Target PRODUCT_NAME =
            Target.the("producto en carrito")
                    .locatedBy(".inventory_item_name");
    public static final Target REMOVE_BUTTON =
            Target.the("boton remover producto")
                    .locatedBy("//button[contains(@id,'remove')]");
}
