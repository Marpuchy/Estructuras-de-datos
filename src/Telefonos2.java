import java.util.*;

public class Telefonos2 {
    public static void main(String[] args) {
        Map<String, List<Integer>> mapa1 = new HashMap<String, List<Integer>>();
        mapa1.put("Luis", Arrays.asList(1, 1, 1, 1)) ;
        mapa1.put("Emma", Arrays.asList(2, 2, 2, 2));
        mapa1.put("Paula", Arrays.asList(3, 3, 3, 3));
        mapa1.put("Nico", Arrays.asList(4, 4, 4, 4));

        Scanner inputvalue = new Scanner(System.in);
        System.out.println("introduce un nombre");
        String persona = inputvalue.next();
        if (mapa1.containsKey(persona)) {
            System.out.println("sus números son: " + mapa1.get(persona));
        } else {
            System.out.println("no contiene " + persona);
        }
    }
}
