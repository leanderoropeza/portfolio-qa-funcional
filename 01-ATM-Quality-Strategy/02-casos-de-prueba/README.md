# 📑 Casos de Prueba - ATM (Retiros de Efectivo)
> **Objetivo:** Validar la lógica de negocio y el manejo de excepciones en el flujo de retiros de un cajero automático.

### 📊 Matriz de Escenarios de Prueba


| ID | Título del Escenario | Prioridad | Tipo | Resultado Esperado |
| :--- | :--- | :--- | :--- | :--- |
| **ATM-RET-001** | Retiro exitoso (100€) | Alta | Positivo | Entrega de billetes y actualización de saldo. |
| **ATM-RET-002** | Retiro exitoso (50€) | Alta | Positivo | Entrega de billetes y impresión de ticket. |
| **ATM-RET-004** | Saldo insuficiente | Alta | Negativo | Mensaje de error: "Fondos insuficientes". |
| **ATM-RET-005** | Falta de denominaciones | Media | Negativo | Mensaje: "Cajero sin billetes disponibles". |
| **ATM-RET-007** | Tarjeta bloqueada | Alta | Seguridad | El cajero retiene la tarjeta por seguridad. |
| **ATM-RET-009** | Bloqueo por PIN (3 intentos) | Alta | Seguridad | Bloqueo de cuenta tras el tercer fallo. |

---

### 🔍 Detalles Técnicos del Diseño
Para estos casos de prueba se aplicaron las siguientes técnicas de diseño:
*   **Particiones de Equivalencia:** Para validar rangos de montos de retiro.
*   **Análisis de Valores Límite:** Pruebas con el saldo exacto y saldo -1.
*   **Pruebas de Transición de Estados:** Gestión del bloqueo de tarjeta tras múltiples intentos fallidos.

---
*Nota: Los detalles de pre-condiciones y pasos de reproducción se encuentran en los archivos individuales de esta carpeta.*
