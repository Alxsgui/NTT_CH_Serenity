package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userInterfaces.FormUI;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FormTask implements Task {

    public final String lastname;
    public final String email;
    public final String phone;
    public final String company;
    public final String address;
    public final String city;
    public final String postcode;

    public FormTask(String lastname, String email, String phone, String company, String address, String city, String postcode) {
        this.lastname = lastname;
        this.email = email;
        this.phone = phone;
        this.company = company;
        this.address = address;
        this.city = city;
        this.postcode = postcode;
    }


    public static Task form(String lastname, String email, String phone, String company, String address, String city, String postcode) {

        return instrumented(FormTask.class, lastname, email, phone, company, address, city, postcode);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                WaitUntil.the(FormUI.RBTN_GUEST, isVisible()).forNoMoreThan(8).seconds(),
                Click.on(FormUI.RBTN_GUEST),

                WaitUntil.the(FormUI.BTN_CONTINUE, isVisible()).forNoMoreThan(8).seconds(),
                Click.on(FormUI.BTN_CONTINUE),

                WaitUntil.the(FormUI.FLD_FIRSTNAME, isVisible()).forNoMoreThan(8).seconds(),
                Enter.theValue("test").into(FormUI.FLD_FIRSTNAME),

                WaitUntil.the(FormUI.FLD_LASTNAME, isVisible()).forNoMoreThan(8).seconds(),
                Enter.theValue(lastname).into(FormUI.FLD_LASTNAME),

                WaitUntil.the(FormUI.FLD_EMAIL, isVisible()).forNoMoreThan(8).seconds(),
                Enter.theValue(email).into(FormUI.FLD_EMAIL),

                WaitUntil.the(FormUI.FLD_TELEPHONE, isVisible()).forNoMoreThan(8).seconds(),
                Enter.theValue(phone).into(FormUI.FLD_TELEPHONE),

                WaitUntil.the(FormUI.FLD_COMPANY, isVisible()).forNoMoreThan(8).seconds(),
                Enter.theValue(company).into(FormUI.FLD_COMPANY),

                WaitUntil.the(FormUI.FLD_ADDRESS, isVisible()).forNoMoreThan(8).seconds(),
                Enter.theValue(address).into(FormUI.FLD_ADDRESS),

                WaitUntil.the(FormUI.FLD_CITY, isVisible()).forNoMoreThan(8).seconds(),
                Enter.theValue(city).into(FormUI.FLD_CITY),

                WaitUntil.the(FormUI.FLD_POSTCODE, isVisible()).forNoMoreThan(8).seconds(),
                Enter.theValue(postcode).into(FormUI.FLD_POSTCODE),


                WaitUntil.the(FormUI.DPD_COUNTRY, isVisible()).forNoMoreThan(8).seconds(),
                SelectFromOptions.byVisibleText("Ecuador").from(FormUI.DPD_COUNTRY),


                WaitUntil.the(FormUI.DPD_REGION, isVisible()).forNoMoreThan(8).seconds(),
                SelectFromOptions.byValue("997").from(FormUI.DPD_REGION),

                WaitUntil.the(FormUI.BTN_CONTINUE2, isVisible()).forNoMoreThan(8).seconds(),
                Click.on(FormUI.BTN_CONTINUE2),


                WaitUntil.the(FormUI.BTN_CONTINUE3, isVisible()).forNoMoreThan(8).seconds(),
                Click.on(FormUI.BTN_CONTINUE3),

                WaitUntil.the(FormUI.CHBX_AGREE, isVisible()).forNoMoreThan(8).seconds(),
                Click.on(FormUI.CHBX_AGREE),

                WaitUntil.the(FormUI.BTN_CONTINUE4, isVisible()).forNoMoreThan(8).seconds(),
                Click.on(FormUI.BTN_CONTINUE4),

                WaitUntil.the(FormUI.BTN_CONFIRM, isVisible()).forNoMoreThan(8).seconds(),
                Click.on(FormUI.BTN_CONFIRM)


        );


    }
}
