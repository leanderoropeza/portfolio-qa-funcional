# ATM – Validación Funcional de Cajero Automático

Proyecto profesional de QA funcional, diseñado para demostrar competencias en pruebas de hardware/software, trazabilidad (Gherkin), documentación profesional y automatización básica.

## Descripción

Este proyecto contiene un plan de pruebas completo, casos de prueba detallados, matriz de trazabilidad, reportes de defectos, evidencias, diagramas y ejemplos de automatización en Java + Selenium y Postman. Todo listo para importar a herramientas como Rally o TestRail.  

Es ideal para mostrar habilidades en:

- Diseño y ejecución de pruebas funcionales.
- Testing exploratorio y análisis de riesgos.
- Documentación profesional y trazabilidad de casos.
- Automatización de flujos críticos de ATM (retiro, saldo, PIN, errores hardware/software).

## Estructura del proyecto

├── 01-plan-de-pruebas/
│ └── test_plan.md
├── 02-casos-de-prueba/
│ ├── ATM-RET-001.md
├── 03-matriz-de-trazabilidad/
│ └── matriz-trazabilidad.xlsx
├── 04-reportes-de-bugs/
│ └── DF-ATM-001.md
├── 05-testing-exploratorio/
│ └── charters.md
├── 06-evidencias/
│ ├── withdraw_pass.png
│ └── diagram_atm_flow.png
├── gherkin/
│ ├── withdraw_money.feature
│ └── atm_error_handling.feature
└── automation/
├── java-selenium-example/
└── postman/atm_api_collection.json


## Métricas (ejemplo)

- Cobertura de casos críticos: 100%  
- Pass rate último ciclo: 96%  
- Defect density: 3 defectos / 100 ejecuciones  
- MTTR defectos críticos: 2h  
- Tiempo medio ejecución por ciclo: 1.5h

## Cómo usar este proyecto

1. Clonar o descargar este proyecto dentro de tu repositorio portfolio:  

```bash
git clone <tu-repo-url>
cd portfolio-qa-funcional/07-proyecto-atm
