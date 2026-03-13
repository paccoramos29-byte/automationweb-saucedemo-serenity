Feature: Carrito

  @Ejercicio


  Scenario: Agregar y eliminar producto del carrito

    Given el usuario abre la pagina de SauceDemo
    When inicia sesion con usuario "standard_user" y password "secret_sauce"
    And agrega un producto al carrito
    Then el contador del carrito debe ser "1"

    When abre el carrito
    Then el producto debe estar visible en el carrito

    When elimina el producto del carrito
    Then el carrito debe estar vacio