import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Ejercicio 1 ---");
        ejercicio1();

    }

    public static void ejercicio1() {
        String[] productos = {"leche", "pizza", "galletas", "manzanas"};
        int[] ventas = {345, 123, 556, 1001};

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
}