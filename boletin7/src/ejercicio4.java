public class ejercicio4 {
    public static void main(String[] args) {
        char[] letrasNIF = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        int NIF = 39485788;
        char letraNIF = letrasNIF[NIF%23];
        System.out.println(letraNIF);
    }
}
