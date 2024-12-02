import java.util.Arrays;

public class ejercicio10 {
    public static void main(String[] args) {
        int[] valoresDesordenados = {1, 9 , 5, 5, 7, 10};
        int[] valores1 = eliminarValor(valoresDesordenados, 5);
        System.out.println(Arrays.toString(valores1));

        int[] valoresOrdenados = {1, 4 , 5, 5, 7, 10};
        int[] valores2 = eliminarValor(valoresOrdenados, 5);
        System.out.println(Arrays.toString(valores2));

    }
    public static int[] eliminarValor(int[] matrizEntrada, int valorEliminar) {
        // vamos a contar los elementos que no vamos a eliminar
        int contadorElementos = matrizEntrada.length;
        // iteramos la matriz de entrada y si el elemento es el que queremos eliminar, restamos uno al contador
        for (int i=0; i<matrizEntrada.length; i++) {
            if (matrizEntrada[i] == valorEliminar) {
                contadorElementos--;
            }
        }
        // creamos la matriz resultado con el tamaño del valor del contador
        int[] matrizResultado = new int[contadorElementos];
        int contador2=0;
        // volvemos a iterar pero esta vez si el elemento NO es el que vamos a eliminar, se añade al array resultado., nos apoyamos en otro contador
        for (int i = 0; i<matrizEntrada.length; i++) {
            if (matrizEntrada[i] != valorEliminar) {
                matrizResultado[contador2] = matrizEntrada[i];
                contador2++;
            }
        }
        return matrizResultado;
    }

    public static int[] eliminarValorOrdenados(int[] matrizEntrada, int valorEliminar) {
        // contar los elementos distintos de valorEliminar
        int contadorElementos = 0;
        // primera pasada para contar cuántos elementos no son el valor a eliminar
        for (int i = 0; i < matrizEntrada.length; i++) {
            if (matrizEntrada[i] != valorEliminar) {
                contadorElementos++;
            } else {
                // como el array está ordenado, si encontramos el valorEliminar,
                // no es necesario continuar si los elementos restantes son iguales.
                break;
            }
        }
        // crear el array resultado con el tamaño adecuado
        int[] matrizResultado = new int[contadorElementos];
        int contador2 = 0;
        // segunda pasada para llenar el array resultado
        for (int i = 0; i < matrizEntrada.length; i++) {
            if (matrizEntrada[i] != valorEliminar) {
                matrizResultado[contador2] = matrizEntrada[i];
                contador2++;
            } else {
                // mismo criterio, salir temprano en caso de encontrar valorEliminar
                break;
            }
        }

        return matrizResultado;
    }
}
