package co.edu.uniquindio.fabricaMadera;

import co.edu.uniquindio.fabricaMadera.model.Fabrica;
import co.edu.uniquindio.fabricaMadera.enumeracion.TipoProducto;
import co.edu.uniquindio.fabricaMadera.util.CapturaDatosUtil;

import java.util.Date;
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
                    System.out.println("Ingrese un producto valido: MESA, MUEBLE, SILLA, PUERTA, ESCRITORIO, VIGA");
                    TipoProducto tipoProducto = TipoProducto.valueOf(CapturaDatosUtil.leerStringConsola("Ingrese el nombre del empleado: "));
                    int cantidad = CapturaDatosUtil.leerIntConsola("Ingrese la cantidad del producto: ");
                    String ubicacion = CapturaDatosUtil.leerStringConsola("Ingrese la ubicación del producto: ");
                    String responsable = CapturaDatosUtil.leerStringConsola("Ingrese el responsable del area: ");
                    String codigoReferencia = CapturaDatosUtil.leerStringConsola("Ingerese el codigo de referencia del inventario: ");
                    fabrica.crearInventario(tipoProducto, cantidad, ubicacion, responsable, codigoReferencia);
                    break;

                case 4:
                    String cedula = CapturaDatosUtil.leerStringConsola("Ingrese la cedula del empleado para asociar turno: ");
                    Date horaEntrada = CapturaDatosUtil.leerFechaConsola("Ingrese la fecha de entrada del empleado: ");
                    Date horaSalida = CapturaDatosUtil.leerFechaConsola("Ingrese la fecha de salida del empleado: ");
                    double valorHoraExtra = CapturaDatosUtil.leerDoubleConsola("Ingrese el valor de la hora extra");
                    String codigo = CapturaDatosUtil.leerStringConsola("Ingrese el codigo del turno: ");
                    fabrica.crearTurno(cedula, horaEntrada, horaSalida, valorHoraExtra, codigo);
                    break;

                case 5:
                    idProducto = CapturaDatosUtil.leerStringConsola("Ingresa el id del producto para actualizarlo: ");
                    System.out.println("Actualice de acuerdo a los siguientes productos: MESA, MUEBLE, SILLA, PUERTA, ESCRITORIO, VIGA");
                    nombreProducto = TipoProducto.valueOf(CapturaDatosUtil.leerStringConsola("Ingresa el nuevo nombre del producto: "));
                    precio = CapturaDatosUtil.leerDoubleConsola("Ingresa el nuevo precio del producto: ");
                    fabrica.actualizarProducto(idProducto, nombreProducto, precio);
                    break;

                case 6:
                    cedulaEmpleado = CapturaDatosUtil.leerStringConsola("Ingrese la cedula del empleado para actualizar: ");
                    nombreEmpleado = CapturaDatosUtil.leerStringConsola("Ingrese el nuevo nombre del empleado: ");
                    apellidoEmpleado = CapturaDatosUtil.leerStringConsola("Ingrese el nuevo apellido del empleado: ");
                    edadEmpleado = CapturaDatosUtil.leerIntConsola("Ingrese la nueva edad del empleado: ");
                    emailEmpleado = CapturaDatosUtil.leerStringConsola("Ingrese el nuevo correo electronico del empleado: ");
                    cargo = CapturaDatosUtil.leerStringConsola("Ingrese el nuevo cargo del empleado: ");
                    salario = CapturaDatosUtil.leerDoubleConsola("Ingrese el nuevo salario del empleado: ");
                    fabrica.actualizarEmpleado(cedulaEmpleado, nombreEmpleado, apellidoEmpleado, edadEmpleado, emailEmpleado, cargo, salario);
                    break;

                case 7:
                    codigoReferencia = CapturaDatosUtil.leerStringConsola("Ingerese el codigo de referencia del inventario para actualizar: ");
                    System.out.println("Actualice de acuerdo a los siguientes productos: MESA, MUEBLE, SILLA, PUERTA, ESCRITORIO, VIGA");
                    tipoProducto = TipoProducto.valueOf(CapturaDatosUtil.leerStringConsola("Ingrese el nuevo nombre del empleado: "));
                    cantidad = CapturaDatosUtil.leerIntConsola("Ingrese la nueva cantidad del producto: ");
                    ubicacion = CapturaDatosUtil.leerStringConsola("Ingrese la nueva ubicación del producto: ");
                    responsable = CapturaDatosUtil.leerStringConsola("Ingrese el nuevo responsable del area: ");
                    fabrica.actualizarInventario(codigoReferencia, tipoProducto, cantidad, ubicacion, responsable);
                    break;

                case 8:
                    codigo = CapturaDatosUtil.leerStringConsola("Ingrese el codigo del turno para poder actualizar: ");
                    horaEntrada = CapturaDatosUtil.leerFechaConsola("Ingrese la nueva fecha de entrada del turno: ");
                    horaSalida = CapturaDatosUtil.leerFechaConsola("Ingrese la nueva fecha de salida del turno: ");
                    valorHoraExtra = CapturaDatosUtil.leerDoubleConsola("Ingrese el nuevo valor de la hora extra: ");
                    fabrica.actualizarTurno(codigo, horaEntrada, horaSalida, valorHoraExtra);
                    break;

                case 9:
                    fabrica.mostrarProductos();
                    break;

                case 10:
                    fabrica.mostrarEmpleados();
                    break;

                case 11:
                    fabrica.mostrarInventario();
                    break;

                case 12:
                    fabrica.mostrarTurno();
                    break;

                case 13:
                    idProducto = CapturaDatosUtil.leerStringConsola("Ingrese el id del producto para eliminarlo: ");
                    fabrica.eliminarProducto(idProducto);
                    break;

                case 14:
                    cedulaEmpleado = CapturaDatosUtil.leerStringConsola("Ingrese la cedula del empleado para eliminar: ");
                    fabrica.eliminarEmpleado(cedulaEmpleado);
                    break;

                case 15:
                    codigoReferencia = CapturaDatosUtil.leerStringConsola("Ingrese el codigo de referencia del inventario para eliminar: ");
                    fabrica.eliminarInventario(codigoReferencia);
                    break;

                case 16:
                    cantidad = CapturaDatosUtil.leerIntConsola("Ingrese la cantidad del producto del inventario para eliminarlo: ");
                    fabrica.eliminarInventario(cantidad);
                    break;
                case 17:
                    codigo = CapturaDatosUtil.leerStringConsola("Ingrese el codigo del turno para eliminarlo: ");
                    fabrica.eliminarTurno(codigo);
                    break;

                case 18:
                    idProducto = CapturaDatosUtil.leerStringConsola("Ingrese el id del producto para consultar su información: ");
                    fabrica.consultarProducto(idProducto);
                    break;
                case 19:
                    cedulaEmpleado = CapturaDatosUtil.leerStringConsola("Ingrese la cedula del empleado para consultar su información: ");
                    fabrica.consultarEmpleado(cedulaEmpleado);
                    break;
                case 20:
                    codigoReferencia = CapturaDatosUtil.leerStringConsola("Ingrese el codigo de referencia del inventario para consultar su información");
                    fabrica.consultarInventario(codigoReferencia);
                    break;
                case 21:
                    codigo = CapturaDatosUtil.leerStringConsola("Ingrese el codigo del turno para consultar su información: ");
                    fabrica.consultarTurno(codigo);
                    break;

                case 22:
                    fabrica.calcularValorHorasExtraPrimerEmpleado();
                    break;

                case 23:
                    fabrica.obtenerPromedioEdad();
                    break;

                case 24:
                    fabrica.obtenerSalarioMayor();
                    break;

                case 25:
                    fabrica.obtenerSalarioMenor();
                    break;

                case 26:
                    fabrica.obtenerProductoMenorPrecio();
                    break;

                case 27:
                    fabrica.mostrarInformacionPrimerProducto();
                    break;

                case 28:
                    fabrica.obtenerProductoMayorCantidadInventario();
                    break;

                case 29:
                    System.out.println("El usuario ha salido del sistema.");
                    break;
            }
            if(opcion == 29) {
                break;
            }
        }
    }

    private static void mostrarMenu() {
        System.out.println("\nMenú de CRUD:");
        System.out.println("1. Crear producto");
        System.out.println("2. Crear empleado");
        System.out.println("3. Crear inventario");
        System.out.println("4. Crear turno");
        System.out.println("5. Actualizar producto");
        System.out.println("6. Actualizar empleado");
        System.out.println("7. Actualizar inventario");
        System.out.println("8. Actualizar turno");
        System.out.println("9. Leer producto");
        System.out.println("10. Leer empleado");
        System.out.println("11. Leer inventario");
        System.out.println("12. Leer turno");
        System.out.println("13. Eliminar producto");
        System.out.println("14. Eliminar empleado");
        System.out.println("15. Eliminar inventario");
        System.out.println("16. Eliminar inventario por cantidad del producto");
        System.out.println("17. Eliminar turno");
        System.out.println("18. consultar producto");
        System.out.println("19. consultar empleado");
        System.out.println("20. consultar inventario");
        System.out.println("21. consultar turno");
        System.out.println("22. obtener valor total hora extra primer empleado");
        System.out.println("23. obtener el promedio de edad de los empleados");
        System.out.println("24. obtener el salario mayor de los empleados");
        System.out.println("25. obtener el salario menor de los empleados");
        System.out.println("26. obtener el producto de menor precio");
        System.out.println("27. mostrar el primer producto de la lista");
        System.out.println("28. obtener el producto con menor cantidad en el inventario");
        System.out.println("29. Salir");
        System.out.print("Selecciona una opción: ");
    }

}
