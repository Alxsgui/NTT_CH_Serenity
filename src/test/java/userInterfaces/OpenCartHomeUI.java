package userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class OpenCartHomeUI {

     public static final Target BTN_ADDTOCART_1 = Target
         .the("El usuario selecciona el primer producto")
           .locatedBy("//div[@id='content']//div[1]//div[1]//div[3]//button[1]");

     public static final Target BTN_ADDTOCART_2 = Target
             .the("El usuario selecciona el segundo producto")
             .locatedBy( "//body//div[@id='common-home']//div[@class='row']//div[@class='row']//div[2]//div[1]//div[3]//button[1]");

     public static final Target BTN_CART = Target
             .the("El usuario abre el preview del carrito")
             .locatedBy("#cart-total");

     public static final Target BTN_VIEW_CART = Target
             .the("El usuario abre el carrito")
             .locatedBy("//strong[normalize-space()='View Cart']");





}
