package userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class FormUI {

    public static final Target RBTN_GUEST = Target
            .the("El usuario selecciona Guest")
            .locatedBy("//label[normalize-space()='Guest Checkout']");

    public static final Target BTN_CONTINUE = Target
            .the("El usuario selecciona boton continue")
            .locatedBy("#button-account");

    public static final Target FLD_FIRSTNAME = Target
            .the("El usuario selecciona el campo firstname")
            .locatedBy("#input-payment-firstname");

    public static final Target FLD_LASTNAME = Target
            .the("El usuario selecciona el campo lastname")
            .locatedBy("#input-payment-lastname");

    public static final Target FLD_EMAIL = Target
            .the("El usuario selecciona el campo email")
            .locatedBy("#input-payment-email");

    public static final Target FLD_TELEPHONE = Target
            .the("El usuario selecciona el campo telephone")
            .locatedBy("#input-payment-telephone");

    public static final Target FLD_COMPANY = Target
            .the("El usuario selecciona el campo company")
            .locatedBy("#input-payment-company");

    public static final Target FLD_ADDRESS = Target
            .the("El usuario selecciona el campo address-1")
            .locatedBy("#input-payment-address-1");

    public static final Target FLD_CITY = Target
            .the("El usuario selecciona el campo city")
            .locatedBy("#input-payment-city");


    public static final Target FLD_POSTCODE = Target
            .the("El usuario selecciona el campo postcode")
            .locatedBy("#input-payment-postcode");

    public static final Target DPD_COUNTRY = Target
            .the("El usuario selecciona el dropdown country")
            .locatedBy("#input-payment-country");

    public static final Target DPD_REGION = Target
            .the("El usuario selecciona el dropdown zone")
            .locatedBy("#input-payment-zone");

    public static final Target CHBX_AGREE = Target
            .the("El usuario selecciona el checkbox")
            .locatedBy("//input[@name='agree']");

    public static final Target BTN_CONTINUE2 = Target
            .the("El usuario selecciona el boton continuar")
            .locatedBy("#button-guest");

    public static final Target BTN_CONTINUE3 = Target
            .the("El usuario selecciona el boton continuar ")
            .locatedBy("#button-shipping-method");

    public static final Target BTN_CONTINUE4 = Target
            .the("El usuario selecciona el boton continuar ")
            .locatedBy("#button-payment-method");

    public static final Target BTN_CONFIRM = Target
            .the("El usuario selecciona el boton continuar ")
            .locatedBy("#button-confirm");

}
