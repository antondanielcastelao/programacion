public class ej5 {
    public static void main(String[] args) {
        String texto = "universal serial bus";

        //ej 5a
        System.out.println(siglas(texto));
        // ej 5b
        System.out.println(maius(texto));

    }

    public static String siglas(String texto) {
        String[] textoSeparado = texto.split(" ");
        String resultado = "";
        for (int i = 0; i<textoSeparado.length; i++) {
            String[] palabrasSeparadas = textoSeparado[i].split("");
            resultado+=palabrasSeparadas[0];
        }
        return resultado;
    }

    public static String maius(String texto) {
        String[] textoSeparado = texto.split(" ");
        String resultado = "";
        for (int i = 0; i<textoSeparado.length; i++) {
            String[] palabraSeparada = textoSeparado[i].split("");
            for (int j = 0; j< palabraSeparada.length; j++) {
                if (j == 0) {
                    resultado += palabraSeparada[j].toUpperCase();
                } else {
                    resultado += palabraSeparada[j];

                }
            }
            resultado+= " ";
        }
        return resultado;
    }
}
