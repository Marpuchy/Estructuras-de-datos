import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Cleopatra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] cadena = scanner.nextLine().split(" ");
        int veces = parseInt(cadena[0]);
        for (int i = 0; i < veces+1; i++) {
            cadena = scanner.nextLine().split(" ");
            int A= parseInt(cadena[0]);
            int B= parseInt(cadena[1]);
            int C= parseInt(cadena[2]);
            if (cleopatra(A, B, C) ==0){
                System.out.println("EMPATE");
            } else {
                System.out.println("\n" + cleopatra(A, B , C));
            }

        }
    }
        public static int cleopatra(int A, int B, int C){
        int ab = 0;
        int bc = 0;
        if ( B < 0){
            ab= Math.abs(A-B);
            if (C>0) {
                bc=Math.abs(C-B)-1;
            } else {
                bc=Math.abs(C+B);
            }
        } else {
            bc = Math.abs(B-C);
            if (A<0) {
                ab=Math.abs(B-A)-1;
            } else {
                ab=Math.abs(B-A);
            }
        }
        if (ab == bc){
            return 0;
        } else if (ab<bc) {
            return A;
        } else {
            return C;
        }
    }
}
