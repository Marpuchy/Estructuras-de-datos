import static java.lang.Integer.parseInt;

public class Jeroglificos {
    public static void main(String[] args) {
        System.out.println(traducir(11));
        System.out.println(traducir(200));
        System.out.println(traducir(1922));
        System.out.println(traducir(0));
    }
    public static String traducir(int num){
        String traducir = "";
        String numero = num + "";
        int contador = 0;
        for (int i = numero.length()-1; i >= 0; i--) {
            contador++;
            for (int j = 0; j < parseInt(numero.charAt(i)+""); j++) {
                if (contador == 1) {
                    traducir += "T";
                } else if (contador == 2) {
                    traducir += "G";
                } else if (contador == 3) {
                    traducir += "C";
                } else if (contador == 4) {
                    traducir += "F";
                } else if (contador == 5) {
                    traducir += "D";
                } else if (contador == 6) {
                    traducir += "R";
                } else if (contador == 7) {
                    traducir += "H";
                }
            }
        }
        String traducida = "";
        for (int i = traducir.length()-1; i >= 0; i--) {
            traducida += traducir.charAt(i);
        }
        return traducida;
    }
}
