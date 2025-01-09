public class ej14 {
    public static void main(String[] args) {
        String texto = "Hola mundo";
        String[] textoSeparado = texto.split("");
        for (int i = 0; i< textoSeparado.length; i++) {
            System.out.print(textoSeparado[i]);
        }
        for (int i = textoSeparado.length-1; i>=0; i--) {
            System.out.print(textoSeparado[i]);
        }
    }
}
