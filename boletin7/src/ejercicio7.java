import java.util.Arrays;

public class ejercicio7 {
    public static void main(String[] args) {
        int[] matriz = {3, 5, 10, -2};

        System.out.println(Arrays.toString(copiaMatriz(matriz)));
    }
    public static int[] copiaMatriz(int[] matrizEntrada) {
        // hacemos una matriz con el mismo numero de valores que la entrada pero vacios
        int[] resultado = new int[matrizEntrada.length];
        // por cada elemento de la matriz original, añadimos el mismo a la matriz resultante
        for (int i=0; i<matrizEntrada.length; i++) {
            resultado[i] = matrizEntrada[i];
        }
        // devolvemos la matriz resultante
        return resultado;
    }
}
