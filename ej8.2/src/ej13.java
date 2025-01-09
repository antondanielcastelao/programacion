public class ej13 {
    public static void main(String[] args) {
        String texto = "Hola mundo";
        String[] textoSeparado = texto.split("");
        for (int i = 0; i<textoSeparado.length; i+=2) {
            System.out.print(textoSeparado[i]);
        }
    }
}
