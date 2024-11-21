public class ejercicio5 {
    public static void main(String[] args) {
        int[] diccionario = {-10, 15, 16, 40, -199};

        System.out.println(buscador(diccionario, -10));
    }

    public static int buscador(int[] tabla, int valor) {
        for (int i=0; i < tabla.length; i++) {
            if (tabla[i] == valor) {
                return i;
            }
        }
        return -1;
    }
}
