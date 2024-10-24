public class Main {
    public static void main(String[] args) {
        System.out.println("\n-- EJ 1 --\n");
        ej1();
        System.out.println("\n-- EJ 2 --\n");
        ej2();
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


}