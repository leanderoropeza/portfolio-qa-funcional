# Matriz de trazabilidad

Esta carpeta contiene la matriz de trazabilidad que relaciona los requisitos del proyecto con los casos de prueba diseñados para validar cada requisito.

La matriz asegura que todos los requisitos funcionales están cubiertos por casos de prueba y permite hacer seguimiento del estado de ejecución de cada caso.

---

## Contenido

- matriz-trazabilidad.xlsx: Archivo principal con la matriz.
- Explicación de columnas:
  - **ID Requisito**: Identificador único del requisito o historia de usuario.
  - **Descripción Requisito**: Breve descripción funcional del requisito.
  - **ID Caso de Prueba**: Código del caso de prueba que valida el requisito.
  - **Descripción Caso de Prueba**: Breve descripción del caso de prueba.
  - **Estado**: Indica si el caso de prueba fue ejecutado, está pendiente o falló.
  - **Observaciones**: Notas adicionales sobre la ejecución o hallazgos.

---

Esta matriz es fundamental para asegurar la cobertura completa y facilita la auditoría de calidad durante el ciclo de vida del proyecto.


| Requisito | Caso de Prueba | Evidencia | Bug |
|-----------|----------------|-----------|------|
| RF-001 Login | TC-001 | EV-001 | — |
| RF-002 Validación credenciales | TC-002 | EV-002 | BUG-005 |
