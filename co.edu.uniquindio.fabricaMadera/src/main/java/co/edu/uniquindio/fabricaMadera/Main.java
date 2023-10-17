package co.edu.uniquindio.fabricaMadera;
import co.edu.uniquindio.fabricaMadera.model.Empleado;
import co.edu.uniquindio.fabricaMadera.model.Fabrica;
import co.edu.uniquindio.fabricaMadera.model.Producto;
import co.edu.uniquindio.fabricaMadera.model.enumeracion.ApellidoEmpleado;
import co.edu.uniquindio.fabricaMadera.model.enumeracion.NombreEmpleado;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Fabrica fabrica = inicializarDatosPrueba();

        crearEmpleado(NombreEmpleado.CARLOS, ApellidoEmpleado.RODRIGUEZ, 18, "1096493875","Auxiliar de producción" , 1500000, fabrica);
        crearEmpleado(NombreEmpleado.RICARDO, ApellidoEmpleado.MENDOZA, 27, "1093983821","Supervisor" ,2500000, fabrica);
        crearEmpleado(NombreEmpleado.MIGUEL, ApellidoEmpleado.LONDOÑO, 30, "1016870947","Gerente" ,3500000, fabrica);
        crearEmpleado(NombreEmpleado.ANDREA, ApellidoEmpleado.CARDONA, 25, "1082748329","Coordinador" ,2800000, fabrica);
        crearEmpleado(NombreEmpleado.SANDRA, ApellidoEmpleado.PEREZ, 43, "1016745323","Auxiliar servicios generales" ,1600000, fabrica);

        int promedioEdad = fabrica.obtenerPromedioEdad();
        System.out.println("El promedio de edad de los empleados es de: " + promedioEdad);

        double salarioMayor = fabrica.obtenerSalarioMayor();
        System.out.println("El salario mayor es de: " + salarioMayor);

        System.out.println("Información de cada empleado: ");
        mostraInformacionEmpleado(fabrica);

        //Crud producto

        //create
        crearProducto("Mueble", "2809",1300000, fabrica);
        crearProducto("Puerta", "3201", 560000, fabrica);
        crearProducto("Mesa", "8403", 420000, fabrica);
        crearProducto("Silla", "7603", 70000, fabrica);
        crearProducto("Viga", "4833", 60000, fabrica);

        //Read
        System.out.println("Información productos:");
        mostrarInformacionProductos(fabrica);

        //Delate
        eliminarProducto("3201", fabrica);
        System.out.println("-----> Información luego de eliminar");
        mostrarInformacionProductos(fabrica);

        //Update
        actualizarProducto("2809", "escritorio",920000, fabrica);
        System.out.println("-----> Informacion luego de actualizar: ");
        mostrarInformacionProductos(fabrica);

        double productoPrecioMenor = fabrica.obtenerProductoMenorPrecio();
        System.out.println("El producto con el precio más bajo es de: " + productoPrecioMenor);

        fabrica.mostrarInformacionPrimerProducto();

        crearInventario("Mueble", 48, "Almacen de comercialización", "Santiago Ramirez", fabrica);
        crearInventario("Puerta", 114, "Almacen de materias prima", "Sofia Sanchez", fabrica);
        crearInventario("Mesa", 85, "Almacen de comercialización", "Laura Martinez", fabrica);
        crearInventario("Silla", 164, "Almacen de materias prima", "Martin Lopez", fabrica);
        crearInventario("Viga", 253, "Almacen de materias prima", "Ana Ortega", fabrica);

        String productoMayorCantidad = fabrica.obtenerProductoMayorCantidad();
        System.out.println("El producto con mayor cantidad en el inventario es: " + productoMayorCantidad);

    }

    private static Fabrica inicializarDatosPrueba() {
        Fabrica fabrica = new Fabrica();
        fabrica.setNombre("Maderas del centro S.A.S");
        fabrica.setDireccion("Carrera 19 calle 14, Armenia");
        return fabrica;
    }

    private static void crearProducto(String nombre, String idProducto, double precio, Fabrica fabrica) {
        fabrica.crearProducto(nombre, idProducto, precio);
    }

    private static void eliminarProducto(String idProducto, Fabrica fabrica) {

        fabrica.eliminarProducto(idProducto);
    }

    private static void mostrarInformacionProductos(Fabrica fabrica) {

        List<Producto> listaProductos = fabrica.obteneProductos();
        int tamanoLista = listaProductos.size();
        for (int i=0; i < tamanoLista; i++){
            Producto producto = listaProductos.get(i);
            System.out.println(producto.toString());
        }
    }

    private static void actualizarProducto(String idProducto, String nuevoNombre, double nuevoPrecio,Fabrica fabrica) {
        fabrica.actualizarProducto(idProducto, nuevoNombre, nuevoPrecio);
    }

    private static void crearEmpleado(NombreEmpleado nombre,
                                      ApellidoEmpleado apellido,
                                      int edad, String cedula, String cargo, double salario,
                                      Fabrica fabrica) {

        fabrica.crearEmpleado(nombre, apellido, edad, cedula, cargo, salario);
    }

    private static void crearInventario(String producto, int cantidad, String ubicacion, String responsable, Fabrica fabrica) {
        fabrica.crearInventario(producto,cantidad,ubicacion,responsable);
    }

    private static void mostraInformacionEmpleado(Fabrica fabrica){

        List<Empleado> listaEmpleados = fabrica.obtenerEmpleados();
        int tamanoLista = listaEmpleados.size();
        for (int i = 0; i < tamanoLista; i ++){
            Empleado empleado = listaEmpleados.get(i);
            System.out.println(empleado.obtenerInformacion());
        }
    }
}