import java.util.ArrayList;
import java.util.Arrays;

public class ConvertirEnArray {
    public static void main(String[] args) {
        ArrayList<String> cadena = new ArrayList<String>();
        cadena.add("elemento1");
        cadena.add("elemento2");
        cadena.add("elemento3");
        cadena.add("elemento4");
        String[] array = new String[cadena.size()];
        for (int i = 0; i < cadena.size(); i++) {
            array[i] = cadena.get(i);
        }
        System.out.println(Arrays.toString(array));
    }
}
