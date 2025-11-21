#  PLAN DE PRUEBAS – SAUCELAB DEMO WEB
**Autor:** Leander Oropeza – QA Functional Specialist  
**Aplicación bajo prueba:** https://www.saucedemo.com  
**Versión documento:** 1.0  
**Fecha:** 2025  

---

## 1. Introducción
El presente Plan de Pruebas define el enfoque, alcance, recursos, criterios, riesgos y estrategia para validar la calidad funcional del sistema Saucedemo, una aplicación web orientada a ventas en línea (e-commerce) utilizada con fines demostrativos.

Este documento forma parte de un portafolio profesional diseñado para mostrar la metodología, capacidades y buenas prácticas aplicadas en el aseguramiento de calidad.

---

## 2. Objetivo General
Verificar que las funcionalidades principales de Saucedemo operen correctamente, cumpliendo con los requisitos funcionales y proporcionando una experiencia de usuario consistente.

---

## 3. Alcance

### Incluye
- Validación de login (positivo y negativo).  
- Validación del inventario de productos.  
- Agregar y remover productos al carrito.  
- Flujo completo de compra (checkout).  
- Validación de información del producto.  
- Navegación en el menú lateral.  
- Ordenamiento de productos (A-Z, Z-A, precio).  

### No incluye
- Pruebas de rendimiento (stress/load).  
- Pruebas de seguridad avanzada.  
- Automatización avanzada (cubierta en otra carpeta).  
- Validación contra backend real (es demo).  

---

## 4. Requerimientos Funcionales (RF)
Los siguientes requisitos se derivan del comportamiento esperado de la aplicación:

| Código | Requisito |
|--------|-----------|
| RF-01 | El usuario debe poder iniciar sesión con credenciales válidas. |
| RF-02 | El sistema debe mostrar mensaje de error ante credenciales inválidas. |
| RF-03 | El usuario debe visualizar un inventario de productos luego del login. |
| RF-04 | El usuario debe poder añadir productos al carrito. |
| RF-05 | El usuario debe poder visualizar el carrito y sus productos. |
| RF-06 | El usuario debe poder remover productos del carrito. |
| RF-07 | El usuario debe poder completar el flujo de checkout. |
| RF-08 | El sistema debe mostrar un mensaje de confirmación al finalizar la compra. |
| RF-09 | El usuario debe poder navegar usando el menú lateral. |

La trazabilidad completa se encuentra documentada en la carpeta **03-matriz-de-trazabilidad**.

---

## 5. Criterios de Entrada
- Entorno accesible: https://www.saucedemo.com  
- Credenciales válidas disponibles.  
- Requerimientos identificados.  
- Navegadores configurados.  
- Datos de prueba definidos.  

---

## 6. Criterios de Salida
- 100% de los casos de prueba ejecutados.  
- Defectos críticos cerrados.  
- Pruebas de regresión ejecutadas sin fallos.  
- Evidencias adjuntadas en la carpeta **06-evidencias**.  

---

## 7. Datos de Prueba

### Credenciales permitidas por el sistema:

| Usuario | Contraseña | Tipo |
|---------|------------|------|
| standard_user | secret_sauce | Usuario válido |
| locked_out_user | secret_sauce | Usuario bloqueado |
| problem_user | secret_sauce | Usuario con fallos visuales |
| performance_glitch_user | secret_sauce | Usuario lento |
| invalid_user | wrong_pass | No válido |

### Datos checkout:
- Nombre: Juan  
- Apellido: Pérez  
- Código postal: 28001  

---

## 8. Tipos de Pruebas

### Funcionales  
- Flujos completos  
- Validación de reglas  
- Interacciones de usuario  
- Mensajes de error

### Regresión  
- Login  
- Inventario  
- Carrito  
- Checkout  

### Exploratorias  
- Productos  
- Ordenamiento  
- Timeout / Lags  

### Integración Básica  
- Navegación entre módulos  

### End-to-End  
- Todo el flujo de compra  

---

## 9. Estrategia de Pruebas
La estrategia consistirá en:

1. **Analizar requisitos** del sistema.  
2. **Diseñar casos de prueba** detallados (carpeta 02).  
3. **Construir trazabilidad** entre requisitos y casos.  
4. **Ejecutar pruebas funcionales** manuales.  
5. **Registrar defectos** y evidencias.  
6. **Realizar retesting** y posteriormente regresión.  
7. **Generar informe final de calidad** (opcional).

---

## 10. Herramientas Utilizadas
- Navegadores: Chrome, Firefox  
- Gestión: Excel / JIRA (concepto)  
- API Testing: Postman (si aplica)  
- Capturas: Chrome DevTools  
- Control de versiones: GitHub  

---

## 11. Riesgos

| Riesgo | Impacto | Mitigación |
|--------|---------|-------------|
| Cambios en la UI sin aviso | Medio | Pruebas exploratorias frecuentes |
| Caída temporal de la app | Alto | Reagendar ejecución |
| Falta de datos de prueba | Medio | Generar data manualmente |
| Ambientes no persistentes | Bajo | Respaldo de evidencia |

---

## 12. Supuestos
- La aplicación se comporta igual para todos los usuarios válidos.  
- La conexión a internet es estable.  
- No habrá cambios funcionales durante las pruebas.  

---

## 13. Flujo General de Pruebas (Workflow)
1. Login  
2. Visualización del inventario  
3. Selección de producto  
4. Agregar al carrito  
5. Revisar carrito  
6. Iniciar checkout  
7. Ingresar datos  
8. Finalizar compra  
9. Validación de confirmación  

---

## 14. Conclusión
Este Plan de Pruebas establece un enfoque detallado para evaluar la calidad funcional del sitio Saucedemo.  
Refleja prácticas reales utilizadas en proyectos empresariales, demostrando un proceso completo de QA manual y exploratorio.
