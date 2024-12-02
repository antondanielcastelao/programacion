import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // la primera dimension indica el dia de la semana, y el segundo la hora
        int[][] horario = new int[5][7];
        System.out.println("Hello world!");
        // horario del lunes
        horario[0][0] = 0;
        horario[0][1] = 0;
        horario[0][2] = 0;
        horario[0][3] = 0;
        horario[0][4] = 1;
        horario[0][5] = 1;
        horario[0][6] = 1;
        // horario del martes
        horario[1][0] = 0;
        horario[1][1] = 0;
        horario[1][2] = 0;
        horario[1][3] = 2;
        horario[1][4] = 2;
        horario[1][5] = 3;
        horario[1][6] = 6;
        // horario del mercores
        horario[2][0] = 1;
        horario[2][1] = 1;
        horario[2][2] = 1;
        horario[2][3] = 5;
        horario[2][4] = 5;
        horario[2][5] = 4;
        horario[2][6] = 4;
        // horario del jueves
        horario[3][0] = 7;
        horario[3][1] = 7;
        horario[3][2] = 2;
        horario[3][3] = 2;
        horario[3][4] = 1;
        horario[3][5] = 1;
        horario[3][6] = 1;
        // horario del viernes
        horario[4][0] = 4;
        horario[4][1] = 5;
        horario[4][2] = 5;
        horario[4][3] = 2;
        horario[4][4] = 2;
        horario[4][5] = 6;
        horario[4][6] = 6;

        System.out.println("De que dia quieres ver el horario (primera con mayus)");
        int eleccDia = dias(sc.nextLine())-1;
        System.out.println(eleccDia);

        System.out.println("Dime la hora (1, 2 ,3...)");
        int eleccHora = sc.nextInt()-1;

        System.out.println(materia(horario[eleccDia][eleccHora]));
    }
    public static int dias(String dia) {
        switch (dia) {
            case "Lunes":
                return 1;
            case "Martes":
                return 2;
            case "Miércoles":
                return 3;
            case "Jueves":
                return 4;
            case "Viernes":
                return 5;
            default:
                // Devuelve -1 para indicar que no es un día con clases
                return -1;
        }
    }
    public static String materia(int codMateria) {
        switch (codMateria){
            default:
                return "No hay clase";
            case 0:
                return "Bases de datos";
            case 1:
                return "Programacion";
            case 2:
                return "Sistemas";
            case 3:
                return "Sostenibilidad";
            case 4:
                return "Contornos";
            case 5:
                return "Lenguaje de marcas";
            case 6:
                return "IPE";
            case 7:
                return "Ingles";
        }
    }
}