package co.edu.uniquindio.fabricaMadera.model;



public class Inventario {

    private String producto;
    private int cantidad;
    private String ubicacion;
    private String responsable;
    Fabrica ownedByFabrica;

    /* Constructor */

    public Inventario() {
    }

    public Inventario(String producto, int cantidad, String ubicacion, String responsable) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.ubicacion = ubicacion;
        this.responsable = responsable;
    }

    /* Getters and Setters */

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public Fabrica getOwnedByFabrica() {
        return ownedByFabrica;
    }

    public void setOwnedByFabrica(Fabrica ownedByFabrica) {
        this.ownedByFabrica = ownedByFabrica;
    }
}