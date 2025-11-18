# Casos de Prueba – Módulo Login

| ID | Título | Precondiciones | Pasos | Datos | Resultado Esperado | Estado |
|----|---------|----------------|--------|---------|----------------------|----------|
| TC-001 | Login válido | Usuario registrado | 1. Ir a /login 2. Ingresar usuario 3. Ingresar contraseña 4. Clic en “Login” | user@test.com / Pass123 | Acceso correcto, redirige a dashboard | Pendiente |
| TC-002 | Login inválido | Usuario no válido | 1. Ir a /login 2. Ingresar usuario inválido | user@fake.com | Mostrar mensaje “Credenciales incorrectas” | Pendiente |
