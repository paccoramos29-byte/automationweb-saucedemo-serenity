package org.example.ui;
import net.serenitybdd.screenplay.targets.Target;
public class HomeSauceDemoScreen {
    public static final Target CART_BADGE =
            Target.the("contador carrito")
                    .locatedBy(".shopping_cart_badge");
}
