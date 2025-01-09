public class ej4 {
    public static void main(String[] args) {
        int enteroLongo = 1200430;
        System.out.println(separarMiles(enteroLongo));
    }
    public static String separarMiles(int entero) {
        String[] numero = Integer.toString(entero).split("");
        String resultado = "";
        for (int i = numero.length-1; i>=0; i-=3) {

            if(i !=0) {
                resultado += numero[i];
                resultado += numero[i - 1];
                resultado += numero[i - 2];
                resultado += ".";
            } else if (i <= 2) {
                switch (i){
                    case 0:
                        resultado+=numero[i];
                        break;
                    case 1:
                        resultado+=numero[i] + numero[i-1];
                        break;
                    case 2:
                        resultado+=numero[i] + numero[i-1] + numero[i-2];

                }
                break;
            }
        }
        String resultado2="";

        for (int i = resultado.length()-1; i >=0; i--) {
            resultado2+=resultado.split("")[i];
        }

        return resultado2;
    }
}
