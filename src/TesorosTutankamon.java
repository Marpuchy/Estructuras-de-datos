import java.util.*;

import static java.lang.Integer.parseInt;

public class TesorosTutankamon {
    public static void main(String[] args) {
        System.out.println(ordenar("5\n" +
                "flecha 5 1\n" +
                "sandalias 10 2\n" +
                "sarcofago 1000 1000\n" +
                "mascara 1000 10\n" +
                "arco 10 2\n" +
                "0"));
    }
    public static String ordenar (String tesosros){
        String orden = "";
        String[] separados = tesosros.split("\n");
        LinkedHashMap<String, Integer[]> mapa = new LinkedHashMap<>();
        for (int i = 1; i < separados.length-1; i++) {
            String[] actual = separados[i].split(" ");
            Integer[] valores = {parseInt(actual[1]), parseInt(actual[2])};
            mapa.put(actual[0], valores);
        }
        while (!mapa.isEmpty()) {
            String mayoractual = "";
            int mayor = 0;
            for (int i = 0; i < mapa.size(); i++) {
                int clavemayor = 0;
                List<String> claves = new ArrayList<>();
                for (String clave : mapa.keySet()) {
                    claves.add(clave);
                }

                if (mapa.get(claves.get(i))[0] > mayor) {
                    mayor = mapa.get(claves.get(i))[0];
                    mayoractual = claves.get(i);
                    clavemayor = i;
                } else if (mapa.get(claves.get(i))[0] == mayor){
                    if (mapa.get(claves.get(i))[1] > mapa.get(mayoractual)[1]) {
                        mayoractual = claves.get(i);
                        clavemayor = i;
                    } else if (mapa.get(claves.get(i))[1] == mapa.get(mayoractual)[1]){
                        if (i < clavemayor) {
                            mayoractual = claves.get(i);
                            clavemayor = i;
                        }
                    }
                }
            }
            orden += " " + mayoractual;
            mapa.remove(mayoractual);
        }
        return orden;
    }
}
