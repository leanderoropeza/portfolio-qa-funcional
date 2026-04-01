package com.ecommerce.tests;

import com.ecommerce.base.BaseTest;
import com.ecommerce.pages.LoginPage;
import com.ecommerce.pages.ProductsPage;
import com.ecommerce.utils.VisualUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;

public class CompraTest extends BaseTest {

    @Test
    public void flujoCompraBackpack() {
        LoginPage loginPage = new LoginPage(driver);
        ProductsPage productsPage = new ProductsPage(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        // 1. LOGIN
        VisualUtils.pausar(1);
        loginPage.login(props.getProperty("user.standard"), props.getProperty("password.standard"));

        // 2. SINCRONIZACIÓN: Esperar explícitamente a que el inventario sea visible
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("inventory_container")));

        // 3. AGREGAR AL CARRITO
        productsPage.agregarProductoAlCarrito();

        // 4. VALIDACIÓN: El método obtenerNumeroDeProductos ya incluye su propia espera
        String cantidad = productsPage.obtenerNumeroDeProductos();

        Assert.assertEquals(cantidad, "1", "Error: El badge del carrito no muestra la cantidad esperada.");
        System.out.println("✅ CompraTest: ¡Flujo completado con éxito!");
    }
}
