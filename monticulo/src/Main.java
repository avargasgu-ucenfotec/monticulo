import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public static void menuPrincipal(MinHeap monticulo) throws Exception {
        byte opcion = -1;

        do {
            System.out.println("\n --- Menú principal --- \n");
            System.out.println("[1] Insertar número entero al montículo");
            System.out.println("[2] Eliminar raíz del montículo");
            System.out.println("[3] Desplegar raíz del montículo");
            System.out.println("[4] Crear montículo a partir de un arreglo");
            System.out.println("[5] Desplegar montículo");
            System.out.println("[0] Salir");
            System.out.print("\nSeleccione una opción del menú: ");
            try {
                opcion = Byte.parseByte(leerTexto());
            } catch (Exception e) {
                System.out.println("Lo sentimos, estamos experimentando problemas técnicos.");
            }
            procesarOpcion(opcion, monticulo);
        } while (opcion != 0);
    }

    public static String leerTexto() throws IOException {
        return in.readLine();
    }

    public static void procesarOpcion(byte opcion, MinHeap monticulo) throws Exception {
        int entero;
        int cantidad;
        ArrayList<Integer> arreglo = new ArrayList<>();
        switch (opcion) {
            case 1:
                System.out.print("Digite el número entero que desea ingresar al montículo: ");
                entero = Integer.parseInt(leerTexto());
                monticulo.insertar(entero);
                break;
            case 2:
                System.out.print("Eliminando la raíz del montículo: ");
                System.out.println(monticulo.eliminarMin());
                break;
            case 3:
                System.out.print("Desplegando la raíz del montículo: ");
                System.out.println(monticulo.peek());
                break;
            case 4:
                //Vaciar el montículo, en caso de ser necesario
                while (!monticulo.isEmpty()) {
                    monticulo.eliminarMin();
                }

                //Solicitar al usuario la cantidad de elementos
                System.out.print("Digite la cantidad de elementos que desea ingresar al arreglo: ");
                cantidad = Integer.parseInt(leerTexto());

                //Construir el montículo a partir de los elementos ingresados por el usuario
                for (int i = 0; i < cantidad; i++) {
                    System.out.print("Digite el número entero que desea ingresar al arreglo: ");
                    entero = Integer.parseInt(leerTexto());
                    arreglo.add(entero);
                }

                //Imprimir el arreglo capturado
                System.out.print("\nEste es el arreglo ingresado: ");
                System.out.println(arreglo);

                //Desordenar el arreglo
                System.out.print("\nEste es el arreglo ingresado, con los elementos desordenados: ");
                Collections.shuffle(arreglo);
                System.out.println(arreglo);

                //Convertir arreglo en un montículo
                monticulo.heapify(arreglo);

                //Desplegar el montículo creado
                monticulo.imprimirMonticulo();
                break;
            case 5:
                monticulo.imprimirMonticulo();
                break;
            case 0:
                System.out.println("Cerrando el programa...");
                break;
            default:
                System.out.println("Opción no válida. Intente de nuevo.");
                break;
        }
    }

    public static void main(String[] args) throws Exception {

        //Inicializar montículo
        MinHeap miMonticulo = new MinHeap();

        //Ejecutar el menú principal
        menuPrincipal(miMonticulo);
    }
}