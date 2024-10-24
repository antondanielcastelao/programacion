import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\n-- EJ 1 --\n");
        ej1();
        System.out.println("\n-- EJ 2 --\n");
        ej2();
        System.out.println("\n-- EJ 3 --\n");
        //ej3();
        System.out.println("\n-- EJ 4 --\n");
        //ej4();
        System.out.println("\n-- EJ 5 --\n");
        ej5();
        sc.close();
    }

    public static void ej1() {
        // Definimos la lista de numeros enteros
        int[] lista_nums = {1, -3, 5, 10, 99, -568, 11, 19, -78, 111};

        // Definimos una variable para la cantidad de numeros positivos y negativos
        int neg= 0, pos = 0;

        // Iteramos entre los elementos de la lista de numeros
        for (int i = 0; i < lista_nums.length; i++) {
            // Si el numero es mayor que 0, incrementamos el contador de nums positivos y sino el de negativos.
            if (lista_nums[i] > 0) {pos++;} else {neg++;}
        }

        // Ahora imprimimos los resultados por pantalla
        System.out.println("Hay " + pos + " numeros positivos y " + neg + " numeros negativos.");
    }

    public static void ej2() {
        // inicializamos las variables de sumatorio y producto
        int sum = 0;
        double prod = 1;

        // Mediante un bucle, vamos a hacer que se sumen todos los numeros hasta que el valor sea 90
        for(int i=10; i<=90;i++) {
            sum=sum+i;
        }

        // Mediante un bucle, vamos a hacer que se multipliquen todos los numeros hasta que el valor sea 90
        for(int i=10; i<=90;i++) {
            prod=prod*i;
        }

        // Imprimimos resultados por pantalla.
        System.out.println("El sumatorio es " + sum + " y el producto es " + prod);
    }

    public static void ej3(){
        // Inicializamos las variables de los dos lados
        double l1, l2;

        // Pedimos los datos al usuario y los metemos con scanner
        System.out.println("Introduce valor del lado 1: ");
        l1 = sc.nextDouble();
        System.out.println("Introduce valor del lado 2: ");
        l2 = sc.nextDouble();

        //Validamos los datos para ver si son menores o iguales que 0
        if (l1 <=0 || l2 <= 0) {
            System.err.println("Error, la longitud de los lados no puede ser negativa o 0");
            ej3();
        }

        // Calculo del área
        double area = l1*l2;

        // Impresion por pantalla del resultado
        System.out.println("El area del rectángulo es " + area);
    }

    public static void ej4() {
        // Solicitamos el numero y lo almacenamos
        System.out.println("Introduce un numero para tabla de multiplicar: ");
        int n = sc.nextInt();
        System.out.println("Pulsa enter para ver el siguiente, y pulsa 0 para terminar");

        // Creamos una variable de apoyo para el bucle que iterará multiplicando n * otros numeros
        int a = 1;
        // Creamos una variable para almacenar el input cada iteracion
        String teclado;
        do {
            System.out.println(n + " X " + a + " = " + n*a);
            a++;
            teclado = sc.nextLine();
        } while (!teclado.equals("0"));
    }

    public static void ej5(){
        // Creamos la lista de salarios
        double[] salarios = {999, 1400, 3000, 1300, 0};
        // Creamos la variable que almacenara los saldos en rango y la que almacenara el porcentaje de los que cobran menos de 1K
        int srango=0,mileuristas=0;

        // Iteramos entre los saldos con un bucle y vamos contando los que cumplen las condiciones para los contadores
        for (int i=0; i < salarios.length; i++){

            System.out.println(salarios[i]);
            if (salarios[i] <= 0) {
                break;
            }
            // si cumplimos con las condiciones, aumentamos el contador
            if(salarios[i]>=1000 && salarios[i]<=1750){
                srango++;
            } else if(salarios[i]<1000 && salarios[i]>0){
                mileuristas++;
            }
        }
    }
}