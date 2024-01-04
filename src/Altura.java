import java.util.ArrayList;
import java.util.Scanner;

public class Altura {
    public static void main(String[] args) {
        //OK
    ArrayList<Double> alumnos = new ArrayList<Double>();
    leerAlturas(alumnos, numeroAlumnos());
    mostrarResultados(alumnos , calcularMedia(alumnos));
    }
    public static Integer numeroAlumnos () {
        Scanner inputvalue = new Scanner(System.in);
        System.out.println("numalumnos");
        return inputvalue.nextInt();
    }
    public static ArrayList<Double> leerAlturas (ArrayList<Double> alumnos, int numalumnos) {
        Scanner inputvalue = new Scanner(System.in);
        System.out.println("alturas");
        for (int i = 0; i < numalumnos; i++) {
            alumnos.add(inputvalue.nextDouble());
        }
        return alumnos;
    }
    public static double calcularMedia (ArrayList<Double> alumnos) {
        double media = 0;
        for (Double alumno : alumnos) {
            media += alumno;
        }
        return media/alumnos.size();
    }
    public static int calcularAlumnosAlturaSuperior (ArrayList<Double> alumnos, double media) {
        int superior = 0;
        for (Double alumno: alumnos) {
            if (alumno > media) {
                superior++;
            }
        }
        return superior;
    }
    public static int calcularAlumnosAlturaInferior (ArrayList<Double> alumnos, double media) {
        int inferior = 0;
        for (Double alumno: alumnos) {
            if (alumno < media) {
                inferior++;
            }
        }
        return inferior;
    }
    public static void mostrarResultados (ArrayList<Double> alumnos, double media) {
        for (Double alumno: alumnos) {
            System.out.print(alumno + " ");
        }
        System.out.print("\n" + calcularAlumnosAlturaSuperior(alumnos, media));
        System.out.print("\n" + calcularAlumnosAlturaInferior(alumnos, media));

    }
}
