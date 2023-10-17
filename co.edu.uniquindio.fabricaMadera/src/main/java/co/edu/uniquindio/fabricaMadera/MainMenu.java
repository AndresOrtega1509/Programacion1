package co.edu.uniquindio.fabricaMadera;

import co.edu.uniquindio.fabricaMadera.model.Fabrica;
import co.edu.uniquindio.fabricaMadera.util.CapturaDatosUtil;

import java.util.Scanner;

public class MainMenu {

    public static void main(String[] args) {

        Fabrica fabrica = new Fabrica();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            mostrarMenu();
            int opcion = CapturaDatosUtil.leerIntConsola("");

            switch (opcion) {
                case 1:
                    String nombre = CapturaDatosUtil.leerStringConsola("Ingresa el nombre del producto: ");
                    String idProducto = CapturaDatosUtil.leerStringConsola("Ingrese el id del producto: ");
                    double precio = CapturaDatosUtil.leerDoubleConsola("Ingrese el precio del producto: ");
                    fabrica.crearProducto(nombre, idProducto, precio);

                    break;

                case 2:
                    idProducto = CapturaDatosUtil.leerStringConsola("Ingresa el id del producto para actualizarlo: ");
                    nombre = CapturaDatosUtil.leerStringConsola("Ingresa el nuevo nombre del producto: ");
                    precio = CapturaDatosUtil.leerDoubleConsola("Ingresa el nuevo precio del producto: ");
                    fabrica.actualizarProducto(idProducto, nombre, precio);

                    break;

                case 3:
                    fabrica.mostrarProductos();
                    break;

                case 4:
                    idProducto = CapturaDatosUtil.leerStringConsola("Ingrese el id del producto para eliminarlo: ");
                    fabrica.eliminarProducto(idProducto);
                    break;

                case 5:
                    System.out.println("El usuario ha salido del sistema.");
                    break;

            }
            if(opcion == 5) {
                break;
            }
        }
    }

    private static void mostrarMenu() {
        System.out.println("\nMenú de CRUD:");
        System.out.println("1. Crear producto");
        System.out.println("2. Actualizar producto");
        System.out.println("3. Leer producto");
        System.out.println("4. Eliminar producto");
        System.out.println("5. Salir");
        System.out.print("Selecciona una opción: ");
    }

}
