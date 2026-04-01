package com.ecommerce.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Collections;
import java.util.Properties;

public class BaseTest {
    protected WebDriver driver;
    protected Properties props;

    @BeforeMethod
    public void setUp() {
        try {
            // 1. Cargar archivo de configuración
            props = new Properties();
            FileInputStream fis = new FileInputStream("src/test/resources/config.properties");
            props.load(fis);

            // 2. Configurar el binario del driver
            WebDriverManager.chromedriver().setup();

            // 3. Configuración de ChromeOptions (ANTI-BLOQUEO)
            ChromeOptions options = new ChromeOptions();

            // Evita que aparezca el banner "Chrome está siendo controlado por software automatizado"
            options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
            options.setExperimentalOption("useAutomationExtension", false);

            // Evita la detección de scripts de automatización (webdriver: true)
            options.addArguments("--disable-blink-features=AutomationControlled");

            // Manejo de contraseñas y otros avisos
            options.addArguments("--disable-save-password-bubble");
            options.addArguments("--password-store=basic");
            options.addArguments("--start-maximized");

            // 4. Inicializar el driver una sola vez
            driver = new ChromeDriver(options);

            // 5. Configurar tiempos de espera y navegar
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            driver.get(props.getProperty("url"));

        } catch (IOException e) {
            System.err.println("Error cargando el archivo config.properties: " + e.getMessage());
            e.printStackTrace();
        }
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
