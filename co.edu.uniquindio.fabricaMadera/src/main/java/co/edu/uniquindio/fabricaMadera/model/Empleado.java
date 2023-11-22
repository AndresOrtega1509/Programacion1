package co.edu.uniquindio.fabricaMadera.model;

public class Empleado extends Persona{

    private double salario;
    private String cargo;

    public Empleado() {
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String obtenerInformacion(){
        String informacion = "";
        informacion = informacion +
                "Nombre: " + getNombre() + "\n" +
                "Apellido: " + getApellido() + "\n" +
                "Edad: " + getEdad() + "\n" +
                "Cedula: " + getCedula() + "\n" +
                "email: " + getEmail() + "\n" +
                "Cargo: "+ getCargo() + "\n" +
                "Salario: " + getSalario() + "\n";


        return informacion;
    }




}