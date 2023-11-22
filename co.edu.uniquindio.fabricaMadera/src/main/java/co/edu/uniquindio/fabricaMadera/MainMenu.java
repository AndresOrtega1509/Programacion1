package co.edu.uniquindio.fabricaMadera;

import co.edu.uniquindio.fabricaMadera.model.Fabrica;
import co.edu.uniquindio.fabricaMadera.model.enumeracion.TipoProducto;
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
                    System.out.println("Ingrese un producto valido: MESA, MUEBLE, SILLA, PUERTA, ESCRITORIO, VIGA");
                    TipoProducto nombreProducto = TipoProducto.valueOf(CapturaDatosUtil.leerStringConsola("Ingresa el nombre del producto: "));
                    String idProducto = CapturaDatosUtil.leerStringConsola("Ingrese el id del producto: ");
                    double precio = CapturaDatosUtil.leerDoubleConsola("Ingrese el precio del producto: ");
                    fabrica.crearProducto(nombreProducto, idProducto, precio);
                    break;

                case 2:
                    String nombreEmpleado = CapturaDatosUtil.leerStringConsola("Ingrese el nombre del empleado: ");
                    String apellidoEmpleado = CapturaDatosUtil.leerStringConsola("Ingrese el apellido del empleado: ");
                    int edadEmpleado = CapturaDatosUtil.leerIntConsola("Ingrese la edad del empleado: ");
                    String cedulaEmpleado = CapturaDatosUtil.leerStringConsola("Ingrese la cedula del empleado: ");
                    String emailEmpleado = CapturaDatosUtil.leerStringConsola("Ingrese el correo electronico del empleado: ");
                    String cargo = CapturaDatosUtil.leerStringConsola("Ingrese el cargo del empleado: ");
                    double salario = CapturaDatosUtil.leerDoubleConsola("Ingrese el salario del empleado: ");
                    fabrica.crearEmpleado(nombreEmpleado, apellidoEmpleado, edadEmpleado, cedulaEmpleado, emailEmpleado, cargo, salario);
                    break;


                case 3:
                    idProducto = CapturaDatosUtil.leerStringConsola("Ingresa el id del producto para actualizarlo: ");
                    System.out.println("Actualice de acuerdo a los siguientes productos: MESA, MUEBLE, SILLA, PUERTA, ESCRITORIO, VIGA");
                    nombreProducto = TipoProducto.valueOf(CapturaDatosUtil.leerStringConsola("Ingresa el nuevo nombre del producto: "));
                    precio = CapturaDatosUtil.leerDoubleConsola("Ingresa el nuevo precio del producto: ");
                    fabrica.actualizarProducto(idProducto, nombreProducto, precio);
                    break;

                case 4:
                    cedulaEmpleado = CapturaDatosUtil.leerStringConsola("Ingrese la cedula del empleado para actualizar: ");
                    nombreEmpleado = CapturaDatosUtil.leerStringConsola("Ingrese el nuevo nombre del empleado: ");
                    apellidoEmpleado = CapturaDatosUtil.leerStringConsola("Ingrese el nuevo apellido del empleado: ");
                    edadEmpleado = CapturaDatosUtil.leerIntConsola("Ingrese la nueva edad del empleado: ");
                    emailEmpleado = CapturaDatosUtil.leerStringConsola("Ingrese el nuevo correo electronico del empleado: ");
                    cargo = CapturaDatosUtil.leerStringConsola("Ingrese el nuevo cargo del empleado: ");
                    salario = CapturaDatosUtil.leerDoubleConsola("Ingrese el nuevo salario del empleado: ");
                    fabrica.actualizarEmpleado(cedulaEmpleado, nombreEmpleado, apellidoEmpleado, edadEmpleado, emailEmpleado, cargo, salario);
                    break;

                case 5:
                    fabrica.mostrarProductos();
                    break;

                case 6:
                    fabrica.mostrarEmpleados();
                    break;

                case 7:
                    idProducto = CapturaDatosUtil.leerStringConsola("Ingrese el id del producto para eliminarlo: ");
                    fabrica.eliminarProducto(idProducto);
                    break;

                case 8:
                    cedulaEmpleado = CapturaDatosUtil.leerStringConsola("Ingrese la cedula del empleado para eliminar: ");
                    fabrica.eliminarEmpleado(cedulaEmpleado);
                    break;

                case 9:
                    System.out.println("El usuario ha salido del sistema.");
                    break;

            }
            if(opcion == 9) {
                break;
            }
        }
    }

    private static void mostrarMenu() {
        System.out.println("\nMenú de CRUD:");
        System.out.println("1. Crear producto");
        System.out.println("2. Crear empleado");
        System.out.println("3. Actualizar producto");
        System.out.println("4. Actualizar empleado");
        System.out.println("5. Leer producto");
        System.out.println("6. Leer empleado");
        System.out.println("7. Eliminar producto");
        System.out.println("8. Eliminar empleado");
        System.out.println("9. Salir");
        System.out.print("Selecciona una opción: ");
    }

}
