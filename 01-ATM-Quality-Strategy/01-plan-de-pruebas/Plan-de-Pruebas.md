# 🏦 Plan de Pruebas – Cajero Automático (ATM)

Autor: Leander Oropeza – QA Functional Specialist  

---

## 1. Introducción
El objetivo de este plan de pruebas es definir el enfoque, alcance, recursos y actividades necesarias para validar la calidad funcional y de seguridad de un cajero automático (ATM).  
Se busca garantizar que las operaciones críticas (retiros, depósitos, consultas, transferencias) funcionen correctamente y que el sistema sea confiable y seguro para los usuarios.

---

## 2. Alcance
Incluye la validación de:
- **Operaciones básicas**: retiro de efectivo, depósitos, consulta de saldo, cambio de PIN.  
- **Interacciones con hardware**: lector de tarjetas, dispensador de billetes, impresora de recibos, pantalla táctil.  
- **Seguridad**: autenticación con tarjeta y PIN, cifrado de datos, bloqueo tras intentos fallidos.  
- **Conectividad**: comunicación con el servidor bancario, respuesta ante fallos de red.  
- **Escenarios negativos**: tarjeta inválida, PIN incorrecto, saldo insuficiente, billetes agotados.

---

## 3. Estrategia de Pruebas
- **Pruebas funcionales**: Validar que cada transacción se ejecute correctamente.  
- **Pruebas no funcionales**: Rendimiento, disponibilidad, tiempos de respuesta.  
- **Pruebas de seguridad**: Simulación de ataques físicos y lógicos.  
- **Pruebas de recuperación**: Validar comportamiento ante fallos de red o hardware.  

---

## 4. Casos de Prueba (Ejemplos)
1. Retiro de efectivo con tarjeta válida y saldo suficiente.  
2. Intento de retiro con PIN incorrecto (bloqueo tras 3 intentos).  
3. Depósito de efectivo y verificación del saldo actualizado.  
4. Consulta de saldo con tarjeta válida.  
5. Manejo de error cuando el dispensador se queda sin billetes.  
6. Prueba de desconexión de red y recuperación automática.  

---

## 5. Recursos Necesarios
- Cajeros físicos o simuladores.  
- Tarjetas válidas e inválidas.  
- Datos de prueba (cuentas con diferentes saldos).  
- Herramientas de monitoreo y registro de transacciones.  

---

## 6. Criterios de Aceptación
- Todas las operaciones críticas deben completarse sin errores.  
- El sistema debe manejar adecuadamente los casos de error.  
- No deben existir vulnerabilidades de seguridad conocidas.  
- El tiempo de respuesta debe estar dentro de los límites definidos por el banco.  

---

## 7. Entregables
- Documentación de casos de prueba.  
- Evidencias de ejecución (capturas, logs).  
- Reporte de resultados con conclusiones y recomendaciones.  

---

