public class ejercicio2 {
    public static void main(String[] args) {
        int[] notas = {10, 7, 9, 1, 7, 3, 7, 4, 1, 10, 3, 4, 4, 1, 9, 9, 2, 4, 1, 9, 5, 6, 8, 7, 3, 4, 5, 9, 4, 1};

        int personasAprobadas = aprobadoSuspenso(notas, true);
        int personasSuspensas = aprobadoSuspenso(notas, false);
        System.out.println("Han aprobado " + personasAprobadas + " y han suspendido " + personasSuspensas);

        double media = notaMedia(notas);
        System.out.println("La nota media de la clase ha sido de " + media);

        System.out.println("La nota más alta es " + notaMasAlta(notas));
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
    public static double notaMedia(int[] notas) {
        int notaTotal = 0;
        for (int i=0; i<notas.length;i++) {
            notaTotal = notaTotal+ notas[i];
        }
        return (double) notaTotal/notas.length;
    }
    public static int aprobadoSuspenso(int[] notas, boolean aprobado) {
        int total=0;
        for (int i=0; i< notas.length; i++) {
            if (aprobado) {
                if (notas[i] >= 5) {total++;}
            }
            else {
                if (notas[i] < 5) {total++;}
            }
        }
        return  total;
    }
}
