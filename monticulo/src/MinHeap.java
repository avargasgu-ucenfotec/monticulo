import java.util.ArrayList;

public class MinHeap {

    //Atributos
    private final ArrayList<Integer> heap;

    //Métodos
    //Constructor
    public MinHeap() {
        heap = new ArrayList<>();
    }

    //Insertar nodo
    public void insertar(int entero) {
        //Insertar un número entero al final del arreglo
        heap.add(entero);

        //Retornar el índice del número entero insertado
        int indiceNuevo = heap.size() - 1;

        //upHeapify
        upHeapify(indiceNuevo);
    }

    //Eliminar raíz
    public int eliminarMin() {
        //Revisar si el montículo está vacío
        if (heap.isEmpty()) {
            throw new RuntimeException("Operación no válida. Montículo vacío.");
        }

        //Retornar raíz
        int min = heap.getFirst();

        //Remover el último número entero en el arreglo
        int ultimoNumero = heap.removeLast();

        if (!heap.isEmpty()) {
            // Mover el último número entero a la raíz del montículo
            heap.set(0, ultimoNumero);

            //downHeapify
            downHeapify();
        }
        return min;
    }

    //Retornar índice del padre
    public int indicePadre(int i) {
        return (i - 1) / 2;
    }

    //Retorna índice del hijo izquierdo
    public int indiceHijoIzquierdo(int i) {
        return 2 * i + 1;
    }

    //Retorna índice del hijo derecho
    public int indiceHijoDerecho(int i) {
        return 2 * i + 2;
    }

    //Intercambiar los números enteros en los índices i y j
    private void intercambiar(int i, int j) {
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    //Revisa si el montículo está vacío
    public boolean isEmpty() {
        return heap.isEmpty();
    }

    //Intercambiar el nuevo número entero con su padre si su valor es menor que él
    public void upHeapify(int indiceNuevo) {
        while (indiceNuevo > 0 && heap.get(indiceNuevo) < heap.get(indicePadre(indiceNuevo))) {
            intercambiar(indiceNuevo, indicePadre(indiceNuevo));
            indiceNuevo = indicePadre(indiceNuevo);
        }
    }

    //Reordenar el montículo para que la raíz tenga el número entero de menor valor
    public void downHeapify() {
        int indiceActual = 0;
        while (true) {
            int izquierdo = indiceHijoIzquierdo(indiceActual);
            int derecho = indiceHijoDerecho(indiceActual);

            int menor = indiceActual;

            if (izquierdo < heap.size() && heap.get(izquierdo) < heap.get(menor)) {
                menor = izquierdo;
            }

            if (derecho < heap.size() && heap.get(derecho) < heap.get(menor)) {
                menor = derecho;
            }

            if (menor == indiceActual) {
                break;
            }

            intercambiar(indiceActual, menor);
            indiceActual = menor;
        }
    }

    //Retornar raíz del montículo
    public int peek() {
        return heap.getFirst();
    }

    //Imprimir elementos del montículo
    public void imprimirMonticulo() {
        if (heap.isEmpty()) {
            System.out.println("\nMontículo vacío");
        }

        System.out.println("\nMontículo almacenado");
        System.out.print("[ ");
        for (int e : heap) {
            System.out.print(e + " ");
        }
        System.out.println("]");
    }

    //Convertir un arreglo en un montículo
    public void heapify(ArrayList<Integer> arreglo) {
        if (arreglo.isEmpty()) {
            System.out.println("Arreglo vacío");
        }

        //Insertar cada elemento del arreglo en el montículo
        for (int e : arreglo) {
            insertar(e);
        }
    }
}
