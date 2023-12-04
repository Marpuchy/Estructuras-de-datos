import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Telefonos {
    public static void main(String[] args) {
        Map<String, Integer> mapa1 = new HashMap<String, Integer>();
        mapa1.put("Luis", 100000000);
        mapa1.put("Emma", 100000001);
        mapa1.put("Paula", 100000002);
        mapa1.put("Nico", 100000003);

        Scanner inputvalue = new Scanner(System.in);
        System.out.println("introduce un nombre");
        String persona = inputvalue.next();
        if (mapa1.containsKey(persona)) {
            System.out.println("su número es: " + mapa1.get(persona));
        } else {
            System.out.println("no contiene " + persona);
        }
    }
}
