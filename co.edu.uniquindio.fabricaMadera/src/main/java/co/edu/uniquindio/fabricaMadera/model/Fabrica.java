package co.edu.uniquindio.fabricaMadera.model;

import co.edu.uniquindio.fabricaMadera.model.enumeracion.ApellidoEmpleado;
import co.edu.uniquindio.fabricaMadera.model.enumeracion.NombreEmpleado;

import java.util.ArrayList;
import java.util.List;

public class Fabrica {

    private String nombre;
    private String direccion;
    List<Empleado> listaEmpleados = new ArrayList<>();
    List<Inventario> listaInventario = new ArrayList<>();
    List<Producto> listaProductos = new ArrayList<>();
    List<Turnos> listaTurnos = new ArrayList<>();
    List<Distribucion> listaDistribucion = new ArrayList<>();

    /* Constructor */

    public Fabrica() {
    }

    public Fabrica(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    /* Getters and Setters */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(List<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public List<Inventario> getListaInventario() {
        return listaInventario;
    }

    public void setListaInventario(List<Inventario> listaInventario) {
        this.listaInventario = listaInventario;
    }

    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public List<Turnos> getListaTurnos() {
        return listaTurnos;
    }

    public void setListaTurnos(List<Turnos> listaTurnos) {
        this.listaTurnos = listaTurnos;
    }

    public List<Distribucion> getListaDistribucion() {
        return listaDistribucion;
    }

    public void setListaDistribucion(List<Distribucion> listaDistribucion) {
        this.listaDistribucion = listaDistribucion;
    }

    public void crearEmpleado(NombreEmpleado nombre, ApellidoEmpleado apellido, int edad, String cedula, String cargo, double salario) {

        int resultadoBusqueda = devolverPosicionEmpleado(cedula);
        if (resultadoBusqueda == -1) {
            Empleado empleado = new Empleado();
            empleado.setNombre(nombre);
            empleado.setApellido(apellido);
            empleado.setEdad(edad);
            empleado.setCedula(cedula);
            empleado.setCargo(cargo);
            empleado.setSalario(salario);
            getListaEmpleados().add(empleado);
            System.out.println("Empleado creado exitosamente");

        } else {
            System.out.println("El empleado ya esta creado en el sistema");
        }
    }

    public List<Empleado> obtenerEmpleados() {
        return getListaEmpleados();
    }

    public int devolverPosicionEmpleado(String cedula) {
        int posicion = -1;
        boolean bandera = false;
        for (int i = 0; i < listaEmpleados.size() && bandera == false; i++) {
            if (listaEmpleados.get(i).getCedula().equalsIgnoreCase(cedula)) {
                bandera = true;
                posicion = i;
            }
        }
        return posicion;
    }

    public int obtenerPromedioEdad() {

        int sumaEdades = 0;

        for (Empleado empleado : listaEmpleados) {
            sumaEdades += empleado.getEdad();
        }
        return sumaEdades / listaEmpleados.size();

    }
}