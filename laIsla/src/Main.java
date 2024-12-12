/**
 * Programa simulador del famoso juego de fumar porros "La Isla"
 * @author Conguchu y Saul
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        //String[] concursantes = registrarConcursantes();
        //System.out.println(Arrays.toString(concursantes));
        // String [] palabras = {};
        // String [] jugadores = {};
        String [] palabras = {"Spray para osos", "DJ rojo", "porros"};
        mostrarPalabras(palabras);

    }

    /**
     * Función = Muestra las palabras del array unidimensional "palabras", declarado en la main.
     * @param palabras
     * @return
     */
    public static boolean mostrarPalabras (String [] palabras){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un espacio y pulsa enter para rendirte o presiona enter para ver la siguiente");

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

        System.out.println("[*] Introduce el nombre del concursante y pulsa enter");
        for (int i = 0; i<concursantes.length;i++) {
            String nconcursante = entrada.nextLine();
            while (nconcursante.isEmpty())
            {
                nconcursante = entrada.nextLine();
            }
            concursantes[i] = nconcursante;
        }

        System.out.println("[+] Concursantes registrados correctamente");
        return concursantes;
    }
}