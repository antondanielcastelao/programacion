import java.util.Arrays;

public class ejercicio8 {
    public static void main(String[] args) {
        int[] numeros = {1,4,5,6,7,9};
        int[] numerosPares = copiaMatrizPares(numeros);
        System.out.println(Arrays.toString(numerosPares));
    }
    public static int[] copiaMatrizPares(int[] matrizEntrada) {
        int contador=0;

        for (int i=0; i<matrizEntrada.length; i++) {
            if (matrizEntrada[i] %2==0) {
                contador++;
            }
        }
        int contador2 = 0;
        int[] resultadoPar = new int[contador];
        // por cada elemento de la matriz original, añadimos el mismo a la matriz resultante
        for (int i=0; i< matrizEntrada.length; i++) {
            if (matrizEntrada[i] %2==0) {
                resultadoPar[contador2] = matrizEntrada[i];
                contador2++;
            }
        }
        // devolvemos la matriz resultante
        return resultadoPar;
    }
}
