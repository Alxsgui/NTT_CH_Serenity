package userInterfaces;

import net.serenitybdd.screenplay.targets.Target;


public class FormUI {
    public static final Target RBTN_GUEST = Target
            .the("Guest raduio button")
            .locatedBy("//label[normalize-space()='Guest Checkout']");

    public static final Target BTN_CONTINUE = Target
            .the("Continue button")
            .locatedBy("#button-account");

    public static final Target FLD_FIRSTNAME = Target
            .the("first name field")
            .locatedBy("#input-payment-firstname");

    public static final Target FLD_LASTNAME = Target
            .the("Lastname field")
            .locatedBy("#input-payment-lastname");

    public static final Target FLD_EMAIL = Target
            .the("email field")
            .locatedBy("#input-payment-email");

    public static final Target FLD_TELEPHONE = Target
            .the("telphone field")
            .locatedBy("#input-payment-telephone");

    public static final Target FLD_COMPANY = Target
            .the("Company field")
            .locatedBy("#input-payment-company");

    public static final Target FLD_ADDRESS = Target
            .the("address-1 field")
            .locatedBy("#input-payment-address-1");

    public static final Target FLD_CITY = Target
            .the("City field")
            .locatedBy("#input-payment-city");


    public static final Target FLD_POSTCODE = Target
            .the("Postcode field")
            .locatedBy("#input-payment-postcode");

    public static final Target DPD_COUNTRY = Target
            .the("Country dropdown")
            .locatedBy("#input-payment-country");

    public static final Target DPD_REGION = Target
            .the("Zone dropdown")
            .locatedBy("#input-payment-zone");

    public static final Target CHBX_AGREE = Target
            .the("Agree checkbox")
            .locatedBy("//input[@name='agree']");

    public static final Target BTN_CONTINUE2 = Target
            .the("Continue2 guest button")
            .locatedBy("#button-guest");

    public static final Target BTN_CONTINUE3 = Target
            .the("Continue3 shipping button ")
            .locatedBy("#button-shipping-method");

    public static final Target BTN_CONTINUE4 = Target
            .the("Continue4 payment button ")
            .locatedBy("#button-payment-method");

    public static final Target BTN_CONFIRM = Target
            .the("Confirm button ")
            .locatedBy("#button-confirm");

}
