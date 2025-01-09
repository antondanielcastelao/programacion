public class ej2 {
    public static void main(String[] args) {
        String texto = "Hola mundo";
        // ej 1
        System.out.println(comas(texto));
        // ej 2
        System.out.println(espazos(texto));
        // ej 3
        System.out.println(dixitos(texto));
        // ej 4
        System.out.println(cada3dixitos(texto));
    }

    /**
     * ejercicio 2a
     * @param texto
     * @return
     */
    public static String comas(String texto) {
        String[] textoSeparado = texto.split("");
        String result = "";
        for (int i = 0; i < textoSeparado.length; i++) {
            String letra = textoSeparado[i];
            if (i != textoSeparado.length-1 && !textoSeparado[i].equals(" ")) {
                letra += ",";
            }
            result += letra;
        }
        return result;
    }

    /**
     * Ejercicio 2c
     * @param texto
     * @return
     */
    public static String dixitos (String texto) {
        String[] textoSeparado = texto.split("");
        String result = "";
        for (int i = 0; i< textoSeparado.length; i++) {
            String letra = textoSeparado[i];
            if (textoSeparado[i].matches("-?\\d+(\\.\\d+)?")) {
                letra = "X";
            }
            result += letra;
        }
        return result;
    }
    /**
     * Ejercicio 2b
     * @param texto
     * @return
     */
    public static String espazos (String texto) {
        String[] textoSeparado = texto.split("");
        String result = "";
        for (int i = 0; i< textoSeparado.length; i++) {
            String letra = textoSeparado[i];
            if (textoSeparado[i].equals(" ")) {
                letra = "\\_";
            }
            result += letra;
        }
        return result;
    }

    /**
     * Ejercicio 2d
     * @param texto
     * @return
     */
    public static String cada3dixitos (String texto) {
        String[] textoSeparado = texto.split("");
        String result = "";

        for (int i = 0; i< textoSeparado.length; i+=3) {
            String letra = textoSeparado[i];
            if (i != textoSeparado.length-3) {
                letra = textoSeparado[i] + textoSeparado[i + 1] + textoSeparado[i + 2] + ".";
            } else {
                letra = textoSeparado[i] + textoSeparado[i + 1] + textoSeparado[i + 2];

            }

            result += letra;
        }
        return result;
    }

}
