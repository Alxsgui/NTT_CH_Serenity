package userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class SuccessUI {


    public static final Target MESSAGE = Target
            .the("EL usuario valida la compra")
            .locatedBy("//h1[normalize-space()='Your order has been placed!']");

}
