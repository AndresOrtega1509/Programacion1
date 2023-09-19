package co.edu.uniquindio.fabricaMadera.model;

import co.edu.uniquindio.fabricaMadera.model.enumeracion.ApellidoEmpleado;
import co.edu.uniquindio.fabricaMadera.model.enumeracion.NombreEmpleado;

public class Empleado {

    private NombreEmpleado nombre;
    private ApellidoEmpleado apelldo;
    private int edad;
    private String cargo;
    private double salario;

    /* Constructor */

    public Empleado() {
    }

    public Empleado(NombreEmpleado nombre, ApellidoEmpleado apelldo, int edad, String cargo, double salario) {
        this.nombre = nombre;
        this.apelldo = apelldo;
        this.edad = edad;
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

    public ApellidoEmpleado getApelldo() {
        return apelldo;
    }

    public void setApelldo(ApellidoEmpleado apelldo) {
        this.apelldo = apelldo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
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

    public String obtenerInformacion(){
        String informacion = "";
        informacion = informacion +
                "Nombre: " + getNombre() + "\n" +
                "Apellido: " + getApelldo() + "\n" +
                "Edad: " + getEdad() + "\n" +
                "Cargo: " + getCargo() + "\n" +
                "Salario: " + getSalario() + "\n";

        return informacion;

    }

}