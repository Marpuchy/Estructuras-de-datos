import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class CountCountries {


    public static void cuantosPaises(String line, Map<String,Integer> paises){
        String[] actual = line.split(",");
        String pais = actual[6];

        if (paises.containsKey(pais)){
            int numero = paises.get(pais) + 1;
            paises.replace(pais, numero);
        }else {
            paises.put(pais, 1);
        }
    }


    public static void main(String[] args) throws IOException {
        //OK
        String filepath = new File("").getAbsolutePath();
        BufferedReader reader = new BufferedReader(new FileReader(filepath.concat("/src/Colfuturo-Seleccionados.csv")));
        String line;
        Map<String, Integer> paises = new HashMap<>();
        while ((line = reader.readLine()) != null) {
            cuantosPaises(line, paises);
        }
        reader.close();
        System.out.println(paises);

    }
}
