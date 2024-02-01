package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userInterfaces.OpenCartHomeUI;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class OpenCartHomeTask implements Task {



    public static Task AddToCart() {

        return instrumented(OpenCartHomeTask.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {


        // se definen la acciones vinculadas a los locators de OpénCartHomeUI,
        // se establece un tiempo max de 20s para que el elemento web sea desplegado.
        // entre más pronto aparece más rápido se ejecuta,al llegar al time out genrará un error.
        // SignIn press button
        actor.attemptsTo(
                Click.on(OpenCartHomeUI.BTN_ADDTOCART_1),

                WaitUntil.the(OpenCartHomeUI.BTN_ADDTOCART_2, isVisible()).forNoMoreThan(8).seconds(),
                Click.on(OpenCartHomeUI.BTN_ADDTOCART_2),

                WaitUntil.the(OpenCartHomeUI.BTN_CART, isVisible()).forNoMoreThan(8).seconds(),
                Click.on(OpenCartHomeUI.BTN_CART),

                WaitUntil.the(OpenCartHomeUI.BTN_VIEW_CART, isVisible()).forNoMoreThan(8).seconds(),
                Click.on(OpenCartHomeUI.BTN_VIEW_CART)




        );




    }
}
