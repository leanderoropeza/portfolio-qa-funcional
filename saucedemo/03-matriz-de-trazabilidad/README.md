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


| ID Requisito | Descripción Requisito       | ID Caso de Prueba | Descripción Caso de Prueba             | Estado    | Observaciones    |
| ------------ | --------------------------- | ----------------- | -------------------------------------- | --------- | ---------------- |
| RQ-001       | Login con usuario válido    | CP-01             | Verificar login exitoso con usuario    | Ejecutado | Sin incidencias  |
| RQ-002       | Login con usuario bloqueado | CP-02             | Verificar mensaje de usuario bloqueado | Ejecutado | Mensaje correcto |
| RQ-003       | Agregar producto al carrito | CP-07             | Validar adición correcta de producto   | Pendiente |                  |
| RQ-004       | Realizar pago con tarjeta   | CP-10             | Validar proceso de checkout exitoso    | Ejecutado | Sin errores      |



## Archivo Matriz de Trazabilidad

Puedes descargar o abrir el archivo de la matriz de trazabilidad [aquí](./matriz-trazabilidad.xlsx).

Este archivo contiene la relación entre requisitos y casos de prueba, mostrando la cobertura y el estado de cada uno.
