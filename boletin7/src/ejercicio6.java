import java.util.Arrays;

public class ejercicio6 {
    public static void main(String[] args) {
        int[] ordenada = {1, 2, 5, 7, 10, 13, 15, 19,21};
        //System.out.println(Arrays.toString(seleccionar(ordenada,0,8)));
        System.out.println(posicion(ordenada,15));
        //System.out.println(seleccionar(ordenada, ordenada.length/2, ordenada.length-1)[0]);
        //buscadorEficiente(ordenada,1);
    }
    public static int[] seleccionar(int[] lista, int inicio, int fin) {

        int[] resultado = new int[fin - inicio+1];
        for (int i=inicio; i<=fin; i++) {
            resultado[i-inicio] = lista[i];
        }
        return resultado;
    }
    public static int posicion(int[] lista, int valor) {
        if (seleccionar(lista, lista.length/2, lista.length-1)[0] == valor) {
            return 0;
        } else if (seleccionar(lista, lista.length/2, lista.length-1)[0] < valor) {
            return posicion(seleccionar(lista, lista.length/2, lista.length-1), valor);
        } else if (seleccionar(lista, lista.length/2, lista.length-1)[0] > valor) {
            return posicion(seleccionar(lista, 0, lista.length/2), valor);
        } else {
            return -1;
        }
     }
    /*
    public static int buscadorEficiente(int[] lista, int valor) {
        int indiceMitad = lista.length/2;


    }
    */

}
