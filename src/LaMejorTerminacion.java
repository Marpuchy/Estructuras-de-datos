import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class LaMejorTerminacion {
    public static void main(String[] args) {
        Scanner inputvalue = new Scanner(System.in);
        String[] numeros = inputvalue.nextLine().split(" ");
        Map<String, Integer> mapa1 = new HashMap<String, Integer>();
        for (String numero: numeros) {
            String numerofinal = numero.charAt(numero.length() - 1) + "";
            if (!mapa1.containsKey(numerofinal)) {
                mapa1.put(numerofinal, 1);
            } else {
                int valor = mapa1.get(numerofinal) +1;
                mapa1.remove(numerofinal);
                mapa1.put(numerofinal, valor);
            }
        }
        System.out.println(mapa1);
    }
}
