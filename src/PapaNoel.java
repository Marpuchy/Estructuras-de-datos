import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class PapaNoel {
    public static void main(String[] args) {
        Scanner inputvalue = new Scanner(System.in);
        ArrayList<Integer> portales= new ArrayList<>();
        leerPortales(portales);
        System.out.println(orden(portales));
    }
    public static ArrayList<Integer> leerPortales (ArrayList<Integer> portales) {
        Scanner inputvalue = new Scanner(System.in);
        String[] array = inputvalue.nextLine().split(" ");
        for (int i = 0; i < array.length; i++) {
            portales.add((parseInt(array[i])));
        }
        return portales;
    }
    public static String orden (ArrayList<Integer> portales) {
        String orden = portales.get(0) + " ";
        int actual = portales.get(0);
        portales.remove(0);
        while (!portales.isEmpty()) {
            int portalguardado = 0;
            int diferenciamin = (int) Math.pow(10, 10);
            for (Integer portal : portales) {
                if (Math.abs(actual - portal) < diferenciamin) {
                    diferenciamin = Math.abs(actual - portal);
                    portalguardado = portal;
                }
                if (Math.abs(actual - portal) == diferenciamin) {
                    if (portalguardado < portal) {
                        portalguardado = portal;
                    }
                }
            }
            orden += portalguardado +" ";
            actual = portalguardado;
            portales.remove(Integer.valueOf(portalguardado));

        }
        return orden;
    }
}
