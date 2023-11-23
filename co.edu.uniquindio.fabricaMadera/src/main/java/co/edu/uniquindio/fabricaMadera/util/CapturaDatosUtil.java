package co.edu.uniquindio.fabricaMadera.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CapturaDatosUtil {

    public static String leerStringConsola(String mensaje) {
        System.out.println(mensaje);
        Scanner scanner = new Scanner(System.in);
        String dato = scanner.nextLine();
        return dato;
    }

    public static int leerIntConsola(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        int resultado = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            System.out.println(mensaje);
            try {
                String dato = scanner.nextLine();
                resultado = Integer.parseInt(dato);
                entradaValida = true; // Si llegamos aquí, la entrada es válida
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese un número entero válido.");
            }
        }

        return resultado;
    }

    public static double leerDoubleConsola(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        double resultado = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            System.out.println(mensaje);
            try {
                String dato = scanner.nextLine();
                resultado = Double.parseDouble(dato);
                entradaValida = true;
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese un número double válido.");
            }
        }

        return resultado;
    }

    public static Date leerFechaConsola(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

        while (true) {
            System.out.println(mensaje);
            try {
                System.out.print("Ingrese el año: ");
                int year = Integer.parseInt(scanner.nextLine());

                System.out.print("Ingrese el mes (1-12): ");
                int month = Integer.parseInt(scanner.nextLine());

                System.out.print("Ingrese el día: ");
                int day = Integer.parseInt(scanner.nextLine());

                System.out.print("Ingrese la hora (0-23): ");
                int hour = Integer.parseInt(scanner.nextLine());

                System.out.print("Ingrese los minutos: ");
                int minute = Integer.parseInt(scanner.nextLine());

                System.out.print("Ingrese los segundos: ");
                int second = Integer.parseInt(scanner.nextLine());

                String fechaStr = String.format("%04d/%02d/%02d %02d:%02d:%02d", year, month, day, hour, minute, second);
                Date fecha = dateFormat.parse(fechaStr);
                return fecha;
            } catch (NumberFormatException | ParseException e) {
                System.out.println("Error al convertir la fecha. Asegúrese de ingresar valores válidos.");
            }
        }
    }
}
