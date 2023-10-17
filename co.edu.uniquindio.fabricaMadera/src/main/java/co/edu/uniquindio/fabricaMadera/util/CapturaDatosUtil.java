package co.edu.uniquindio.fabricaMadera.util;

import java.util.Scanner;

public class CapturaDatosUtil {

    public static String leerStringConsola(String mensaje) {
        System.out.println(mensaje);
        Scanner scanner = new Scanner(System.in);
        String dato = scanner.nextLine();
        return dato;
    }

    public static int leerIntConsola(String mensaje) {
        System.out.println(mensaje);
        Scanner scanner = new Scanner(System.in);
        String dato = scanner.nextLine();
        return Integer.parseInt(dato);
    }

    public static double leerDoubleConsola(String mensaje) {
        System.out.println(mensaje);
        Scanner scanner = new Scanner(System.in);
        String dato = scanner.nextLine();
        return Double.parseDouble(dato);
    }
}
