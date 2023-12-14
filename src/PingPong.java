import java.util.HashMap;
import java.util.Map;

public class PingPong {
    public static void main(String[] args) {
        System.out.println(partido("PIC POC PONG! PONG! PIC PIC PIC POC PONG!"));
    }
    public static String partido(String botes){
        String[] bolazos = botes.split(" ");
        Map<Integer, Integer> jugadores = new HashMap<>();
        jugadores.put(1, 0);
        jugadores.put(2, 0);
        int jugadoractual = 1;
        for (int i = 0; i < bolazos.length; i++) {
            if (bolazos[i].equals("PIC")) {
                jugadoractual = cambiarjugador(jugadoractual);
            } else if (bolazos[i].equals("PONG!")) {
                jugadores.replace(jugadoractual, jugadores.get(jugadoractual)+1);
                jugadoractual = 1;
            }
        }
        String resultado = jugadores.get(1) + " " + jugadores.get(2);
        return resultado;
    }
    public static int cambiarjugador (int jugadoractual) {
        if (jugadoractual == 1) {
            return jugadoractual=2;
        } else {
            return jugadoractual=1;
        }
    }

}
