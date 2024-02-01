@OpenCart
Feature: Proceso de Compra en el Sitio Web abstracta opencart

  Scenario Outline: Agregar productos al carrito
    Given User se encuentra en el e-commerce de Abstracta
    When Usuario agrega 2 productos y valida el carrito
    And Us selecciona el boton Checkout
    And Usuario completa el formulario como Guest con <lastname> <email> <phone> <company> <address> <city> <postcode>
    Then Se despliega el mensaje Your order has been placed!
    Examples:
      | lastname | email           | phone   | company | address | city  | postcode |
      | Alvarez  | test@ntt.com.ec | 2123456 | NTT     | AvUio   | Quito | 172545   |