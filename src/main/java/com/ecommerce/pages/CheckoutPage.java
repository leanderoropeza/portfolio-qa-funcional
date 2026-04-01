package com.ecommerce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class CheckoutPage {
    private WebDriver driver;
    private WebDriverWait wait;

    private By txtFirstName = By.id("first-name");
    private By txtLastName = By.id("last-name");
    private By txtZipCode = By.id("postal-code");
    private By btnContinue = By.id("continue");
    private By btnFinish = By.id("finish");
    private By lblConfirmation = By.className("complete-header");

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void escribirNombre(String nombre) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(txtFirstName)).sendKeys(nombre);
    }

    public void escribirApellido(String apellido) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(txtLastName)).sendKeys(apellido);
    }

    public void escribirCodigoPostal(String zip) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(txtZipCode)).sendKeys(zip);
    }

    public void clicEnContinuar() {
        wait.until(ExpectedConditions.elementToBeClickable(btnContinue)).click();
    }

    public void finalizarCompra() {
        wait.until(ExpectedConditions.elementToBeClickable(btnFinish)).click();
    }

    public String obtenerMensajeConfirmacion() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(lblConfirmation)).getText();
    }

    public void completarInformacionEnvio(String nombre, String apellido, String zip) {
        escribirNombre(nombre);
        escribirApellido(apellido);
        escribirCodigoPostal(zip);
        clicEnContinuar();
    }
}

