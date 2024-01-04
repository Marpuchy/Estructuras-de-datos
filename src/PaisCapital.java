import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PaisCapital {
    public static void main(String[] args) {
        //OK
        Map<String, String> mapa1 = new HashMap<String, String>();
        mapa1.put("España", "Madrid");
        mapa1.put("Francia", "Paris");
        mapa1.put("Italia", "Roma");
        mapa1.put("Alemania", "Berlin");

        Scanner inputvalue = new Scanner(System.in);
        System.out.println("introduce un pais");
        String pais = inputvalue.next();
        if (mapa1.containsKey(pais)) {
            System.out.println("la capital es: " + mapa1.get(pais));
        } else {
            System.out.println("no contiene " + pais);
        }
    }
}
