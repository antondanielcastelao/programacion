import java.util.ArrayList;
import java.util.Scanner;
import java.math.*;

public class Main {
    static public Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        System.out.println("\n--- Ejercicio 1 ---\n");
        //ejercicio1();
        System.out.println("\n--- Ejercicio 2 ---\n");
        //ejercicio2();
        System.out.println("\n--- Ejercicio 3 ---\n");
        //ejercicio3();
        System.out.println("\n--- Ejercicio 4 ---\n");
        ejercicio4();
    }

    public static void ejercicio1() {

        // Creamos una lista con los productos y otra con sus ventas
        String[] productos = {"leche", "pizza", "galletas", "manzanas"};
        int[] ventas = {345, 123, 556, 1001};
        // Iteramos entre los productos y mediante un condicional los clasificamos por sus ventas
        for (int i=0; i<productos.length;i++ ){
            int venta = ventas[i]; String producto = productos[i];
            if (ventas[i] <= 100) {
                System.out.println("El articulo "+producto + " es de bajo consumo.");
            } else if (venta > 100 && venta<= 500) {
                System.out.println("El articulo "+producto + " es de medio consumo.");
            } else if (venta >500 && venta <=1000) {
                System.out.println("El articulo "+producto + " es de alto consumo.");
            } else if (venta > 1000) {
                System.out.println("El articulo "+producto + " es de primera necesidad.");
            }
        }
    }

    public static void ejercicio2() {
        // menu
        System.out.println(" --- Cálculo de áreas --- ");
        System.out.println("1. Cuadrado");
        System.out.println("2. Triángulo");
        System.out.println("3. Círculo");
        System.out.println("Selecciona una de las opciones:");
        // pedimos al usuario el numero y lo escaneamos
        //Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();
        // definimos las posibilidades del usuario y calculamos pidiendo los datos necesarios
        switch (opcion) {
            default:
                System.err.println("Porfavor, indica una opcion valida.");
                ejercicio2();
                break;
            case 1:
                System.out.println("Área del cuadrado, por favor introduce el lado");
                System.out.println("El área del cuadrado es " + Double.toString(acuadrado(sc.nextDouble())) + " cm.");
                break;
            case 2:
                System.out.println("Área del triángulo, por favor introduce la base");
                double b = sc.nextDouble();
                System.out.println("Por favor, introduce la altura");
                double a = sc.nextDouble();
                System.out.println("La altura del triángulo es " + Double.toString(atriangulo(a, b)) + " cm.");
                break;
            case 3:
                System.out.println("Área del círculo, por favor introduce el radio");
                System.out.println("El área del círculo es " + Double.toString(aciruclo(sc.nextDouble())) + " cm.");
                break;
        }
    }

    public static void ejercicio3(){
        System.out.println("Introduce el numero para calcular el valor absoluto");
        double n = sc.nextDouble();
        // Si n es mayor que 0, dejarlo tal cual, si es menor (n negativo) ponemos el operador - para hacerlo positivo
        double absoluto = (n > 0)? (n = n) : (n = -n);
        System.out.println("El valor absoluto es " + Double.toString(absoluto));
    }

    public static void ejercicio4() {
        System.out.println("Introduce un numero para traducir a texto:");
        int ninput = sc.nextInt();
        if (ninput < 1 || ninput > 99) {
            // Verificamos que el numero este entre 1 y 99
            System.err.println("ERROR, el numero no está entre 1 y 99");
            ejercicio4();
        }
        if (ninput < 10) {
            switch (ninput){
                case 1-> {
                    System.out.println("uno");
                }
                case 2-> {
                    System.out.println("dos");
                }
                case 3-> {
                    System.out.println("tres");
                }
                case 4-> {
                    System.out.println("cuatro");
                }
                case 5-> {
                    System.out.println("cinco");
                }
                case 6-> {
                    System.out.println("seis");
                }
                case 7-> {
                    System.out.println("siete");
                }
                case 8-> {
                    System.out.println("ocho");
                }
                case 9-> {
                    System.out.println("nueve");
                }
            }

        } else{
        // Evitamos los casos en los que los numeros no tienen nombres compuestos.
        switch (ninput) {
            case 10:
                System.out.println("Diez");
                break;
            case 11:
                System.out.println("Once");
                break;
            case 12:
                System.out.println("Doce");
                break;
            case 13:
                System.out.println("Trece");
                break;
            case 14:
                System.out.println("Catorce");
                break;
            case 15:
                System.out.println("Quince");
                break;
            default:
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
                    System.out.println("El numero introducido es: " + dec);
                }
                System.out.println("El numero introducido es: " + dec + un);
        }
        }
    }

    public static void ejercicio5(){
        System.out.println("--- Ejercicio 5 ---");
    }
    public static double acuadrado(double lado) {
        return lado*lado;
    }
    public static double atriangulo(double altura, double base) {
        return (base*altura)/2;
    }
    public static double aciruclo(double radio) {
        return   Math.PI*Math.pow(radio, 2);
    }

}