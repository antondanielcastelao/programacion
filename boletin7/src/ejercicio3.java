import java.util.Arrays;
import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] notas = {10, 7, 9, 1, 7, 3, 7, 4, 1, 10, 3, 4, 4, 1, 9, 9, 2, 4, 1, 9, 5, 6, 8, 7, 3, 4, 5, 9, 4, 1};
        String[] alumnos = {"Ana García", "Juan Martínez", "Luis López", "María Hernández", "Carlos González", "Elena Pérez", "Pedro Rodríguez", "Laura Sánchez", "Sofía Ramírez", "Miguel Torres", "Ana López", "Juan Hernández", "Luis González", "María Ramírez", "Carlos Sánchez", "Elena García", "Pedro Pérez", "Laura Torres", "Sofía Rodríguez", "Miguel Martínez", "Ana Ramírez", "Juan Torres", "Luis Sánchez", "María López", "Carlos Hernández", "Elena Martínez", "Pedro García", "Laura González", "Sofía Pérez", "Miguel Rodríguez"};

        System.out.println(buscaNota(alumnos, notas, "Carlos González")+"\n");

        listaAprobados(notas,alumnos);
        /*
        System.out.println("\nLista de notas ordenadas: ");
        int[] notasOrdenadas = notas;
        Arrays.sort(notasOrdenadas);
        for (int i=0; i<notasOrdenadas.length; i++) {
            System.out.println(notasOrdenadas[i]);
        }
        */
        ordenarNotas(notas);

        System.out.println("\nIntroduce el nombre de un alumno para ver su nota:");
        String alumnoInput = sc.nextLine();
        System.out.println(buscaNota(alumnos,notas, alumnoInput));


    }

    public static void ordenarNotas(int[] listaNotas) {
        System.out.println("\nLista de notas ordenadas");
        for (int menor=0; menor <= notaMasAlta(listaNotas);menor++){
            for (int i=0; i<listaNotas.length;i++) {
                if (listaNotas[i] == menor) {
                    System.out.println(listaNotas[i]);
                }
            }
        }
    }

    public static void listaAprobados(int[] listaNotas, String[] listaAlumnos) {
        System.out.println("Lista de alumnos aprobados:");
        for (int i=0; i< listaNotas.length; i++) {
            if (listaNotas[i]>=5) {
                System.out.println(listaAlumnos[i]);
            }
        }
    }
    public static int buscaNota(String[] listadoAlumnos, int[] listadoNotas, String alumno) {
        for (int i=0; i<listadoAlumnos.length;i++) {
            if (alumno.equals(listadoAlumnos[i])) {
                return listadoNotas[i];
            }
        }
        return -1;
    }

    public static int notaMasAlta(int[] notas) {
        int masAlta=0;
        for (int i=0;i<notas.length;i++){
            if(masAlta<notas[i]) {
                masAlta=notas[i];
            }
        }
        return masAlta;
    }
}
