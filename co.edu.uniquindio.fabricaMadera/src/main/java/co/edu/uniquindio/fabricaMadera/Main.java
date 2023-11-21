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

        //Crud empleado

        //Create
        crearEmpleado("Carlos", "Rodriguez", 18, "1096493875","rodriguez@gmail.com","Auxiliar de producción" , 150000, fabrica);
        crearEmpleado("Ricardo", "Mendoza", 27, "1093983821", "ricardo@hotmail.com","Supervisor" ,250000, fabrica);
        crearEmpleado("Miguel", "Londoño", 30, "1016870947","miguel@hotmail.com" ,"Gerente" ,350000, fabrica);
        crearEmpleado("Andrea", "Cardona", 25, "1082748329","andrea@gmail.com" ,"Coordinador" ,280000, fabrica);
        crearEmpleado("Sandra", "Perez", 43, "1016745323", "sandra@hotmail.com","Auxiliar servicios generales" ,160000, fabrica);

        //Read
        System.out.println("Información empleados:");
        mostrarInformacionEmpleados(fabrica);

        //Delate
        eliminarEmpleado("1082748329", fabrica);
        System.out.println("-----> Información luego de eliminar");
        mostrarInformacionEmpleados(fabrica);

        //Update
        actualizarEmpleado("1016745323", "Esteban","Botina", 20 , "esteban@uqvirtual.edu.co","Coordinador" , 1400000, fabrica);
        System.out.println("-----> Informacion luego de actualizar: ");
        mostrarInformacionProductos(fabrica);

        int promedioEdad = fabrica.obtenerPromedioEdad();
        System.out.println("El promedio de edad de los empleados es de: " + promedioEdad);

        double salarioMayor = fabrica.obtenerSalarioMayor();
        System.out.println("El salario mayor es de: " + salarioMayor);

        System.out.println("Información de cada empleado: ");
        mostraInformacionEmpleado(fabrica);

        //Crud producto
        eliminarProducto("3201", fabrica);
        System.out.println("-----> Información luego de eliminar");
        mostrarInformacionProductos(fabrica);

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

    private static void mostrarInformacionEmpleados(Fabrica fabrica) {

        List<Empleado> listaEmpleados = fabrica.obtenerEmpleados();
        int tamanoLista = listaEmpleados.size();
        for (int i=0; i < tamanoLista; i++){
            Empleado empleado = listaEmpleados.get(i);
            System.out.println(empleado.toString());
        }
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

    private static void crearEmpleado(String nombre,
                                      String apellido,
                                      int edad, String cedula, String email,String cargo, double salario,
                                      Fabrica fabrica) {

        fabrica.crearEmpleado(nombre, apellido, edad, cedula, email,cargo, salario);
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

    private static void eliminarEmpleado(String cedula, Fabrica fabrica) {

        fabrica.eliminarEmpleado(cedula);
    }

    private static void actualizarEmpleado(String cedula, String nombre, String apellido, int edad, String email,String cargo, double salario, Fabrica fabrica) {
        fabrica.actualizarEmpleado(cedula, nombre, apellido, edad, email ,cargo, salario);
    }
}