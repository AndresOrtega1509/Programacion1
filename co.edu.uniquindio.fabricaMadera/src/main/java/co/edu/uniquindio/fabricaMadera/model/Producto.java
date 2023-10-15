package co.edu.uniquindio.fabricaMadera.model;

public class Producto {

    private String nombre;
    private String idProducto;
    private double precio;
    Fabrica ownedByFabrica;

    /*Constructor*/

    public Producto() {
    }

    public Producto(String nombre, String idProducto, double precio) {
        this.nombre = nombre;
        this.idProducto = idProducto;
        this.precio = precio;
    }

    /*Getters and setters*/

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Fabrica getOwnedByFabrica() {
        return ownedByFabrica;
    }

    public void setOwnedByFabrica(Fabrica ownedByFabrica) {
        this.ownedByFabrica = ownedByFabrica;
    }
}



