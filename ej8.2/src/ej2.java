public class ej2 {
    public static void main(String[] args) {
        String texto = "Hola mundo";
        // ej 1
        System.out.println(comas(texto));
        // ej 2


    }

    /**
     * ejercicio 1
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
}
