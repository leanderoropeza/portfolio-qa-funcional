# Casos de Prueba – Módulo Login

| ID | Título | Precondiciones | Pasos | Datos | Resultado Esperado | Estado |
|----|---------|----------------|--------|---------|----------------------|----------|
| TC-001 | Login válido | Usuario registrado | 1. Ir a /login 2. Ingresar usuario 3. Ingresar contraseña 4. Clic en “Login” |Username: standard_user

Password: secret_sauce| Acceso correcto, redirige a dashboard | Pendiente |
| TC-002 | Login inválido | Usuario no válido | 1. Ir a /login 2. Ingresar usuario inválido | secret_sauce| Mostrar mensaje “Credenciales incorrectas” | Pendiente |
