import java.io.*;
import java.util.*;

public class Anagramas {


    public static String alfabetizada(String line){
        String[] caracteres = new String[line.length()];
        for (int i = 0; i < line.length(); i++) {
            caracteres[i] = line.charAt(i) + "";
        }
        Arrays.sort(caracteres);
        String alfabetizada = "";
        for (int i = 0; i < caracteres.length; i++) {
            alfabetizada += caracteres[i];
        }
        return alfabetizada;
    }

   public static Map<String, String> anagrama(String alfabetizada, String line, Map<String, String> palabras){
        if (palabras.containsKey(alfabetizada)){
            String actual = palabras.get(alfabetizada) + " " + line;
            palabras.replace(alfabetizada, actual);
        }else {
            palabras.put(alfabetizada, line);
        }
        return palabras;
    }


    public static void main(String[] args) throws IOException {
        //OK
        String filepath = new File("").getAbsolutePath();
        BufferedReader reader = new BufferedReader(new FileReader(filepath.concat("/src/spanish-dict.txt")));
        String line;
        Map<String, String> palabras = new HashMap<>();
        while ((line = reader.readLine())!=null) {
            palabras = anagrama(alfabetizada(line), line, palabras);
        }
        for (String palabra : palabras.keySet()) {
            String[] actual = palabras.get(palabra).split(" ");
            if (actual.length > 2){
                System.out.println(palabra + "= " + palabras.get(palabra));;
            }
        }
        reader.close();

    }
}
