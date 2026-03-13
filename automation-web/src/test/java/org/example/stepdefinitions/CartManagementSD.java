package org.example.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import org.example.tasks.*;
import org.example.questions.*;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class CartManagementSD {

    Actor usuario;

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
        usuario = OnStage.theActorCalled("Usuario");
    }

    @Given("el usuario abre la pagina de SauceDemo")
    public void abrirPagina(){
        usuario.attemptsTo(OpenPage.open());
    }

    @When("inicia sesion con usuario {string} y password {string}")
    public void login(String user, String pass){
        usuario.attemptsTo(
                LoginTask.withCredentials(user, pass)
        );
    }

    @When("agrega un producto al carrito")
    public void agregarProducto(){
        usuario.attemptsTo(
                AddProductToCartTask.add()
        );
    }

    @Then("el contador del carrito debe ser {string}")
    public void validarBadge(String cantidad){
        usuario.should(
                seeThat(CartScreenData.badgeValue(), equalTo(cantidad))
        );
    }

    @When("abre el carrito")
    public void abrirCarrito(){
        usuario.attemptsTo(
                OpenShoppingCartTask.open()
        );
    }

    @Then("el producto debe estar visible en el carrito")
    public void validarProductoEnCarrito(){
        usuario.should(
                seeThat(CartScreenData.productVisible())
        );
    }
    @When("elimina el producto del carrito")
    public void eliminarProducto(){
        usuario.attemptsTo(
                RemoveProductFromCartTask.remove()
        );
    }

    @Then("el carrito debe estar vacio")
    public void validarCarritoVacio(){
        usuario.should(
                seeThat(CartScreenData.cartIsEmpty(), equalTo(true))
        );
    }
}