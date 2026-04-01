package com.ecommerce.tests;

import com.ecommerce.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PruebaConexion extends BaseTest {

    @Test
    public void validarTituloECommerce() {
        // El driver ya viene configurado desde BaseTest
        String tituloActual = driver.getTitle();
        System.out.println("Validando acceso a: " + tituloActual);

        // Validación real (Assertion) de TestNG
        String tituloEsperado = "Swag Labs";
        Assert.assertEquals(tituloActual, tituloEsperado, "El título de la página no coincide");
    }
}
