package glue;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;
import tasks.CartTask;
import tasks.FormTask;
import tasks.OpenCartHomeTask;
import userInterfaces.SuccessUI;


import static net.serenitybdd.screenplay.actors.OnStage.*;


public class OpenCartHomeGlue {

    @Before

    public void setUp(){
        setTheStage(new OnlineCast());
    }


    @Given("^User se encuentra en el e-commerce de Abstracta$")
    public void userSeEncuentraEnElEcommerceDeAbstracta() {
        theActorCalled("User").attemptsTo(Open.url("https://opencart.abstracta.us/"));

    }

    @When("^Usuario agrega 2 productos y valida el carrito$")
    public void usuarioAgregaElProducto1AlCarrito()  {

        theActorInTheSpotlight().attemptsTo(OpenCartHomeTask.AddToCart());
    }

    @And("^Us selecciona el boton Checkout$")
    public void usuarioSeleccionaElBotonCheckOut()  {
        theActorInTheSpotlight().attemptsTo(CartTask.checkOut());

    }

    @And("^Usuario completa el formulario como Guest con (.*) (.*) (.*) (.*) (.*) (.*) (.*)$")
    public void usuarioCompletaElFormularioComoGuest(String lastname, String email, String phone, String company, String address, String city, String postcode) {
        theActorInTheSpotlight().
                attemptsTo(FormTask.form(lastname, email, phone, company, address, city, postcode));
    }

    @Then("^Se despliega el mensaje Your order has been placed!$")
    public void seDespliegaElMensajeYourOrderHasBeenPlaced()  {

        // assertion para validar el test 
        Ensure.that(SuccessUI.MESSAGE).isDisplayed();



    }



}

