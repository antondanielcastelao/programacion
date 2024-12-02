import java.util.Arrays;

public class ejercicio9 {
    public static void main(String[] args) {
        int[] valores = {0, 0, 1, 2, 3, 4, 4, 0, 5, 5, 5, 5};
        int[] sinDuplicados = eliminarDuplicados(valores);
        System.out.println(Arrays.toString(sinDuplicados));
    }
    public static int[] eliminarDuplicados(int[] tablaEntrada) {
        int contador = tablaEntrada.length;
        boolean[] duplicado = new boolean[tablaEntrada.length];

        // Identificar duplicados
        for (int i = 0; i < tablaEntrada.length; i++) {
            if (!duplicado[i]) { // Sólo verificar si no está marcado como duplicado
                for (int j = i + 1; j < tablaEntrada.length; j++) {
                    if (tablaEntrada[i] == tablaEntrada[j]) {
                        duplicado[j] = true; // Marcar como duplicado
                        contador--; // Reducir el contador de elementos únicos
                    }
                }
            }
        }

        // Crear el array de resultados con el tamaño adecuado
        int[] resultado = new int[contador];
        int contador2 = 0;

        // Llenar el array de resultados con los elementos no duplicados
        for (int i = 0; i < tablaEntrada.length; i++) {
            if (!duplicado[i]) { // Si no es duplicado, añadir al resultado
                resultado[contador2] = tablaEntrada[i];
                contador2++;
            }
        }

        return resultado;
    }
}
