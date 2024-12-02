import java.util.Arrays;

public class ejercicio10 {
    public static void main(String[] args) {
        int[] valores = {1, 9 , 5, 5, 7, 10};
        int[] valoresN = eliminarValor(valores, 5);
        System.out.println(Arrays.toString(valoresN));
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
}
