import java.lang.invoke.SwitchPoint;
import java.util.Scanner;
/**
 * Clase main que ejecuta el programa. Toma como entrada un numero introducido por el usuario y devuelve el mismo numero en texto.
 * @version 1.0
 * @author dj conguchu
 */
public class Main {
    public static void main(String[] args) {
        //debug_todos_casos();
        usuario();
    }

    public static void debug_todos_casos() {
        Integer x = 1;
        while (x < 100) {
            System.out.println(x);
            System.out.println(logica(x));
            x +=1;
        }
    }

    // Funcion para input del usuario
    public static void usuario() {
        Scanner sc = new Scanner(System.in);

        // Pedimos el numero y lo almacenamos
        System.out.println("Porfavor, introduce un numero del 1 al 99: ");
        int ninput = sc.nextInt();


        String func = logica(ninput);
        // Ahora, cerramos el escaner
        sc.close();

        // Finalmente, damos al usuario la salida de texto del numero el letras en vez de cifras
        System.out.println(func);
    }

    public static String logica(int ninput) {
        if (ninput < 1 || ninput > 99) {
            // Verificamos que el numero este entre 1 y 99
            return("ERROR, el numero no está entre 1 y 99");
        }
        if (ninput < 10) {
            switch (ninput){
                case 1-> {
                    return "uno";
                }
                case 2-> {
                    return "dos";
                }
                case 3-> {
                    return "tres";
                }
                case 4-> {
                    return "cuatro";
                }
                case 5-> {
                    return "cinco";
                }
                case 6-> {
                    return "seis";
                }
                case 7-> {
                    return "siete";
                }
                case 8-> {
                    return "ocho";
                }
                case 9-> {
                    return "nueve";
                }
            }
        }
        // Evitamos los casos en los que los numeros no tienen nombres compuestos.
        switch (ninput) {
            case 10:
                return("Diez");

            case 11:
                return("Once");

            case 12:
                return("Doce");

            case 13:
                return("Trece");

            case 14:
                return("Catorce");

            case 15:
                return("Quince");

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
                dec = "diez";
                break;
            case "2":
                dec = "veinte";
                break;
            case "3":
                dec = "treinta";
                break;
            case "4":
                dec = "cuarenta";
                break;
            case "5":
                dec = "cincuenta";
                break;
            case "6":
                dec = "sesenta";
                break;
            case "7":
                dec = "setenta";
                break;
            case "8":
                dec = "ochenta";
                break;
            case "9":
                dec = "noventa";
                break;
        }
        if (Integer.parseInt(cifras[1]) != 0) {
            if (Integer.parseInt(cifras[0]) == 1) {
                dec = "dieci";
            } else if (Integer.parseInt(cifras[0]) == 2) {
                dec = "veinti";
            } else {
                dec = dec + " y ";
            }
            // Definimos los casos para las unidades
            switch (cifras[1]) {
                case "1":
                    un = "uno";
                    break;
                case "2":
                    un = "dos";
                    break;
                case "3":
                    un = "tres";
                    break;
                case "4":
                    un = "cuatro";
                    break;
                case "5":
                    un = "cinco";
                    break;
                case "6":
                    un = "seis";
                    break;
                case "7":
                    un = "siete";
                    break;
                case "8":
                    un = "ocho";
                    break;
                case "9":
                    un = "nueve";
                    break;
            }
        } else {
            return("El numero introducido es: " + dec);
        }

        return("El numero introducido es: " + dec + un);
    }
}