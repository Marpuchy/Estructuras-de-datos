public class BuscandoNivel {
    public static void main(String[] args) {
        int[] niveles = {10, 20, 40, 7, 3};
        int[] cargar = {4, 1};
        System.out.println(espacio(niveles, cargar));
    }
    public static int espacio(int[] niveles, int[] cargar) {
        int espacio = 0;
        if (cargar[0]>cargar[1]){
            for (int i = cargar[1]-1; i < cargar[0]; i++) {
                espacio -= niveles[i];
            }
        } else {
            for (int i = cargar[0]; i < cargar[1]-1; i++) {
                espacio += niveles[i];
            }
        }
        return espacio;
    }
}
