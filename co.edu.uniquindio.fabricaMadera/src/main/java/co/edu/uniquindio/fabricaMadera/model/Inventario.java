package co.edu.uniquindio.fabricaMadera.model;

import co.edu.uniquindio.fabricaMadera.model.enumeracion.Tamano;

public class Inventario {

    private double longitud;
    private Tamano tamano;
    private double grosor;
    private int fechaRecepcion;
    private double peso;

    /* Constructor */

    public Inventario() {
    }

    public Inventario(double longitud, Tamano tamano, double grosor, int fechaRecepcion, double peso) {
        this.longitud = longitud;
        this.tamano = tamano;
        this.grosor = grosor;
        this.fechaRecepcion = fechaRecepcion;
        this.peso = peso;
    }

    /* Getters and Setters */

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public Tamano getTamano() {
        return tamano;
    }

    public void setTamano(Tamano tamano) {
        this.tamano = tamano;
    }

    public double getGrosor() {
        return grosor;
    }

    public void setGrosor(double grosor) {
        this.grosor = grosor;
    }

    public int getFechaRecepcion() {
        return fechaRecepcion;
    }

    public void setFechaRecepcion(int fechaRecepcion) {
        this.fechaRecepcion = fechaRecepcion;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String obtenerInformacionTronco4() {
        String informacion = "";
        informacion = informacion +
                "Longitud: " + getLongitud() + "\n" +
                "Tamaño: " + getTamano() + "\n" +
                "Grosor: " + getGrosor() + "\n" +
                "FechaRecepcion: " + getFechaRecepcion() + "\n" +
                "Peso: " + getPeso() + "\n";

        return informacion;
    }

}