import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static public Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        System.out.println("--- Ejercicio 1 ---");
        //ejercicio1();
        System.out.println("--- Ejercicio 2 ---");
        ejercicio2();

    }

    public static void ejercicio1() {

        // Creamos una lista con los productos y otra con sus ventas
        String[] productos = {"leche", "pizza", "galletas", "manzanas"};
        int[] ventas = {345, 123, 556, 1001};
        // Iteramos entre los productos y mediante un condicional los clasificamos por sus ventas
        for (int i=0; i<productos.length;i++ ){
            int venta = ventas[i]; String producto = productos[i];
            if (ventas[i] <= 100) {
                System.out.println("El articulo "+producto + " es de bajo consumo.");
            } else if (venta > 100 && venta<= 500) {
                System.out.println("El articulo "+producto + " es de medio consumo.");
            } else if (venta >500 && venta <=1000) {
                System.out.println("El articulo "+producto + " es de alto consumo.");
            } else if (venta > 1000) {
                System.out.println("El articulo "+producto + " es de primera necesidad.");
            }
        }
    }

    public static void ejercicio2() {
        // menu
        System.out.println(" --- Cálculo de áreas --- ");
        System.out.println("1. Cuadrado");
        System.out.println("2. Triángulo");
        System.out.println("3. Círculo");
        System.out.println("Selecciona una de las opciones:");
        // pedimos al usuario el numero y lo escaneamos
        //Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();
        // definimos las posibilidades del usuario
        switch (opcion) {
            default:
                System.err.println("Porfavor, indica una opcion valida.");
                ejercicio2();
                break;
            case 1:
                System.out.println("Área del cuadrado, por favor introduce:");
                break;
            case 2:
                System.out.println("Área del triángulo, por favor introduce:");
                break;
            case 3:
                System.out.println("Área del círculo, por favor introduce:");
                break;
        }
    }


}