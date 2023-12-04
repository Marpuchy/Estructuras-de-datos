import java.util.ArrayList;

public class AddAll {
    public static void main(String[] args) {
        ArrayList<Integer> añadida = new ArrayList<>();
        ArrayList<Integer> añadir = new ArrayList<>();
        añadida.add(1);
        añadida.add(2);
        añadida.add(3);
        añadida.add(4);
        añadir.add(5);
        añadir.add(6);
        añadir.add(7);
        añadida.addAll(añadir);
        System.out.println(añadida);
    }
}
