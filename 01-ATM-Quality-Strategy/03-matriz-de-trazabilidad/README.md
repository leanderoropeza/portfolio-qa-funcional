# 🧭 Matriz de Trazabilidad de Requisitos (RTM) - ATM
> **Objetivo:** Garantizar la cobertura total de las Historias de Usuario (HU) y asegurar que cada requisito tenga su correspondiente caso de prueba y resultado.

Esta matriz vincula los requisitos de negocio con el diseño de pruebas y los defectos encontrados, asegurando que **el 100% de las funcionalidades críticas han sido validadas.**

### 📊 Matriz de Cobertura


| ID Historia de Usuario | Requisito de Negocio | ID Caso de Prueba | Estado de Ejecución | Defectos Relacionados |
| :--- | :--- | :--- | :--- | :--- |
| **HU-01** | Retiro de efectivo con tarjeta | ATM-RET-001, 002 | ✅ Passed | - |
| **HU-01** | Validación de saldo insuficiente | ATM-RET-004 | ✅ Passed | - |
| **HU-02** | Bloqueo de seguridad por PIN | ATM-RET-009 | ❌ Failed | **BUG-001** |
| **HU-03** | Impresión de comprobante físico | ATM-CON-005 | ⚠️ Blocked | **BUG-002** (Falla Impresora) |
| **HU-04** | Consulta de saldo en pantalla | ATM-CON-001 | ✅ Passed | - |

---

### 💡 ¿Por qué es vital esta matriz?
Como QA, utilizo esta RTM para:
1.  **Evitar huecos de prueba:** Si una HU no tiene un caso de prueba asociado, el software está en riesgo.
2.  **Análisis de Impacto:** Si la HU-01 cambia, sé exactamente qué casos de prueba debo actualizar.
3.  **Visibilidad para el Negocio:** Permite reportar el progreso real basado en requisitos, no solo en cantidad de tests.

---
*Nota: Esta matriz se actualiza al final de cada ciclo de ejecución de Sprint.*
