public class ej11 {
    public static void main(String[] args) {
        contaCaracteres("Ola, son alumno de DAM1, e son programador desde o 2024");
    }

    public static void contaCaracteres(String texto) {
        int letras = 0, numeros = 0, espazos = 0;

        String[] textoDividido = texto.split("");

        for (int i = 0; i < textoDividido.length; i ++) {
            if (textoDividido[i].equals(" ")) {
                espazos++;
            } else if (textoDividido[i].equals("1") || textoDividido[i].equals("2") || textoDividido[i].equals("3") || textoDividido[i].equals("4") || textoDividido[i].equals("5") || textoDividido[i].equals("6") || textoDividido[i].equals("7") || textoDividido[i].equals("8") || textoDividido[i].equals("9") || textoDividido[i].equals("0")) {
                numeros++;
            } else {
                letras++;
            }
        }

        System.out.println("Letras ou símbolos: " + letras + "\nCifras: " + numeros + "\nEspazos: " + espazos);
    }
}
