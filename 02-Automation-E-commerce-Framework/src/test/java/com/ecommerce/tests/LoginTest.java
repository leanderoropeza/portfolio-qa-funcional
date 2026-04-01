package com.ecommerce.tests;

import com.ecommerce.base.BaseTest;
import com.ecommerce.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void loginExitoso() {
        LoginPage loginPage = new LoginPage(driver);

        // Aquí el código lee tu archivo config.properties
        loginPage.login(props.getProperty("user.standard"), props.getProperty("password.standard"));

        // Verificamos que el login funcionó viendo la URL
        Assert.assertTrue(driver.getCurrentUrl().contains("inventory.html"), "¡Error! No se pudo iniciar sesión.");
    }

    @Test
    public void loginFallido() {
        LoginPage loginPage = new LoginPage(driver);

        // Intentamos entrar con un usuario que no existe
        loginPage.login("usuario_falso", "password_error");

        // Buscamos el mensaje de error en la página
        // (Añadiremos este localizador a LoginPage en el siguiente paso)
        String mensajeError = loginPage.obtenerMensajeError();

        // Validación: El sistema debe avisar que las credenciales no coinciden
        Assert.assertTrue(mensajeError.contains("Username and password do not match"),
                "El mensaje de error no es el esperado");
    }

}

