public class ej3 {
    public static void main(String[] args) {
        String texto = "Java dende 0";
        String[] textoSeparado = texto.split("");
        String[] textoInvertido = new String[texto.length()];
        int counter = 0;

        for (int i = texto.length()-1; i >= 0; i--) {
            textoInvertido[counter] = textoSeparado[i];
            counter++;
        }

        for (int i = 0; i < textoInvertido.length; i++) {
            System.out.print(textoInvertido[i]);
        }
    }
}
