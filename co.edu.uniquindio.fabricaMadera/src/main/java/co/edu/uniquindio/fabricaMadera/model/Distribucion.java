package co.edu.uniquindio.fabricaMadera.model;

public class Distribucion {
    private String nombreProducto;
    private int cantidad;
    private String ciudadEntrega;
    Fabrica ownedByFabrica;

    /*Constructor*/

    public Distribucion() {
    }

    public Distribucion(String nombreProducto, int cantidad, String ciudadEntrega) {
        this.nombreProducto = nombreProducto;
        this.cantidad = cantidad;
        this.ciudadEntrega = ciudadEntrega;
    }

    /*Getters and setters*/

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getCiudadEntrega() {
        return ciudadEntrega;
    }

    public void setCiudadEntrega(String ciudadEntrega) {
        this.ciudadEntrega = ciudadEntrega;
    }

    public Fabrica getOwnedByFabrica() {
        return ownedByFabrica;
    }

    public void setOwnedByFabrica(Fabrica ownedByFabrica) {
        this.ownedByFabrica = ownedByFabrica;
    }
}
