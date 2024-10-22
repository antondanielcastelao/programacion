public class boletin1 {
    public static void main(String[] args) {
        // Declaramos las variables que corresponden al resultado de cada apartado
        int apartadoA, apartadoB, apartadoC, apartadoD, apartadoE, apartadoF, apartadoG, apartadoH;
        // Asignamos como valor la ecuación correspondiente a cada apartado
        apartadoA = ((3 + 2) % 2 - 15) / 2 * 5;
        apartadoB = (6 + (6) / 7) + 35 / 2 - 8 * 5 / 4 * 2;
        apartadoC = 84 % 3 + 3;
        apartadoD = 8 + 7 * 3 + 4 * 6 /2 % 4;
        apartadoE = 27 % 4 +15 / 4;
        apartadoF = 37 / 42 - 2;
        apartadoG = 9 * 2 / 3 * 25 * 3;
        apartadoH = (7 * 3 - 4 * 4) * 2 / 4 * 2;
        // Imprimimos el resultado de cada apartado (es necesario convertir los valores de INT a STRING para concatenar)
        System.out.println("Resultado del apartado A: " + Integer.toString(apartadoA));
        System.out.println("Resultado del apartado B: " + Integer.toString(apartadoB));
        System.out.println("Resultado del apartado C: " + Integer.toString(apartadoC));
        System.out.println("Resultado del apartado D: " + Integer.toString(apartadoD));
        System.out.println("Resultado del apartado E: " + Integer.toString(apartadoE));
        System.out.println("Resultado del apartado F: " + Integer.toString(apartadoF));
        System.out.println("Resultado del apartado G: " + Integer.toString(apartadoG));
        System.out.println("Resultado del apartado H: " + Integer.toString(apartadoH));
    	

	boolean c = (true && true) || false == true;
	System.out.println(c);
    }
}


