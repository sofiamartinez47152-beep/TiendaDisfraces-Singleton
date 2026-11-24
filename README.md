# Gestor de Alquiler de Disfraces - Patrón Singleton

Proyecto desarrollado para la evaluación **EGI** aplicando el patrón de diseño **Singleton** en Java.

## Descripción del problema y solución
En una tienda de alquiler de disfraces que opera de forma simultánea a través de un **mostrador físico** y un **módulo web**, mantener copias separadas del inventario en memoria genera inconsistencias y reservas duplicadas del mismo disfraz.

Para resolverlo, se implementó la clase `GestorAlquilerDisfraces` como un **Singleton** con inicialización diferida (*Lazy Initialization*), garantizando una única instancia compartida del catálogo durante toda la ejecución del programa.

## Estructura del proyecto (`src/`)
* **`GestorAlquilerDisfraces.java`**: Clase Singleton que administra el catálogo en un `HashMap<String, Boolean>` y centraliza las consultas, alquileres y devoluciones.
* **`MostradorFisico.java`**: Simula las operaciones presenciales (alquiler y devolución).
* **`ModuloWeb.java`**: Simula las operaciones online (consulta de stock y reserva).
* **`Main.java`**: Clase de prueba por consola que verifica la unicidad de la instancia y ejecuta un flujo simulado entre ambos canales.

## Requisitos
* Java (OpenJDK 26 o superior).
* IntelliJ IDEA (opcional, también puede ejecutarse desde consola).

## Cómo ejecutarlo
1. Clonar el repositorio:
   ```bash
   git clone <URL-DE-TU-REPOSITORIO>
