import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Instanciar montículo
        MinHeap miMonticulo = new MinHeap();

        //Imprimir montículo vacío
        miMonticulo.imprimirMonticulo();

        //Insertar números enteros al montículo
        miMonticulo.insertar(10);
        miMonticulo.insertar(5);
        miMonticulo.insertar(15);
        miMonticulo.insertar(3);
        miMonticulo.insertar(25);

        //Imprimir montículo
        miMonticulo.imprimirMonticulo();

        //Retornar la raíz del montículo
        System.out.println(miMonticulo.peek());

        //Imprimir montículo
        miMonticulo.imprimirMonticulo();

        //Crear un montículo a partir de un arreglo desordenado
        ArrayList<Integer> arreglo = new ArrayList<>(Arrays.asList(2, 5, 3, 1, 4));
        MinHeap miNuevoMonticulo = new MinHeap();
        miNuevoMonticulo.heapify(arreglo);

        //Imprimir montículo
        miNuevoMonticulo.imprimirMonticulo();

        //Eliminar la raíz de un montículo
        System.out.println(miMonticulo.eliminarMin());

        //Imprimir montículo
        miMonticulo.imprimirMonticulo();
    }
}