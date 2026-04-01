package com.ecommerce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class ProductsPage {
    private WebDriver driver;
    private WebDriverWait wait;

    private By btnAddToCart = By.id("add-to-cart-sauce-labs-backpack");
    private By badgeCarrito = By.className("shopping_cart_badge");
    private By btnCarrito = By.className("shopping_cart_link");
    private By btnCheckout = By.id("checkout");

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void agregarProductoAlCarrito() {
        // Espera explícita hasta que el botón sea realmente interactuable
        wait.until(ExpectedConditions.elementToBeClickable(btnAddToCart)).click();
    }

    public String obtenerNumeroDeProductos() {
        try {
            // Esperamos a que el badge aparezca antes de leer el texto
            WebElement badge = wait.until(ExpectedConditions.visibilityOfElementLocated(badgeCarrito));
            return badge.getText();
        } catch (Exception e) {
            return "0";
        }
    }

    public void irAlCarrito() {
        wait.until(ExpectedConditions.elementToBeClickable(btnCarrito)).click();
    }

    public void clickEnCheckout() {
        wait.until(ExpectedConditions.elementToBeClickable(btnCheckout)).click();
    }
}
