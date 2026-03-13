package org.example.ui;

import net.serenitybdd.screenplay.targets.Target;

public class InventoryScreen {

    public static final Target ADD_TO_CART_BACKPACK =
            Target.the("boton add to cart backpack")
                    .locatedBy("#add-to-cart-sauce-labs-backpack");

    public static final Target CART_BADGE =
            Target.the("contador carrito")
                    .locatedBy(".shopping_cart_badge");

    public static final Target CART_BUTTON =
            Target.the("boton carrito")
                    .locatedBy(".shopping_cart_link");
}
