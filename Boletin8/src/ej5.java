public class ej5 {
    public static void main(String[] args) {
        String texto = "java java java";
        String[] textoArray = texto.split("");

        int vogais = 0, consoantes = 0;

        for (int i = 0; i < textoArray.length; i++) {
            if (textoArray[i].equals("a") || textoArray[i].equals("e") || textoArray[i].equals("i") || textoArray[i].equals("o") || textoArray[i].equals("u")) {
                vogais++;
            } else if (textoArray[i].equals(" ")) {
            } else  {
                consoantes++;
            }
        }

        System.out.println("Vogais: " + vogais);
        System.out.println("Consoantes: " + consoantes);
    }
}
