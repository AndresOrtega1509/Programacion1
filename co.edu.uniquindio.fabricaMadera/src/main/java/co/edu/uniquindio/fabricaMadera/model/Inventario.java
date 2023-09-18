package co.edu.uniquindio.fabricaMadera.model;

public class Inventario {

    private double longitud;
    private String tamano;
    private double grosor;
    private int fechaRecepcion;
    private int cantidad;
    private Inventario inventario;


    /* Constructor */

    public Inventario() {
    }

    public Inventario(double longitud, String tamano, double grosor, int fechaRecepcion, int cantidad) {
        this.longitud = longitud;
        this.tamano = tamano;
        this.grosor = grosor;
        this.fechaRecepcion = fechaRecepcion;
        this.cantidad = cantidad;
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

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }
}
