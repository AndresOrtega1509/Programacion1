package co.edu.uniquindio.fabricaMadera.model;

import co.edu.uniquindio.fabricaMadera.model.enumeracion.ApellidoEmpleado;
import co.edu.uniquindio.fabricaMadera.model.enumeracion.NombreEmpleado;

public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private String cedula;
    private String email;
    Fabrica ownedByFabrica;

    /* Constructor */

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, String cedula, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cedula = cedula;
        this.email = email;
    }

    /*Getters and Setters*/

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Fabrica getOwnedByFabrica() {
        return ownedByFabrica;
    }

    public void setOwnedByFabrica(Fabrica ownedByFabrica) {
        this.ownedByFabrica = ownedByFabrica;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre=" + nombre +
                ", apellido=" + apellido +
                ", edad=" + edad +
                ", cedula='" + cedula + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
