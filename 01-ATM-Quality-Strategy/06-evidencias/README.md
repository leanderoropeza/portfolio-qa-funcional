# 📸 Evidencias de Ejecución - ATM Project
> **Objetivo:** Documentación visual de los resultados de prueba, incluyendo flujos exitosos, fallos críticos y diagramas de arquitectura.

---

### ✅ 01. Transacciones Exitosas (Happy Path)
Validación del flujo completo de retiro de efectivo sin errores.
![Retiro Exitoso](./withdraw_pass.png)
*Descripción: El sistema entrega el monto solicitado y actualiza el saldo correctamente.*

---

### ❌ 02. Reporte de Defectos (Bugs Encontrados)
Evidencia visual de los fallos reportados en la matriz de defectos.

**BUG-001: Error de Validación de PIN**
![Error PIN](./error-pin.png)
*Severidad: 🔥 Crítica | El sistema permite el acceso tras superar los intentos fallidos.*

---

### 📊 03. Documentación Técnica y Procesos
Diagramas de flujo que servieron de base para el diseño de los Casos de Prueba.
![Diagrama de Flujo](./diagran_atm_flow.png)

---

### 📂 Logs y Soporte Técnico
*   [Descargar Log de Transacciones](./logs-ejecucion.txt): Registro detallado de la comunicación con el Host durante la prueba de estrés.

---
*Nota: Todas las capturas han sido anonimizadas para proteger datos sensibles de la simulación bancaria.*
