package co.edu.uniquindio.fabricaMadera;
import co.edu.uniquindio.fabricaMadera.model.*;
import co.edu.uniquindio.fabricaMadera.model.enumeracion.TipoProducto;

import java.util.Calendar;
import java.util.Date;
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
        mostrarInformacionEmpleados(fabrica);

        int promedioEdad = fabrica.obtenerPromedioEdad();
        System.out.println("El promedio de edad de los empleados es de: " + promedioEdad);

        double salarioMayor = fabrica.obtenerSalarioMayor();
        System.out.println("El salario mayor es de: " + salarioMayor);

        System.out.println("Información de cada empleado: ");
        mostraInformacionEmpleado(fabrica);

        //Crud producto

        //create
        crearProducto(TipoProducto.MUEBLE, "2809",1300000, fabrica);
        crearProducto(TipoProducto.PUERTA, "3201", 560000, fabrica);
        crearProducto(TipoProducto.MESA, "8403", 420000, fabrica);
        crearProducto(TipoProducto.SILLA, "7603", 700, fabrica);
        crearProducto(TipoProducto.VIGA, "4833", 60000, fabrica);

        //Read
        System.out.println("Información productos:");
        mostrarInformacionProductos(fabrica);

        //Delate
        eliminarProducto("3201", fabrica);
        System.out.println("-----> Información luego de eliminar");
        mostrarInformacionProductos(fabrica);

        //Update
        actualizarProducto("2809", TipoProducto.ESCRITORIO,920000, fabrica);
        System.out.println("-----> Informacion luego de actualizar: ");
        mostrarInformacionProductos(fabrica);

        TipoProducto productoPrecioMenor = fabrica.obtenerProductoMenorPrecio();
        System.out.println("El producto con el precio más bajo es de: " + productoPrecioMenor);

        String obtenerProductoPorId = fabrica.obtenerProductoPorId("7603");
        System.out.println(obtenerProductoPorId);

        fabrica.mostrarInformacionPrimerProducto();

        //Crud inventario

        //Create
        crearInventario(TipoProducto.MUEBLE, 48, "Almacen de comercialización", "Santiago Ramirez", "1023",fabrica);
        crearInventario(TipoProducto.PUERTA, 114, "Almacen de materias prima", "Sofia Sanchez", "4312",fabrica);
        crearInventario(TipoProducto.MESA, 85, "Almacen de comercialización", "Laura Martinez", "5434" , fabrica);
        crearInventario(TipoProducto.SILLA, 164, "Almacen de materias prima", "Martin Lopez","9483" ,fabrica);
        crearInventario(TipoProducto.VIGA, 253, "Almacen de materias prima", "Ana Ortega", "7432",fabrica);

        //Read
        System.out.println("Información inventario:");
        mostrarInformacionInventario(fabrica);

        //Delate
        eliminarInventario("9483", fabrica);
        System.out.println("-----> Información luego de eliminar");
        mostrarInformacionInventario(fabrica);

        //Update
        actualizarInventario("1023", TipoProducto.ESCRITORIO,32,"almacen de materias prima","Gustavo Perez" , fabrica);
        System.out.println("-----> Informacion luego de actualizar: ");
        mostrarInformacionInventario(fabrica);

        String productoMayorCantidad = fabrica.obtenerProductoMayorCantidadInventario();
        System.out.println("El producto con mayor cantidad en el inventario es: " + productoMayorCantidad);

        //Crud turno

        //Create
        crearTurno("1096493875", new Date(2023, 5, 3, 10, 30), new Date(2023, 5, 3, 18, 30), 30000, "01",fabrica);
        crearTurno("1093983821", new Date(2023, 5, 4, 11, 20), new Date(2023, 5, 4, 20, 30), 30000, "02",fabrica);
        crearTurno("1016870947", new Date(2023, 5, 5, 7, 10), new Date(2023, 5, 5, 14, 45), 30000, "03",fabrica);
        crearTurno("1082748329", new Date(2023, 5, 6, 8, 0), new Date(2023, 5, 6, 21, 0), 30000, "04",fabrica);
        crearTurno("1016745323", new Date(2023, 5, 7, 6, 30), new Date(2023, 5, 7, 13, 30), 30000, "05",fabrica);

        //Read
        System.out.println("Información inventario:");
        mostrarInformacionTurnos(fabrica);

        //Delate
        eliminarTurno("02", fabrica);
        System.out.println("-----> Información luego de eliminar");
        mostrarInformacionTurnos(fabrica);

        //Update
        actualizarTurno("04", new Date(2023,6,14, 12,0),new Date(2023, 6, 14,18, 30), "1096493875" ,35000 ,fabrica);
        System.out.println("-----> Informacion luego de actualizar: ");
        mostrarInformacionTurnos(fabrica);

    }

    private static void actualizarTurno(String codigo, Date horaEntrada, Date horaSalida, String cedula, double valorHoraExtra, Fabrica fabrica) {

        fabrica.actualizarTurno(codigo, horaEntrada, horaSalida, valorHoraExtra);
    }

    private static void eliminarTurno(String codigo, Fabrica fabrica) {

        fabrica.eliminarTurno(codigo);
    }

    private static void mostrarInformacionTurnos(Fabrica fabrica) {

        List<Turno> listaTurnos = fabrica.obtenerTurnos();
        int tamanoLista = listaTurnos.size();
        for (int i=0; i < tamanoLista; i++){
            Turno turno = listaTurnos.get(i);
            System.out.println(turno.obtenerInformacion());
        }
    }

    private static void crearTurno(String cedula, Date horaEntrada,Date horaSalida, double valorHoraExtra,String codigo,Fabrica fabrica) {

        fabrica.crearTurno(cedula, horaEntrada, horaSalida, valorHoraExtra, codigo);
    }

    private static void actualizarInventario(String codigoReferencia, TipoProducto nuevoTipoProducto, int nuevaCantidad, String ubicacion , String nuevoResponsable,Fabrica fabrica) {

        fabrica.actualizarInventario(codigoReferencia, nuevoTipoProducto, nuevaCantidad, ubicacion, nuevoResponsable);
    }

    private static void eliminarInventario(String codigoReferencia, Fabrica fabrica) {

        fabrica.eliminarInventario(codigoReferencia);
    }

    private static void mostrarInformacionInventario(Fabrica fabrica) {

        List<Inventario> listaInventario = fabrica.obtenerInventario();
        int tamanoLista = listaInventario.size();
        for (int i=0; i < tamanoLista; i++){
            Inventario inventario = listaInventario.get(i);
            System.out.println(inventario.obtenerInformacion());
        }
    }


    private static void mostrarInformacionEmpleados(Fabrica fabrica) {

        List<Empleado> listaEmpleados = fabrica.obtenerEmpleados();
        int tamanoLista = listaEmpleados.size();
        for (int i=0; i < tamanoLista; i++){
            Empleado empleado = listaEmpleados.get(i);
            System.out.println(empleado.obtenerInformacion());
        }
    }

    private static Fabrica inicializarDatosPrueba() {
        Fabrica fabrica = new Fabrica();
        fabrica.setNombre("Maderas del centro S.A.S");
        fabrica.setDireccion("Carrera 19 calle 14, Armenia");
        return fabrica;
    }

    private static void crearProducto(TipoProducto tipoProducto, String idProducto, double precio, Fabrica fabrica) {
        fabrica.crearProducto(tipoProducto, idProducto, precio);
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

    private static void actualizarProducto(String idProducto, TipoProducto nombreProducto, double precio,Fabrica fabrica) {
        fabrica.actualizarProducto(idProducto, nombreProducto, precio);
    }

    private static void crearEmpleado(String nombre,
                                      String apellido,
                                      int edad, String cedula, String email,String cargo, double salario,
                                      Fabrica fabrica) {

        fabrica.crearEmpleado(nombre, apellido, edad, cedula, email,cargo, salario);
    }

    private static void crearInventario(TipoProducto tipoProducto, int cantidad, String ubicacion, String responsable, String codigoReferencia ,Fabrica fabrica) {
        fabrica.crearInventario(tipoProducto,cantidad,ubicacion,responsable, codigoReferencia);
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