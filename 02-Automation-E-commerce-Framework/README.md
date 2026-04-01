# 🚀 E-commerce Automation Framework | Selenium, Java & TestNG

> **Framework de automatización E2E diseñado bajo el patrón Page Object Model (POM) para la validación de flujos críticos de negocio.**

Este proyecto demuestra una arquitectura de nivel **Senior**, enfocada en la resiliencia de las pruebas frente a comportamientos asíncronos del navegador y la mantenibilidad del código.

---

## 🛠️ Stack Tecnológico & Patrones
*   **Lenguaje:** Java 11+
*   **Automatización:** Selenium WebDriver 4.x
*   **Patrón de Diseño:** **Page Object Model (POM)** con encapsulamiento de esperas explícitas.
*   **Gestión de Pruebas:** TestNG (Suites y Assertions).
*   **Configuración:** Archivos `.properties` para manejo de entornos.
*   **Utilidades:** Manejo de esperas visuales personalizadas para demostraciones.

---

## 🏗️ Aspectos Destacados de la Arquitectura
*   **BaseTest:** Clase padre que centraliza la configuración del Driver y el manejo de `ChromeOptions` para evitar bloqueos de seguridad.
*   **Sincronización Avanzada:** Implementación de `WebDriverWait` dentro de las clases de página para eliminar "flaky tests".
*   **Suite de Regresión:** Orquestación mediante `testng.xml` para ejecución en lote de toda la batería de pruebas.

---

## 🔍 Cobertura de Pruebas
1.  **Autenticación:** Validaciones de Login Exitoso y Flujos Negativos (credenciales inválidas).
2.  **Gestión de Inventario:** Selección de productos y validación de persistencia en el badge del carrito.
3.  **Checkout E2E:** Flujo completo desde la autenticación hasta la "Thank You Page" (confirmación de orden).

---

## 🚀 Cómo Ejecutar
1. Clonar el repositorio.
2. Ejecutar `mvn test` desde la terminal o correr el archivo `testng.xml` en tu IDE.
