import java.lang.invoke.SwitchPoint;
import java.util.Scanner;
/**
 * Clase main que ejecuta el programa. Toma como entrada un numero introducido por el usuario y devuelve el mismo numero en texto.
 * @version 1.0
 * @author dj conguchu
 */
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Pedimos el numero y lo almacenamos
        System.out.println("Porfavor, introduce un numero del 1 al 99: ");
        int ninput = sc.nextInt();

        // Si el numero no se encuentra el rango, el programa se cierra y da error
        if (ninput <1 || ninput > 99) {
            System.err.println("ERROR, el numero no está entre 1 y 99");
            System.exit(1);
        }

        // Evitamos los casos en los que los numeros no tienen nombres compuestos.
        switch (ninput) {
            case 10:
                System.out.println("Diez");
                System.exit(0);
            case 11:
                System.out.println("Once");
                System.exit(0);
            case 12:
                System.out.println("Doce");
                System.exit(0);
            case 13:
                System.out.println("Trece");
                System.exit(0);
            case 14:
                System.out.println("Catorce");
                System.exit(0);
            case 15:
                System.out.println("Quince");
                System.exit(0);
        }

        // Convertimos el numero a string y separamos sus cifras
        String n_string = Integer.toString(ninput);
        // Ahora, caracteres[0] son las decenas y caracteres[1] son las unidades.
        String[] cifras = n_string.split("");

        // Creamos dos strings, una para decenas y otra para unidades
        String dec = null;
        String un = null;

        // Definimos los diferentes casos para representar las decenas.
        switch (cifras[0]) {
            case "1":
                dec = "dieci";
            case "2":
                dec = "veinti";
            case "3":
                dec = "treinta y ";
            case "4":
                dec = "cuarenta y ";
            case "5":
                dec = "cincuenta y ";
            case "6":
                dec = "sesenta y ";
            case "7":
                dec = "setenta y ";
            case "8":
                dec = "ochenta y ";
            case "9":
                dec = "noventa y ";

        }

        // Definimos los casos para las unidades
        switch (cifras[1]) {
            case "1":
                un = "uno";
            case "2":
                un = "dos";
            case "3":
                un = "tres";
            case "4":
                un = "cuatro";
            case "5":
                un = "cinco";
            case "6":
                un = "seis";
            case "7":
                un = "siete";
            case "8":
                un = "ocho";
            case "9":
                un = "nueve";
        }

        // Ahora, cerramos el escaner
        sc.close();

        // Finalmente, damos al usuario la salida de texto del numero el letras en vez de cifras
        System.out.println("El numero introducido es: " + dec + un);
    }
}