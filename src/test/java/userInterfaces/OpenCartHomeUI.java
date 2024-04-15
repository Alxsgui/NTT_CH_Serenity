package userInterfaces;

import net.serenitybdd.screenplay.targets.Target;


public class OpenCartHomeUI {

    public static final Target BTN_ADDTOCART_1 = Target
            .the("First product add to cart button")
            .locatedBy("//div[@id='content']//div[1]//div[1]//div[3]//button[1]");

    public static final Target BTN_ADDTOCART_2 = Target
            .the("Second product add to cart")
            .locatedBy("//body//div[@id='common-home']//div[@class='row']//div[@class='row']//div[2]//div[1]//div[3]//button[1]");

    public static final Target BTN_CART = Target
            .the("Cart button")
            .locatedBy("#cart-total");

    public static final Target BTN_VIEW_CART = Target
            .the("Preview cart button ")
            .locatedBy("//strong[normalize-space()='View Cart']");

}
