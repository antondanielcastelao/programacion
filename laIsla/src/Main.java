/**
 * Programa simulador del famoso juego de fumar porros "La Isla"
 * @author Conguchu y Saul
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {

        String [] palabras = {};
        String [] jugadores = {};

    }

    /**
     * Función = Muestra las palabras del array unidimensional "palabras", declarado en la main.
     * @param palabras
     * @return
     */
    public static boolean mostrarPalabras (String [] palabras){
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < palabras.length; i++){
            System.out.println(palabras[i]);
        }
        return palabras;
    }

    /**
     * Registra los nombres de los concursantes que jugarán a la isla
     * @return array con los concursantes
     */
    public static String[] registrarConcursantes() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("\n [+] Introduce el numero de personas que jugaréis > ");
        int nConcursantes = entrada.nextInt();

        String[] concursantes = new String[nConcursantes];

        System.out.println("Introduce el nombre del concursante y pulsa enter");
        for (int i = 0; i<concursantes.length;i++) {
            concursantes[i] = entrada.nextLine();
        }

        System.out.println("[+] Concursantes registrados correctamente");
        return concursantes;
    }
}