import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public static void menuPrincipal(MinHeap monticulo) throws Exception {
        byte opcion = -1;

        do {
            System.out.println("\n --- Menú principal --- \n");
            System.out.println("[ 1] Insertar número entero al montículo");
            System.out.println("[ 2] Eliminar raíz del montículo");
            System.out.println("[ 3] Desplegar raíz del montículo");
            System.out.println("[ 4] Crear montículo a partir de un arreglo");
            System.out.println("[ 5] Desplegar montículo");
            System.out.println("[ 0] Salir");
            System.out.print("\nSeleccione una opción del menú: ");
            try {
                opcion = Byte.parseByte(leerTexto());
            } catch (Exception e) {
                System.out.println("Lo sentimos, estamos experimentando problemas técnicos.");
            }
            //procesarOpcion(opcion, tienda);
        } while (opcion != 0);
    }

    public static String leerTexto() throws IOException {
        return in.readLine();
    }

    public static void main(String[] args) throws Exception {

        //Inicializar montículo
        MinHeap miMonticulo = new MinHeap();

        //Ejecutar el menú principal
        menuPrincipal(miMonticulo);

        //Instanciar montículo
        /*MinHeap miMonticulo = new MinHeap();

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
        miMonticulo.imprimirMonticulo();*/
    }
}