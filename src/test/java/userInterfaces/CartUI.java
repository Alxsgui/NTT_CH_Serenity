package userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CartUI {




    public static final Target BITNAMY = Target
            .the("El usuario presiona el boton de checkout")
            .locatedBy("//img[@alt='Bitnami']");

    public static final Target BTN_BITNAMY = Target
            .the("El usuario presiona el boton de checkout")
            .locatedBy("#bitnami-close-banner-button");

    public static final Target BTN_CHECKOUT = Target
            .the("El usuario presiona el boton de checkout")
            .locatedBy("//a[@class='btn btn-primary']");


}
