package com.ecommerce.tests;

import com.ecommerce.base.BaseTest;
import com.ecommerce.pages.CheckoutPage;
import com.ecommerce.pages.LoginPage;
import com.ecommerce.pages.ProductsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;

public class FlujoCompletoTest extends BaseTest {

    @Test
    public void comprarBackpackHastaElFinal() {
        LoginPage loginPage = new LoginPage(driver);
        ProductsPage productsPage = new ProductsPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // 1. LOGIN
        loginPage.login(props.getProperty("user.standard"), props.getProperty("password.standard"));

        // 2. SELECCIÓN DE PRODUCTO
        // Esperamos a que la tienda cargue
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("inventory_container")));
        productsPage.agregarProductoAlCarrito();

        // 3. TRANSICIÓN AL CARRITO
        productsPage.irAlCarrito();

        // 4. CHECKOUT - FORMULARIO
        productsPage.clickEnCheckout();

        // Usamos el método encapsulado que ya tiene esperas internas
        checkoutPage.completarInformacionEnvio("QA", "Senior", "28001");

        // 5. PASO FINAL: REVISIÓN Y CIERRE
        // Esperamos a que el botón Finish sea visible antes de clicar
        checkoutPage.finalizarCompra();

        // 6. VALIDACIÓN FINAL
        String mensajeExito = checkoutPage.obtenerMensajeConfirmacion();
        Assert.assertEquals(mensajeExito, "Thank you for your order!", "Error: La compra no llegó a la pantalla final.");

        System.out.println("✅ PRUEBA E2E EXITOSA: Flujo completo validado con esperas dinámicas.");
    }
}

