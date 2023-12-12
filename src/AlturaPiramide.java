public class AlturaPiramide {
    public static void main(String[] args) {

        System.out.println(Altura(84));
    }
    public static int Altura (int bloques){
        int raiz = 0;
        raiz = (int) Math.sqrt((double) bloques);
        boolean acabado = false;
        while (!acabado) {
            int acumulado = 0;
            for (int i = 0; i < raiz; i += 2) {
                acumulado += (int) Math.pow(i, 2);
            }
            int ultimo;
            if ((bloques < acumulado) && (bloques > (int) Math.pow(raiz, 2))) {
                ultimo = raiz;
                return raiz;
            }
        }

        return raiz;
    }
}
