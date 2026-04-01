package com.ecommerce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    // Localizadores: Los "nombres" de los campos en la web
    private By txtUsername = By.id("user-name");
    private By txtPassword = By.id("password");
    private By btnLogin = By.id("login-button");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String user, String pass) {
        driver.findElement(txtUsername).sendKeys(user);
        driver.findElement(txtPassword).sendKeys(pass);
        driver.findElement(btnLogin).click();
    }

    // 1. Añade este localizador arriba con los otros
    private By lblError = By.cssSelector("h3[data-test='error']");

    // 2. Añade este método abajo con las otras acciones
    public String obtenerMensajeError() {
        return driver.findElement(lblError).getText();
    }

}
