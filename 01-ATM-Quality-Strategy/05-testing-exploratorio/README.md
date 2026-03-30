# 🔍 Testing Exploratorio - ATM System
> **Objetivo:** Descubrir comportamientos inesperados y casos de borde mediante sesiones de exploración estructurada basadas en misiones (Charters).

En lugar de seguir pasos predefinidos, aquí utilizo mi **experiencia en banca** para "atacar" los puntos más débiles del sistema, documentando los hallazgos en sesiones de tiempo limitado.

### 📑 Resumen de Sesiones Exploratorias (Charters)


| ID Charter | Misión de la Sesión | Áreas Exploradas | Tiempo | Hallazgos / Bugs |
| :--- | :--- | :--- | :--- | :--- |
| **CH-001** | Explorar la resiliencia del hardware ante errores de red | Conexión Host, Timeout | 45 min | **BUG-002** (Error de comunicación) |
| **CH-002** | Validar la integridad de la UI en pantallas de error | Pantalla de PIN, Error Saldo | 30 min | **BUG-003** (Texto mal alineado) |
| **CH-003** | Test de estrés en flujo de retiros rápidos | Menú Rápido, Teclado físico | 60 min | Sin fallos críticos encontrados |

---

### 🧠 Heurísticas Utilizadas
Para estas sesiones aplico heurísticas de testing profesional:
*   **Goldilocks (Ricitos de Oro):** Probar valores demasiado grandes, demasiado pequeños y los "justos" (límites).
*   **Interruptus:** Cancelar transacciones en momentos críticos (ej: justo antes de entregar el dinero).
*   **Data Type Attacks:** Ingresar caracteres especiales o tipos de datos no permitidos en el teclado numérico.

---

