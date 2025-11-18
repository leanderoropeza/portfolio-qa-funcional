# BUG-005 – Error en validación de credenciales

**Severidad:** Alta  
**Prioridad:** Media  

**Descripción:**  
El sistema permite intentar login con credenciales inválidas más de 10 veces sin bloquear el acceso.

**Pasos:**  
1. Ir a /login  
2. Ingresar usuario inválido  
3. Repetir 10 veces  
4. Validar respuesta del sistema  

**Resultado Esperado:**  
Bloqueo de seguridad tras 5 intentos fallidos.  

**Resultado Obtenido:**  
Sistema permite intentos ilimitados.  

**Evidencia:** V-002.png
