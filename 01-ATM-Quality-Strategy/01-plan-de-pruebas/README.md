# 📑 Plan de Pruebas: Ecosistema ATM
**ID Proyecto:** ATM-QA-2024 | **Versión:** 1.2

---

### 🎯 1. Visión General
Validación integral del flujo transaccional, asegurando el cumplimiento de normativas bancarias y la integridad del hardware/software.

### 🔍 2. Alcance Estratégico

| Tipo de Prueba | Foco Principal |
| :--- | :--- |
| **Funcional** | Retiros, Depósitos, Consultas (E2E) |
| **Hardware** | Sensores de casetas, Lector EMV, Impresora Térmica |
| **Seguridad** | Cifrado de PIN (EPP), Normas PCI DSS |
| **Conectividad** | Tiempos de respuesta del Host (Timeout handling) |

### 🛠️ 3. Recursos & Data
*   **Ambiente:** Simulador de ATM (NCR/Diebold) + Core Bancario en Sandbox.
*   **Data:** Tarjetas con Chip (EMV), Cuentas con estados: *Activa, Bloqueada, Fondos Insuficientes*.

### ✅ 4. Criterios de Salida (Exit Criteria)
1. 100% de los casos de prueba de severidad **Crítica** y **Alta** ejecutados y aprobados.
2. Cierre o mitigación de todos los defectos que afecten el saldo contable.
3. Validación exitosa de los logs de conciliación diaria.
