import java.util.Scanner;

public class ejercicios {
    public static void ejercicio1() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce numero: ");
        int n = (int)sc.nextInt();

        if (n>0) {
            System.out.println("El número " + Integer.toString(n) + " es positivo.");
        }

    }

    public static void ejercicio2() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce numero 1: ");
        short n1 = (short)sc.nextShort();
        System.out.println("Introduce numero 2: ");
        short n2 = (short)sc.nextShort();

        if (n1 >= n2) {
            System.out.println(n1-n2);
        } else {
            System.out.println(n1+n2);
        }

    }

    public static void ejercicio3() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce numero: ");
        int n = (int)sc.nextInt();

        if (n == 0) {
            System.out.println("El numero introducido es 0");
        } else {
            if (n > 0) {
                System.out.println("+");
            } else {
                System.out.println("-");
            }
        }


    }

    public static void ejercicio4(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el peso de la persona 1: ");
        double n1 = (double)sc.nextDouble();
        System.out.println("Introduce el peso de la persona 2: ");
        double n2 = (double)sc.nextDouble();

        if (n1 == n2) {
            System.out.println("Ambas personas pesan lo mismo");
        } else {
            if (n1 > n2) {
                System.out.println("La persona uno pesa mas");
                System.out.println("Su diferencia de peso es " + Double.toString(n1 - 2));
            } else {
                System.out.println("La persona dos pesa mas");
                System.out.println("Su diferencia de peso es " + Double.toString(n2 - 1));
            }
        }
    }

    public static void ejercicio5(int n1, int n2, int n3){
        if (n1 > n2 && n1 > n3){
            System.out.println(Integer.toString(n1) + ", el numero 1, es el mayor");
        }
        if (n2 > n1 && n2 > n3){
            System.out.println(Integer.toString(n2) + ", el numero 2, es el mayor");
        }
        if(n3 > n1 && n3 > n2) {
            System.out.println(Integer.toString(n3) + ", el numero 3, es el mayor");
        }
    }
}
