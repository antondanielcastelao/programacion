import java.util.Arrays;

public class ej6 {
    public static void main(String[] args) {
        String texto = "www.javadende0.com";
        String[] textoSeparado1 = texto.split("dende0.com");
        String[] textoSeparado2 = texto.split("www.java");

        String textoConcatenado = textoSeparado1[0].concat(textoSeparado2[1]);
        System.out.println(textoConcatenado);
    }
}
