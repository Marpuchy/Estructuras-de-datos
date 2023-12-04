import java.util.ArrayList;

public class existe {
    public static void main(String[] args) {
        ArrayList<String> elementos = new ArrayList<String>();
        elementos.add("elemento1");
        elementos.add("elemento2");
        elementos.add("elemento3");
        elementos.add("elemento4");
        System.out.println(elementos.contains("elemento1"));
    }
}
