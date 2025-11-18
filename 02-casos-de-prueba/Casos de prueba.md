# Casos de Prueba – Saucedemo

Esta carpeta contiene los casos de prueba diseñados para validar las funcionalidades principales de la aplicación web Saucedemo (https://www.saucedemo.com).

Cada caso de prueba incluye:

- ID del caso de prueba  
- Nombre del caso  
- Descripción / finalidad  
- Precondiciones  
- Pasos detallados  
- Resultado esperado  
- Tipo de prueba  
- Prioridad  

Los casos de prueba cubren los módulos: Login, Inventario, Carrito, Checkout, Navegación y Ordenamiento de productos.

Estos casos son ideales para demostrar buenas prácticas en QA funcional y forman parte del portafolio profesional de Leander Oropeza.

## Login

| ID    | Nombre          | Descripción / finalidad                                                | Precondición                                          | Tipo      | Prioridad |
| ----- | --------------- | ---------------------------------------------------------------------- | ----------------------------------------------------- | --------- | --------- |
| CP-01 | Login exitoso   | Verificar que un usuario válido pueda acceder al inventario            | Usuario registrado: `standard_user` / `secret_sauce`  | Funcional | Alta      |
| CP-02 | Login bloqueado | Verificar que un usuario bloqueado no pueda acceder al sistema         | Usuario bloqueado: `locked_out_user` / `secret_sauce` | Funcional | Alta      |
| CP-03 | Login inválido  | Verificar que un usuario con credenciales incorrectas no pueda acceder | Usuario inválido: `invalid_user` / `wrong_pass`       | Funcional | Alta      |

CP-01: Login exitoso
| Paso | Acción                                                            | Resultado esperado                                                        |
| ---- | ----------------------------------------------------------------- | ------------------------------------------------------------------------- |
| 1    | Abrir URL: [https://www.saucedemo.com](https://www.saucedemo.com) | Página de login cargada con campos “Username”, “Password” y botón “Login” |
| 2    | Ingresar usuario `standard_user`                                  | Campo “Username” muestra el valor ingresado                               |
| 3    | Ingresar contraseña `secret_sauce`                                | Campo “Password” muestra el valor ingresado (oculto)                      |
| 4    | Presionar “Login”                                                 | Se redirige al inventario; se muestran todos los productos disponibles    |

CP-02: Login bloqueado
| Paso | Acción                             | Resultado esperado                                                      |
| ---- | ---------------------------------- | ----------------------------------------------------------------------- |
| 1    | Abrir URL                          | Página de login cargada                                                 |
| 2    | Ingresar usuario `locked_out_user` | Campo “Username” muestra el valor ingresado                             |
| 3    | Ingresar contraseña `secret_sauce` | Campo “Password” muestra el valor ingresado                             |
| 4    | Presionar “Login”                  | Mensaje de error: “Epic sadface: Sorry, this user has been locked out.” |

CP-03: Login inválido
| Paso | Acción                           | Resultado esperado                                                                             |
| ---- | -------------------------------- | ---------------------------------------------------------------------------------------------- |
| 1    | Abrir URL                        | Página de login cargada                                                                        |
| 2    | Ingresar usuario `invalid_user`  | Campo “Username” muestra el valor ingresado                                                    |
| 3    | Ingresar contraseña `wrong_pass` | Campo “Password” muestra el valor ingresado                                                    |
| 4    | Presionar “Login”                | Mensaje de error: “Epic sadface: Username and password do not match any user in this service.” |


## Inventario 
| ID    | Nombre                         | Descripción / finalidad                                              | Precondición  | Tipo                  | Prioridad |
| ----- | ------------------------------ | -------------------------------------------------------------------- | ------------- | --------------------- | --------- |
| CP-04 | Verificar productos            | Confirmar que se muestran todos los productos tras login             | Login exitoso | Funcional             | Alta      |
| CP-05 | Ordenar productos              | Validar ordenamiento por nombre y precio                             | Login exitoso | Funcional / Regresión | Media     |
| CP-06 | Verificar detalles de producto | Comprobar que al hacer clic en un producto, se muestran sus detalles | Login exitoso | Funcional             | Media     |

CP-04: Verificar productos
| Paso | Acción                             | Resultado esperado                                                       |
| ---- | ---------------------------------- | ------------------------------------------------------------------------ |
| 1    | Iniciar sesión con `standard_user` | Redirección al inventario                                                |
| 2    | Revisar listado de productos       | Todos los productos se muestran con nombre, precio y botón “Add to cart” |

CP-05: Ordenar productos
| Paso | Acción                                  | Resultado esperado                                |
| ---- | --------------------------------------- | ------------------------------------------------- |
| 1    | Seleccionar orden “Name (A to Z)”       | Productos se reordenan alfabéticamente por nombre |
| 2    | Seleccionar orden “Price (low to high)” | Productos se reordenan por precio ascendente      |

CP-06: Verificar detalles de producto
| Paso | Acción                    | Resultado esperado                                         |
| ---- | ------------------------- | ---------------------------------------------------------- |
| 1    | Hacer clic en un producto | Se abre página de detalles del producto seleccionado       |
| 2    | Revisar información       | Nombre, descripción, precio y botón “Add to cart” visibles |

##Carrito 
| ID    | Nombre                          | Descripción / finalidad                                      | Precondición                 | Tipo      | Prioridad |
| ----- | ------------------------------- | ------------------------------------------------------------ | ---------------------------- | --------- | --------- |
| CP-07 | Agregar producto                | Validar que el usuario pueda añadir un producto al carrito   | Login exitoso                | Funcional | Alta      |
| CP-08 | Eliminar producto               | Validar que un producto pueda ser removido del carrito       | Producto agregado al carrito | Funcional | Media     |
| CP-09 | Verificar cantidad de productos | Comprobar que el contador de productos refleje correctamente | Producto(s) agregado(s)      | Funcional | Alta      |

CP-07: Agregar producto
| Paso | Acción                    | Resultado esperado                     |
| ---- | ------------------------- | -------------------------------------- |
| 1    | Seleccionar un producto   | Página de detalle del producto cargada |
| 2    | Presionar “Add to cart”   | Icono del carrito incrementa en 1      |
| 3    | Revisar icono del carrito | Número de productos correcto           |

CP-08: Eliminar producto
| Paso | Acción                               | Resultado esperado                                    |
| ---- | ------------------------------------ | ----------------------------------------------------- |
| 1    | Ir al carrito                        | Carrito muestra todos los productos agregados         |
| 2    | Presionar “Remove” sobre un producto | Producto desaparece del carrito, contador actualizado |

CP-09: Verificar cantidad de productos

| Paso | Acción                    | Resultado esperado                               |
| ---- | ------------------------- | ------------------------------------------------ |
| 1    | Revisar icono del carrito | Muestra el número correcto de productos añadidos |

##Checkout

| ID    | Nombre             | Descripción / finalidad                                         | Precondición              | Tipo                   | Prioridad |
| ----- | ------------------ | --------------------------------------------------------------- | ------------------------- | ---------------------- | --------- |
| CP-10 | Checkout exitoso   | Confirmar flujo completo de compra                              | Producto(s) en el carrito | Funcional / End-to-End | Alta      |
| CP-11 | Checkout sin datos | Validar que el sistema no permita continuar sin completar datos | Producto(s) en el carrito | Funcional              | Media     |

CP-11: Checkout sin datos
| Paso | Acción                                   | Resultado esperado                                             |
| ---- | ---------------------------------------- | -------------------------------------------------------------- |
| 1    | Ir al carrito                            | Se muestra la lista de productos agregados                     |
| 2    | Presionar “Checkout” sin completar datos | Sistema muestra mensaje de error indicando campos obligatorios |

##Navegación y Menú

| ID    | Nombre                   | Descripción / finalidad                                     | Precondición  | Tipo      | Prioridad |
| ----- | ------------------------ | ----------------------------------------------------------- | ------------- | --------- | --------- |
| CP-12 | Navegación entre módulos | Validar que el menú lateral permite moverse entre secciones | Login exitoso | Funcional | Media     |
| CP-13 | Logout                   | Validar que el usuario pueda cerrar sesión correctamente    | Login exitoso | Funcional | Alta      |

CP-12: Navegación entre módulos
| Paso | Acción                  | Resultado esperado                   |
| ---- | ----------------------- | ------------------------------------ |
| 1    | Abrir menú lateral      | Menú lateral desplegado              |
| 2    | Seleccionar “Inventory” | Página de inventario cargada         |
| 3    | Seleccionar “About”     | Página de información cargada        |
| 4    | Seleccionar “Logout”    | Usuario redirigido a página de login |

CP-13: Logout
| Paso | Acción                        | Resultado esperado                  |
| ---- | ----------------------------- | ----------------------------------- |
| 1    | Presionar “Logout”            | Sesión cerrada y redirigido a login |
| 2    | Intentar acceder a inventario | Redirigido a login, acceso denegado |




