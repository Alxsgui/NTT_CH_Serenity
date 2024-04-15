package userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CartUI {


    public static final Target BITNAMY = Target
            .the("Bitnamy Button")
            .locatedBy("//img[@alt='Bitnami']");

    public static final Target BTN_BITNAMY = Target
            .the("Bitnamy  close button")
            .locatedBy("#bitnami-close-banner-button");

    public static final Target BTN_CHECKOUT = Target
            .the("Checkout Button")
            .locatedBy("//a[@class='btn btn-primary']");

}