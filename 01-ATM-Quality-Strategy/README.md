# ATM – Validación Funcional de Cajero Automático

Proyecto profesional de QA funcional diseñado para mostrar competencias en pruebas de hardware/software, trazabilidad (Gherkin), documentación profesional y automatización básica.

Ejecución de pruebas funcionales y no funcionales en servicios vinculados a cajeros automáticos (ATM), incluyendo retiros, depósitos, consultas, transferencias y operaciones EMV.

Validación de flujos end-to-end entre los sistemas del core bancario, switch transaccional, servicios ISO8583 y la interfaz del ATM.

Diseño y documentación de casos de prueba basados en requisitos funcionales, técnicos y normativos del sector bancario.

Uso de simuladores de ATM y herramientas de monitoreo transaccional para verificar mensajes, autorizaciones y respuestas del host.

Análisis de logs y trazas para identificar fallos en transacciones, tiempos de respuesta y errores de integración.

Gestión de defectos en herramientas como Jira, asegurando trazabilidad desde la detección hasta la resolución.

Coordinación con equipos de desarrollo, seguridad, infraestructura y proveedor de ATM para validar incidencias y verificar actualizaciones de software.

Ejecución de pruebas de regresión tras cambios en el switch, firmware del ATM o actualizaciones del sistema bancario.

Validación de normas PCI, flujos de seguridad y correcta encriptación/propagación de datos sensibles en las transacciones.

Elaboración de informes de resultados, métricas de calidad y evidencias para auditorías internas y externas.

## Contenido del proyecto

- **01-plan-de-pruebas/**: Documento de planificación y estrategia de pruebas.
- **02-casos-de-prueba/**:casos de prueba detallados .
- **03-matriz-de-trazabilidad/**: Relación historias → casos → defectos → ejecución.
- **04-reportes-de-bugs/**: Defectos detectados con evidencias.
- **05-testing-exploratorio/**: Charters y notas rápidas para testing exploratorio.
- **06-evidencias/**: Capturas, mockups y diagramas del flujo ATM.
- **gherkin/**: Escenarios BDD críticos para flujos de retiro, saldo, PIN y errores.
- **automation/**: Ejemplos de automatización Java + Selenium y colección Postman.

