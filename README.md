# CAMPUS ESTUDIANTIL - PARCIAL 1 APLICACIONES MÓVILES

---

# INFORMACIÓN DE LAS ALUMNAS

## Alumnas

* **Nombre:** Eliana Bermúdez
* **Nombre:** Llubisay Guillén

## Carrera

* **Analista de Sistemas**

## Comisión

* **ACN1BV**

---

# APP MOBILE: CAMPUS ESTUDIANTIL

Aplicación móvil desarrollada en Android que permite a los estudiantes gestionar sus materias y participar en grupos de trabajo de forma simple e intuitiva.

---

# CONCEPTOS APLICADOS

El proyecto implementa:

* ConstraintLayout
* LinearLayout vertical y horizontal
* TextView
* Button
* ImageView
* ScrollView
* Variables de String
* Variables de Dimensiones 
* Variables de Colores
* Uso de archivos drawable
* Eventos con setOnClickListener
* Navegación entre pantallas mediante Intent
* Creación dinámica de elementos desde Java

---

# PANTALLAS MVP

El flujo principal del MVP es:

Login -> Home -> Materias  
Login -> Home -> Grupos

## Login

Pantalla de acceso inicial que presenta:

* Interfaz centrada
* Logo institucional
* Botón de ingreso a la app

---

## Home

Pantalla principal que permite el acceso a las funcionalidades del MVP a través de cards:

* Materias
* Grupos

---

## Materias

La pantalla Materias permite al usuario:

* Visualizar las materias en las que está inscripto
* Mostrar las materias dentro de un ScrollView
* Agregar materias dinámicamente mediante un botón

La interacción del usuario genera cambios dinámicos en la pantalla, cumpliendo con el requisito de comportamiento dinámico.

---

## Grupos

La pantalla Grupos permite al usuario:

* Visualizar el listado de grupos disponibles
* Visualizar los grupos en los que se encuentra adherido
* Identificar el estado de cada grupo (abierto/cerrado)
* Crear nuevos grupos mediante un botón

En la pantalla 'Grupos', al presionar el botón 'Crear grupo', se genera dinámicamente una nueva card de grupo desde Java y se agrega al contenedor de grupos

---
# MOCKUPS

Los mockups de las pantallas se encuentran en la carpeta:

docs/mockups

Pantallas incluidas:

* Login
* Home
* Materias
* Agregar materia
* Grupos de trabajo
* Crear grupo
* Fechas de parciales
* Chat
* Chat conversación
* Perfil
* Editar perfil

---
