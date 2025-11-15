# Montículo

Este trabajo consiste en la implementación de un montículo mínimo (i.e., min-heap) en Java, el cual se describe como un árbol binario en el que la llave de cada nodo es menor o igual que la de sus hijos (i.e., se permiten llaves duplicadas), a la vez que la raíz del estructura contiene el elemento con la llave más pequeña.

A pesar de que la estructura se describe comúnmente por su estructura de árbol, la implementación más típica de los montículos se realiza mediante un arreglo (puede ser de la clase **ArrayList**), en el que la casilla **0** corresponde convencionalemente a la raíz.

Para un nodo que se encuentra en el índice **i**, su hijo izquierdo se encuentra en el índica **2i + 1**, mientras que su hijo derecho se encuentra en el índice **2i + 2**; su padre, por otro lado, se encuentra en el índice **(i - 1)/2** (nótese que el valor resultante de **0** de esta fórmula, cuando **i** es igual a **0**, significa que la raíz es su propio padre, lo cual concuerda de forma simbólica con el hecho de que la raíz en una estructura como esta no tiene padre).

## Requerimientos
- [ ] Los métodos esenciales que se debe implementar en la clase **MinHeap** son:
   - [ ] **insertar()**, el cual recibe los datos necesarios para la creación de un nuevo nodo, lo inserta al final del arreglo y realiza el proceso de **upHeapify** para asegurar que el montículo mantenga su propiedad de ordenamiento, intercambiando el nodo con su padre si su valor es menor que él.
   - [ ] **eliminarMin()**, que retorna la raíz de la estructura, no sin antes poner en la raíz al último elemento del arreglo y realizar el proceso **downHeapify** para restaurar la propiedad de ordenamiento, intercambiándolo con su hijo más pequeño.
   - [ ] **peek()**
   - [ ] **heapify()**, el cual convierte un arreglo desordenado que se recibe como parámetro en un montículo válido aplicándole el principio de ordenamiento establecido y actualizando el contenido anterior del arreglo por dicho montículo recién ordenado.
   - [ ] Tanto el método **upHeapify()** como **downHeapify()** deben funcionar de manera exhaustiva, ubicando al nodo en su lugar correcto en la estructura utilizando tantas iteraciones como sea necesario (i.e., si al intercambiar el nodo de posición vuelve a quedar el montículo de tal manera que el principio de ordenamiento no se está cumpliendo, se debe volver a ejecutar el método).
- [ ] El programa desarrollado debe venir acompañado de un **menu()** de consola simple que permita al usuario utilizar todas las funciones descritas para la estructura de datos.
- [ ] Se debe agregar al proyecto de Java un pequeño documento de formato **.txt** en el que el estudiante desarrolle una explicación de cuál es la aplicación de los montículos al algoritmo de Dijkstra para la búsqueda de caminos en grafos. 
