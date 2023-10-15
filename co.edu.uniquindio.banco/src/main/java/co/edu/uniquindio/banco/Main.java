package co.edu.uniquindio.banco;

import co.edu.uniquindio.banco.model.Banco;
import co.edu.uniquindio.banco.model.Empleado;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Banco banco = inicializarDatosPrueba();

        CrearCliente("Julio", "Hernandez", "1098094532", 31, banco);
        CrearCliente("Victor", "Sanchez", "1016983728", 26, banco);
        CrearCliente("Sara", "Lopez", "1087432350", 19, banco);

        mostraInformacionEmpleado(banco);

    }

    private static Banco inicializarDatosPrueba() {
        Banco banco = new Banco();
        banco.setNombre("Davivienda");
        banco.setDireccion("Carrera 14");
        return banco;
    }

    private static void CrearCliente(String nombre, String apellido, String cedula , int edad, Banco banco) {

        banco.crearEmpleado(nombre,apellido,cedula,edad);

    }

    private static void mostraInformacionEmpleado(Banco banco){

        List<Empleado> listaEmpleados = banco.obtenerEmpleados();
        int tamanoLista = listaEmpleados.size();
        for (int i = 0; i < tamanoLista; i ++){
            Empleado empleado = listaEmpleados.get(i);
            System.out.println(empleado.toString());
        }
    }
}