package co.edu.uniquindio.fabricaMadera;
import co.edu.uniquindio.fabricaMadera.model.Inventario;
import co.edu.uniquindio.fabricaMadera.model.Empleado;
import co.edu.uniquindio.fabricaMadera.model.Fabrica;
import co.edu.uniquindio.fabricaMadera.model.enumeracion.ApellidoEmpleado;
import co.edu.uniquindio.fabricaMadera.model.enumeracion.NombreEmpleado;
import co.edu.uniquindio.fabricaMadera.model.enumeracion.Tamano;

public class Main {
    public static void main(String[] args) {

        Fabrica fabrica = inicializarDatosPrueba();

        double salarioMayor = fabrica.obtenerSalarioMayor();

        System.out.println("El salario mayor es de: " + salarioMayor);

        int promedioEdad = fabrica.obtenerPromedioEdad();

        System.out.println("El promedio de edad de los empleados es de: " + promedioEdad);

        fabrica.mostrarInformacionEmpleados();

        int troncosFechaRecepcionReciente = fabrica.obtenerCantinadadTroncosMasRecientes();

        System.out.println("la cantidad de troncos con fecha de recepción más recientes son: " + troncosFechaRecepcionReciente);

        fabrica.mostrarInformacionTronco4();

        String troncoMenor = fabrica.obtenerTroncoMenorPeso();

        System.out.println("El tronco con menor peso es: " + troncoMenor);

    }

    private static Fabrica inicializarDatosPrueba(){

        Empleado empleado1 = crearEmpleado(NombreEmpleado.CARLOS, ApellidoEmpleado.RODRIGUEZ, 18, "Auxiliar de producción", 1500000);
        Empleado empleado2 = crearEmpleado(NombreEmpleado.RICARDO, ApellidoEmpleado.MENDOZA, 27, "Supervisor", 2500000);
        Empleado empleado3 = crearEmpleado(NombreEmpleado.MIGUEL, ApellidoEmpleado.LONDOÑO, 30, "Gerente", 3500000);
        Empleado empleado4 = crearEmpleado(NombreEmpleado.ANDREA, ApellidoEmpleado.CARDONA, 25, "Coordinador", 2800000);
        Empleado empleado5 = crearEmpleado(NombreEmpleado.SANDRA, ApellidoEmpleado.PEREZ, 43, "Auxiliar servicios generales", 1600000);
        Inventario tronco1 = crearInventario(8.5, Tamano.MEDIANO, 3.2, 2023,50.2 );
        Inventario tronco2 = crearInventario(5, Tamano.PEQUEÑO, 1.6, 2022, 40.6);
        Inventario tronco3 = crearInventario(12, Tamano.GRANDE, 5.3, 2023, 80.5);
        Inventario tronco4 = crearInventario(7.2,Tamano.MEDIANO, 2.8, 2021, 48.1);
        Inventario tronco5 = crearInventario(4.1, Tamano.PEQUEÑO, 1.3, 2022, 36.7);
        Fabrica fabrica = new Fabrica("Maderas del centro S.A.S", "Carrera 19 calle 14, Armenia");
        fabrica.setEmpleado1(empleado1);
        fabrica.setEmpleado2(empleado2);
        fabrica.setEmpleado3(empleado3);
        fabrica.setEmpleado4(empleado4);
        fabrica.setEmpleado5(empleado5);
        fabrica.setTronco1(tronco1);
        fabrica.setTronco2(tronco2);
        fabrica.setTronco3(tronco3);
        fabrica.setTronco4(tronco4);
        fabrica.setTronco5(tronco5);

        return fabrica;
    }

    private static Empleado crearEmpleado(NombreEmpleado nombre, ApellidoEmpleado apellido, int edad, String cargo, double salario){

        Empleado empleado = new Empleado();

        empleado.setNombre(nombre);
        empleado.setApelldo(apellido);
        empleado.setEdad(edad);
        empleado.setCargo(cargo);
        empleado.setSalario(salario);

        return empleado;
    }

    private static Inventario crearInventario(double longitud, Tamano tamano, double grosor, int fechaRecepcion, double peso){

        Inventario inventario = new Inventario();

        inventario.setLongitud(longitud);
        inventario.setTamano(tamano);
        inventario.setGrosor(grosor);
        inventario.setFechaRecepcion(fechaRecepcion);
        inventario.setPeso(peso);

        return inventario;
    }

}

