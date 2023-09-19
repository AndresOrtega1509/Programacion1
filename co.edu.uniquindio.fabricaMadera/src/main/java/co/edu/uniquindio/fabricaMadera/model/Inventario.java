package co.edu.uniquindio.fabricaMadera.model;

public class Inventario {

    private double longitud;
    private String tamano;
    private double grosor;
    private int fechaRecepcion;
    private double peso;

    /* Constructor */

    public Inventario() {
    }

    public Inventario(double longitud, String tamano, double grosor, int fechaRecepcion, int peso) {
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

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
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
                "Tamano: " + getTamano() + "\n" +
                "Grosor: " + getGrosor() + "\n" +
                "FechaRecepcion: " + getFechaRecepcion() + "\n" +
                "Peso: " + getPeso() + "\n";

        return informacion;
    }

}
