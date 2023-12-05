import java.util.HashMap;
import java.util.Map;

public class Padel {
    public static void main(String[] args) {
        Map<String, String> mapa1 = new HashMap<String, String>();
        mapa1.put("rojo", "red");
        mapa1.put("verde", "green");
        mapa1.put("azul", "blue");
        mapa1.put("blanco", "white");
        System.out.println(mapa1.keySet());
        for (String valor : mapa1.values())
            System.out.print(valor + "-");
    }


}
