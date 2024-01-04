import java.util.HashMap;
import java.util.Map;

public class Frequency {

    public static String frequency(String entrada){
        Map<String, Integer> veces = new HashMap<>();
        String[] entradas = entrada.split(" ");
        for (int i = 0; i < entradas.length; i++) {
            if (!veces.containsKey(entradas[i])){
                veces.put(entradas[i], 1);
            }else {
                int valor = veces.get(entradas[i]) + 1;
                veces.replace(entradas[i], valor);
            }
        }
        return veces.toString();

    }

    public static void main(String[] args) {
        //OK
        System.out.println(frequency("uno dos dos tres tres tres"));
    }
}
