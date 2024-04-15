package userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class SuccessUI {


    public static final Target MESSAGE = Target
            .the("Succesful message")
            .locatedBy("//h1[normalize-space()='Your order has been placed!']");

}
