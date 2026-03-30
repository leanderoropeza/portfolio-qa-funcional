# 🏧 ATM - Validación Funcional de Cajeros Automáticos
> **Proyecto Senior de QA Funcional enfocado en la integridad transaccional, cumplimiento normativo (EMV/PCI) y seguridad bancaria.**

---

## 🎯 Objetivo del Proyecto
Garantizar la calidad y fiabilidad de los procesos críticos en cajeros automáticos, validando la integración entre la interfaz del ATM, el switch transaccional (ISO8583) y el core bancario para asegurar transacciones seguras y precisas.

---

## 🛠️ Tech Stack & Herramientas

| Categoría | Herramientas / Metodologías |
| :--- | :--- |
| **Gestión de Pruebas** | 🟦 Jira Service Management, Rally, TestRail |
| **Validación Técnica** | 🛰️ Postman (APIs), SQL (Consultas Core), Simuladores de Host |
| **Estándares** | 💳 Normas PCI DSS, Protocolos EMV (Chip/Contactless) |
| **Documentación** | 🥒 Gherkin (BDD), Markdown, IEEE 829 |

---

## 🚀 Alcance de la Validación
Para este proyecto se ejecutaron pruebas exhaustivas divididas en tres pilares estratégicos:

### 1. Pruebas End-to-End (E2E)
*   **Flujos Financieros:** Retiros, depósitos (efectivo/cheque), consultas de saldo y transferencias.
*   **Manejo de Excepciones:** Validación de PIN bloqueado, fondos insuficientes, billetes atorados y fallos de comunicación con el Host.

### 2. Cumplimiento & Seguridad
*   **Validación de Normas PCI:** Verificación de encriptación de datos sensibles y flujos de seguridad.
*   **Operaciones EMV:** Pruebas de lectura de chip y respuesta de mensajes de autorización.

### 3. Análisis Técnico & Defectos
*   **Análisis de Logs:** Revisión de trazas para identificar cuellos de botella en los tiempos de respuesta.
*   **Ciclo de Vida del Bug:** Documentación técnica detallada desde la detección hasta el re-test y cierre.

---

## 📂 Estructura de Entregables
Navega por las carpetas para revisar la documentación técnica producida:

*   📂 **[01-Plan-de-Pruebas](./01-plan-de-pruebas)**: Estrategia, riesgos y criterios de aceptación/salida.
*   📂 **[02-Casos-de-Prueba](./02-casos-de-pruebas)**: Suite detallada con escenarios positivos, negativos y de borde.
*   📂 **[03-Matriz-de-Trazabilidad](./03-matriz-de-trazabilidad)**: Relación directa Requisitos ↔ Casos de Prueba ↔ Defectos.
*   📂 **[04-Reportes-de-Bugs](./04-reportes-de-bugs)**: Gestión de incidentes con evidencias técnicas (Logs/Capturas).
*   📂 **[05-Testing-Exploratorio](./05-testing-exploratorio)**: Charters y notas sobre hallazgos fuera de guion.
*   📂 **[06-Evidencias](./evidencias)**: Capturas de pantalla, diagramas de flujo y mockups del ATM.

---

## 🥒 Escenarios de Ejemplo (BDD)
*Utilizamos Gherkin para alinear la visión técnica con la de negocio:*

```gherkin
Escenario: Retiro exitoso de efectivo con saldo suficiente
  Dado que el usuario inserta una tarjeta válida
  Y el saldo en la cuenta es de $500
  Cuando solicita un retiro de $100
  Entonces el ATM debe dispensar el efectivo
  Y el nuevo saldo debe ser $400
  Y se debe imprimir el comprobante de la transacción

