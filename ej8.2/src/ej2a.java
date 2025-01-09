public class ej2a {
    public static void main(String[] args) {
        String texto = "Hola mundo";
        String[] textoSeparado = texto.split("");

        for (int i = 0; i < textoSeparado.length; i++) {
            String letra = textoSeparado[i];
            if (i != textoSeparado.length-1 && !textoSeparado[i].equals(" ")) {
                letra += ",";
            }
            System.out.print(letra);
        }
    }
}
