package co.edu.uniquindio.fabricaMadera;
import co.edu.uniquindio.fabricaMadera.model.Empleado;
import co.edu.uniquindio.fabricaMadera.model.Fabrica;
import co.edu.uniquindio.fabricaMadera.model.enumeracion.ApellidoEmpleado;
import co.edu.uniquindio.fabricaMadera.model.enumeracion.NombreEmpleado;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Fabrica fabrica = inicializarDatosPrueba();

       // double salarioMayor = fabrica.obtenerSalarioMayor();

       // System.out.println("El salario mayor es de: " + salarioMayor);

        int promedioEdad = fabrica.obtenerPromedioEdad();

        System.out.println("El promedio de edad de los empleados es de: " + promedioEdad);


        crearEmpleado(NombreEmpleado.CARLOS, ApellidoEmpleado.RODRIGUEZ, 18, "1096493875","Auxiliar de producción" , 1500000, fabrica);
        crearEmpleado(NombreEmpleado.RICARDO, ApellidoEmpleado.MENDOZA, 27, "1093983821","Supervisor" ,2500000, fabrica);
        crearEmpleado(NombreEmpleado.MIGUEL, ApellidoEmpleado.LONDOÑO, 30, "1016870947","Gerente" ,3500000, fabrica);
        crearEmpleado(NombreEmpleado.ANDREA, ApellidoEmpleado.CARDONA, 25, "1082748329","Coordinador" ,2800000, fabrica);
        crearEmpleado(NombreEmpleado.SANDRA, ApellidoEmpleado.PEREZ, 43, "1016745323","Auxiliar servicios generales" ,1600000, fabrica);

        mostraInformacionEmpleado(fabrica);



    }

    private static Fabrica inicializarDatosPrueba() {
        Fabrica fabrica = new Fabrica();
        fabrica.setNombre("Maderas del centro S.A.S");
        fabrica.setDireccion("Carrera 19 calle 14, Armenia");
        return fabrica;
    }

    private static void crearEmpleado(NombreEmpleado nombre,
                                      ApellidoEmpleado apellido,
                                      int edad, String cedula, String cargo, double salario,
                                      Fabrica fabrica) {

        fabrica.crearEmpleado(nombre, apellido, edad, cedula, cargo, salario);
    }

    private static void mostraInformacionEmpleado(Fabrica fabrica){

        List<Empleado> listaEmpleados = fabrica.obtenerEmpleados();
        int tamanoLista = listaEmpleados.size();
        for (int i = 0; i < tamanoLista; i ++){
            Empleado empleado = listaEmpleados.get(i);
            System.out.println(empleado.toString());
        }
    }
}