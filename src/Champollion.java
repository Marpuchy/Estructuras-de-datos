import java.util.HashMap;
import java.util.Map;

public class Champollion {
    public static void main(String[] args) {
        System.out.println(silabas("Ramses amaba a Nefertari\n"));
    }
    public static int silabas (String frase) {
        String silabactual = "";
        frase += "    ";
        String vocales = "AEIOUaeiouÁÉÍÓÚÀÈÌÒÙ";
        Map<String, Integer> mapa = new HashMap<>();
        for (int i = 0; i < frase.length()-4; i++) {
            if (frase.charAt(i) == ' ') {
                i++;
                existe(mapa, silabactual);
                silabactual="";
            }
            if ((silabactual != "") && (!vocales.contains(frase.charAt(i)+"") &&(vocales.contains(frase.charAt(i+1)+"")))){
                existe(mapa, silabactual);
                silabactual = "";
                i--;
            }else if (!vocales.contains(frase.charAt(i) +"")){
                if (vocales.contains(frase.charAt(i+1)+"")){
                    silabactual += frase.charAt(i) + "" + frase.charAt(i+1) + "";
                    i++;
                }else if ((silabactual != "") && (!vocales.contains(frase.charAt(i+1)+""))){
                    silabactual += frase.charAt(i);
                    existe(mapa, silabactual);
                    silabactual = "";
                } else {
                    existe(mapa, silabactual);
                    silabactual = "";
                }
            } else if(silabactual == "") {
                silabactual += frase.charAt(i);
                if (!vocales.contains(frase.charAt(i+1) +"") && (vocales.contains(frase.charAt(i+2) +"")) {
                    existe(mapa, silabactual);
                    silabactual = "";
                } else {
                    silabactual += frase.charAt(i+1);
                }
                existe(mapa, silabactual);
                silabactual = "";
            }
        }
        return mapa.size()-1;
    }
    public static Map<String, Integer> existe (Map<String, Integer> mapa, String silaba){
        int valor;
        if (mapa.containsKey(silaba)){
            valor = mapa.get(silaba)+1;
            mapa.replace(silaba, valor);
        } else {
            mapa.put(silaba, 0);
        }
        return mapa;
    }
}
