public class ej2 {
    public static void main(String[] args) {
        String texto = "Hola mundo";
        // ej 1
        System.out.println(comas(texto, 2));
        // ej 2
        System.out.println(espazos(texto+" como estamos por aqui", 2));
        // ej 3
        System.out.println(dixitos("abc1234", 2));
        // ej 4
        System.out.println(cada3dixitos("192168000001", 2));
    }

    /**
     * ejercicio 2a
     * @param texto
     * @param maxreemplazos
     * @return
     */
    public static String comas(String texto, int maxreemplazos) {
        String[] textoSeparado = texto.split("");
        String result = "";
        for (int i = 0; i < textoSeparado.length; i++) {
            String letra = textoSeparado[i];
            if (i != textoSeparado.length-1 && !textoSeparado[i].equals(" ") && maxreemplazos!=0) {
                letra += ",";
                maxreemplazos--;
            }
            result += letra;

        }
        return result;
    }

    /**
     * Ejercicio 2c
     * @param texto
     * @param maxreemplazos
     * @return
     */
    public static String dixitos (String texto , int maxreemplazos) {
        String[] textoSeparado = texto.split("");
        String result = "";
        for (int i = 0; i< textoSeparado.length; i++) {
            String letra = textoSeparado[i];
            if (textoSeparado[i].matches("-?\\d+(\\.\\d+)?") && maxreemplazos!=0) {
                letra = "X";
                maxreemplazos--;
            }
            result += letra;

        }
        return result;
    }
    /**
     * Ejercicio 2b
     * @param texto
     * @param maxreemplazos
     * @return
     */
    public static String espazos (String texto, int maxreemplazos) {
        String[] textoSeparado = texto.split("");
        String result = "";
        for (int i = 0; i< textoSeparado.length; i++) {
            String letra = textoSeparado[i];
            if (textoSeparado[i].equals(" ") && maxreemplazos!=0) {
                letra = "\\_";
                maxreemplazos--;
            }
            result += letra;
        }
        return result;
    }

    /**
     * Ejercicio 2d
     * @param texto
     * @param maxreemplazos
     * @return
     */
    public static String cada3dixitos (String texto, int maxreemplazos) {
        String[] textoSeparado = texto.split("");
        String result = "";

        for (int i = 0; i< textoSeparado.length; i+=3) {
            String letra = textoSeparado[i];
            if (i != textoSeparado.length-3 && maxreemplazos!=0) {
                letra = textoSeparado[i] + textoSeparado[i + 1] + textoSeparado[i + 2] + ".";
                maxreemplazos--;
            } else {
                letra = textoSeparado[i] + textoSeparado[i + 1] + textoSeparado[i + 2];

            }

            result += letra;
        }
        return result;
    }

}
