import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AList {
    public static void main(String[] args) {
        List<String> coches = new ArrayList<String>();
        coches.add("Volvo");
        coches.add("Seat");
        coches.add("Fiat");

        Collections.sort(coches);
        System.out.println(coches);

        coches.set(1, "Ford");

        System.out.println(coches);

        System.out.println(coches.contains("Ford"));
    }
}

