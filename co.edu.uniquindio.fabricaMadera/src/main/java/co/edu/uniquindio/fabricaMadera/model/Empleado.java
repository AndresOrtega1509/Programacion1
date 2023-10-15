package co.edu.uniquindio.fabricaMadera.model;

import co.edu.uniquindio.fabricaMadera.model.enumeracion.ApellidoEmpleado;
import co.edu.uniquindio.fabricaMadera.model.enumeracion.NombreEmpleado;

public class Empleado {

    private NombreEmpleado nombre;
    private ApellidoEmpleado apellido;
    private int edad;
    private String cedula;
    private String cargo;
    private double salario;
    Fabrica ownedByFabrica;

    /* Constructor */

    public Empleado() {
    }

    public Empleado(NombreEmpleado nombre, ApellidoEmpleado apellido, int edad, String cedula, String cargo, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cedula = cedula;
        this.cargo = cargo;
        this.salario = salario;
    }

    /* Getters and Setters */

    public NombreEmpleado getNombre() {
        return nombre;
    }

    public void setNombre(NombreEmpleado nombre) {
        this.nombre = nombre;
    }

    public ApellidoEmpleado getApellido() {
        return apellido;
    }

    public void setApellido(ApellidoEmpleado apelldo) {
        this.apellido = apelldo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Fabrica getOwnedByFabrica() {
        return ownedByFabrica;
    }

    public void setOwnedByFabrica(Fabrica ownedByFabrica) {
        this.ownedByFabrica = ownedByFabrica;
    }

    public String obtenerInformacion(){
        String informacion = "";
        informacion = informacion +
                "Nombre: " + getNombre() + "\n" +
                "Apellido: " + getApellido() + "\n" +
                "Edad: " + getEdad() + "\n" +
                "Cargo: " + getCargo() + "\n" +
                "Salario: " + getSalario() + "\n";

        return informacion;

    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre=" + nombre +
                ", apellido=" + apellido +
                ", edad=" + edad +
                ", cedula='" + cedula + '\'' +
                ", cargo='" + cargo + '\'' +
                ", salario=" + salario +
                '}';
    }
}