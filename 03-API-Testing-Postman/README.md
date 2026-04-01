# 🧪 API Testing & Validation | Core Services
> **Validación técnica de capas de servicios para asegurar la integridad de datos y lógica de negocio.**

Este proyecto demuestra mi capacidad para testear el "corazón" de las aplicaciones (Backend) antes de que lleguen a la interfaz. Me enfoco en la estabilidad de las respuestas, la seguridad de los flujos de datos y la validación de reglas críticas de negocio.

---

## 🛠️ Herramientas & Técnicas
*   **Lenguaje de Automatización:** Java 11/21 (Strongly Typed Logic).
*   **Motor de Pruebas:** TestNG (Assertions & Test Hierarchy).
*   **Técnica de Aislamiento:** **Mocking & Contract Testing** (Garantiza ejecución sin dependencias de red externa).
*   **Tipos de Prueba:** Smoke Tests de API, Pruebas de Contrato y Validación de Casos de Borde (Edge Cases).

---

## 🔍 Escenarios de Prueba Automatizados (Implementados en Java)
1.  **Integridad del JSON (Contract Testing):** Verificación de esquemas para garantizar que el servidor devuelva los campos requeridos (ID, Title, Status).
2.  **Validación de Reglas de Negocio (Core Business):** 
    *   **Control de Stock:** Detección de productos agotados (`stock: 0`) para prevenir errores en el flujo de compra.
    *   **Sanidad Financiera:** Identificación de errores críticos como **precios negativos** o nulos en el catálogo.
3.  **Resiliencia de Tests:** Implementación de respuestas simuladas para mantener la suite de pruebas activa incluso ante inestabilidad de servidores externos (Error 503/404).

---

## 🏗️ Valor Agregado como QA (API-First)
Aplicando el rigor de **entornos bancarios**, mi suite de pruebas en la carpeta `com.ecommerce.api` incluye:
*   **Tests de Regresión de Alta Velocidad:** Scripts que validan la lógica del servidor en milisegundos sin latencia de red.
*   **Detección Preventiva de Bugs:** Identificación de errores de carga en base de datos antes de que afecten la experiencia del usuario.
*   **Arquitectura Desacoplada:** Pruebas que aseguran que el contrato de comunicación entre sistemas no se rompa tras un despliegue.

---
> **Nota:** Este apartado resalta mi competencia técnica en el testing de servicios usando **Java**, una habilidad crítica para asegurar la comunicación robusta entre sistemas complejos.
