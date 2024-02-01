package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouseToTarget;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userInterfaces.CartUI;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CartTask implements Task {

    public static Task checkOut() {

        return instrumented(CartTask.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(


                //Imagen Bitnamy evita que el locator BTN_CHECKOUT sea encontrado. con este paso se cierra la imagen
                // se solventa en pantallas grandes o maximzando el navegador.
                //El archivo serenity.conf posee la instruccion start-maximized pero no esta ejecutandolo de esta manera
                WaitUntil.the(CartUI.BITNAMY, isVisible()).forNoMoreThan(8).seconds(),
                new MoveMouseToTarget(CartUI.BITNAMY),
                Click.on(CartUI.BTN_BITNAMY),

                WaitUntil.the(CartUI.BTN_CHECKOUT, isVisible()).forNoMoreThan(8).seconds(),
                Click.on(CartUI.BTN_CHECKOUT));


    }


}
