# Montículo

Este trabajo consiste en la implementación de un montículo mínimo (i.e., min-heap) en Java, el cual se describe como un árbol binario en el que la llave de cada nodo es menor o igual que la de sus hijos (i.e., se permiten llaves duplicadas), a la vez que la raíz del estructura contiene el elemento con la llave más pequeña.

A pesar de que la estructura se describe comúnmente por su estructura de árbol, la implementación más típica de los montículos se realiza mediante un arreglo (puede ser de la clase **ArrayList**), en el que la casilla **0** corresponde convencionalemente a la raíz.

Para un nodo que se encuentra en el índice **i**, su hijo izquierdo se encuentra en el índica **2i + 1**, mientras que su hijo derecho se encuentra en el índice **2i + 2**; su padre, por otro lado, se encuentra en el índice **(i - 1)/2** (nótese que el valor resultante de **0** de esta fórmula, cuando **i** es igual a **0**, significa que la raíz es su propio padre, lo cual concuerda de forma simbólica con el hecho de que la raíz en una estructura como esta no tiene padre).

## Requerimientos
- [x] Los métodos esenciales que se debe implementar en la clase **MinHeap** son:
   - [x] **insertar()**, el cual recibe los datos necesarios para la creación de un nuevo nodo, lo inserta al final del arreglo y realiza el proceso de **upHeapify** para asegurar que el montículo mantenga su propiedad de ordenamiento, intercambiando el nodo con su padre si su valor es menor que él.
   - [x] **eliminarMin()**, que retorna la raíz de la estructura, no sin antes poner en la raíz al último elemento del arreglo y realizar el proceso **downHeapify** para restaurar la propiedad de ordenamiento, intercambiándolo con su hijo más pequeño.
   - [x] **peek()**
   - [x] **heapify()**, el cual convierte un arreglo desordenado que se recibe como parámetro en un montículo válido aplicándole el principio de ordenamiento establecido y actualizando el contenido anterior del arreglo por dicho montículo recién ordenado.
   - [x] Tanto el método **upHeapify()** como **downHeapify()** deben funcionar de manera exhaustiva, ubicando al nodo en su lugar correcto en la estructura utilizando tantas iteraciones como sea necesario (i.e., si al intercambiar el nodo de posición vuelve a quedar el montículo de tal manera que el principio de ordenamiento no se está cumpliendo, se debe volver a ejecutar el método).
- [x] El programa desarrollado debe venir acompañado de un **menu()** de consola simple que permita al usuario utilizar todas las funciones descritas para la estructura de datos.
- [x] Se debe agregar al proyecto de Java un pequeño documento de formato **.txt** en el que el estudiante desarrolle una explicación de cuál es la aplicación de los montículos al algoritmo de Dijkstra para la búsqueda de caminos en grafos. 

## Casos de prueba
### Flujo 1. Insertar 5 elementos a un montículo vacío
#### Paso 1. Confirmar que el montículo se encuentra vacío
El usuario selecciona la opción 5 del menú con el fin de visualizar el estado por defecto del montículo.
```
 --- Menú principal --- 

[1] Insertar número entero al montículo
[2] Eliminar raíz del montículo
[3] Desplegar raíz del montículo
[4] Crear montículo a partir de un arreglo
[5] Desplegar montículo
[0] Salir

Seleccione una opción del menú: 5
```
```
Montículo vacío

Montículo almacenado
[ ]
```
Se confirma que el montículo está vacío.
#### Paso 2. Inserción de 5 números enteros al montículo
El usuario selecciona la opción 1 del menú con el fin de ingresar el número 10 al montículo.
```
 --- Menú principal --- 

[1] Insertar número entero al montículo
[2] Eliminar raíz del montículo
[3] Desplegar raíz del montículo
[4] Crear montículo a partir de un arreglo
[5] Desplegar montículo
[0] Salir

Seleccione una opción del menú: 1
Digite el número entero que desea ingresar al montículo: 10
```
El usuario selecciona la opción 1 del menú con el fin de ingresar el número 3 al montículo.
```
 --- Menú principal --- 

[1] Insertar número entero al montículo
[2] Eliminar raíz del montículo
[3] Desplegar raíz del montículo
[4] Crear montículo a partir de un arreglo
[5] Desplegar montículo
[0] Salir

Seleccione una opción del menú: 1
Digite el número entero que desea ingresar al montículo: 3
```
El usuario selecciona la opción 1 del menú con el fin de ingresar el número 2 al montículo.
```
 --- Menú principal --- 

[1] Insertar número entero al montículo
[2] Eliminar raíz del montículo
[3] Desplegar raíz del montículo
[4] Crear montículo a partir de un arreglo
[5] Desplegar montículo
[0] Salir

Seleccione una opción del menú: 1
Digite el número entero que desea ingresar al montículo: 2
```
El usuario selecciona la opción 1 del menú con el fin de ingresar el número 4 al montículo.
```
 --- Menú principal --- 

[1] Insertar número entero al montículo
[2] Eliminar raíz del montículo
[3] Desplegar raíz del montículo
[4] Crear montículo a partir de un arreglo
[5] Desplegar montículo
[0] Salir

Seleccione una opción del menú: 1
Digite el número entero que desea ingresar al montículo: 4
```
El usuario selecciona la opción 1 del menú con el fin de ingresar el número 5 al montículo.
```
 --- Menú principal --- 

[1] Insertar número entero al montículo
[2] Eliminar raíz del montículo
[3] Desplegar raíz del montículo
[4] Crear montículo a partir de un arreglo
[5] Desplegar montículo
[0] Salir

Seleccione una opción del menú: 1
Digite el número entero que desea ingresar al montículo: 5
```
El usuario selecciona la opción 5 del menú con el fin de visualizar el estado del montículo almacenado.
```
 --- Menú principal --- 

[1] Insertar número entero al montículo
[2] Eliminar raíz del montículo
[3] Desplegar raíz del montículo
[4] Crear montículo a partir de un arreglo
[5] Desplegar montículo
[0] Salir

Seleccione una opción del menú: 5
```
```
Montículo almacenado
[ 2 4 3 10 5 ]
```
Se confirma que el montículo se construyó y almacenó correctamente.

### Flujo 2. Eliminar la raíz de un montículo con 5 elementos y restaurar la propiedad de ordenamiento
#### Paso 1. Confirmar que el montículo tiene 5 elementos
El usuario selecciona la opción 5 del menú con el fin de visualizar el estado del montículo almacenado.
```
 --- Menú principal --- 

[1] Insertar número entero al montículo
[2] Eliminar raíz del montículo
[3] Desplegar raíz del montículo
[4] Crear montículo a partir de un arreglo
[5] Desplegar montículo
[0] Salir

Seleccione una opción del menú: 5
```
```
Montículo almacenado
[ 2 4 3 10 5 ]
```
#### Paso 2. Eliminar la raíz del montículo
El usuario selecciona la opción 2 del menú con el fin de eliminar la raíz del montículo.
```
 --- Menú principal --- 

[1] Insertar número entero al montículo
[2] Eliminar raíz del montículo
[3] Desplegar raíz del montículo
[4] Crear montículo a partir de un arreglo
[5] Desplegar montículo
[0] Salir

Seleccione una opción del menú: 2
```
```
Eliminando la raíz del montículo: 2
```
El usuario selecciona la opción 5 del menú con el fin de visualizar el estado del montículo almacenado.
```
 --- Menú principal --- 

[1] Insertar número entero al montículo
[2] Eliminar raíz del montículo
[3] Desplegar raíz del montículo
[4] Crear montículo a partir de un arreglo
[5] Desplegar montículo
[0] Salir

Seleccione una opción del menú: 5
```
```
Montículo almacenado
[ 3 4 5 10 ]
```
Se confirma que la raíz fue eliminada y se restauró la propiedad de ordenamiento del montículo.

### Flujo 3. Desplegar la raíz de un montículo con 4 elementos sin alterar el montículo
#### Paso 1. Confirmar que el montículo tiene 4 elementos
El usuario selecciona la opción 5 del menú con el fin de visualizar el estado del montículo almacenado.
```
 --- Menú principal --- 

[1] Insertar número entero al montículo
[2] Eliminar raíz del montículo
[3] Desplegar raíz del montículo
[4] Crear montículo a partir de un arreglo
[5] Desplegar montículo
[0] Salir

Seleccione una opción del menú: 5
```
```
Montículo almacenado
[ 3 4 5 10 ]
```
#### Paso 2. Desplegar la raíz del montículo
El usuario selecciona la opción 3 del menú con el fin de desplegar la raíz del montículo.
```
 --- Menú principal --- 

[1] Insertar número entero al montículo
[2] Eliminar raíz del montículo
[3] Desplegar raíz del montículo
[4] Crear montículo a partir de un arreglo
[5] Desplegar montículo
[0] Salir

Seleccione una opción del menú: 3
```
```
Desplegando la raíz del montículo: 3
```
El usuario selecciona la opción 5 del menú con el fin de visualizar el estado del montículo almacenado.
```
 --- Menú principal --- 

[1] Insertar número entero al montículo
[2] Eliminar raíz del montículo
[3] Desplegar raíz del montículo
[4] Crear montículo a partir de un arreglo
[5] Desplegar montículo
[0] Salir

Seleccione una opción del menú: 5
```
```
Montículo almacenado
[ 3 4 5 10 ]
```
Se confirma que la raíz fue desplegada y montículo no sufrió cambios.

### Flujo 4. Crear un montículo de 5 elementos a partir de un arreglo de números enteros
#### Paso 1. Confirmar que el montículo se encuentra vacío
El usuario selecciona la opción 5 del menú con el fin de visualizar el estado por defecto del montículo.
```
 --- Menú principal --- 

[1] Insertar número entero al montículo
[2] Eliminar raíz del montículo
[3] Desplegar raíz del montículo
[4] Crear montículo a partir de un arreglo
[5] Desplegar montículo
[0] Salir

Seleccione una opción del menú: 5
```
```
Montículo vacío

Montículo almacenado
[ ]
```
Se confirma que el montículo está vacío.
#### Paso 2. Seleccionar la cantidad de elementos, así como los números enteros que conforman el arreglo
El usuario selecciona la opción 4 del menú con el fin de seleccionar el tamaño del arreglo.
```
 --- Menú principal --- 

[1] Insertar número entero al montículo
[2] Eliminar raíz del montículo
[3] Desplegar raíz del montículo
[4] Crear montículo a partir de un arreglo
[5] Desplegar montículo
[0] Salir

Seleccione una opción del menú: 4
```
El usuario selecciona 5 para definir la cantidad de elementos del arreglo.
```
Digite la cantidad de elementos que desea ingresar al arreglo: 5
```
El usuario ingresa el número 1 al arreglo.
```
Digite el número entero que desea ingresar al arreglo: 1
```
El usuario ingresa el número 2 al arreglo.
```
Digite el número entero que desea ingresar al arreglo: 2
```
El usuario ingresa el número 3 al arreglo.
```
Digite el número entero que desea ingresar al arreglo: 3
```
El usuario ingresa el número 4 al arreglo.
```
Digite el número entero que desea ingresar al arreglo: 4
```
El usuario ingresa el número 5 al arreglo.
```
Digite el número entero que desea ingresar al arreglo: 5
```
El sistema despliega el arreglo ingresado, luego el arreglo desordenado y el montículo generado a partir de ese arreglo.
```
Este es el arreglo ingresado: [1, 2, 3, 4, 5]

Este es el arreglo ingresado, con los elementos desordenados: [3, 4, 5, 2, 1]

Montículo almacenado
[ 1 2 5 4 3 ]
```
#### Paso 3. Cerrar el programa
El usuario selecciona la opción 0 del menú con el fin de cerrar el programa.
```
 --- Menú principal --- 

[1] Insertar número entero al montículo
[2] Eliminar raíz del montículo
[3] Desplegar raíz del montículo
[4] Crear montículo a partir de un arreglo
[5] Desplegar montículo
[0] Salir

Seleccione una opción del menú: 0
```
```
Cerrando el programa...
```
