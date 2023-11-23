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

    public static Date leerFechaConsola(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

        while (true) {
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
