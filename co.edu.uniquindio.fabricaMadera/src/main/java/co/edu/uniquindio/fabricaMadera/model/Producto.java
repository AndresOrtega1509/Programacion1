package co.edu.uniquindio.fabricaMadera.model;

import co.edu.uniquindio.fabricaMadera.model.enumeracion.TipoProducto;

public class Producto {

    private TipoProducto tipoProducto;
    private String idProducto;
    private double precio;
    Inventario inventarioAsociado;
    Fabrica ownedByFabrica;

    /*Constructor*/

    public Producto() {
    }

    public Producto(TipoProducto tipoProducto, String idProducto, double precio) {
        this.tipoProducto = tipoProducto;
        this.idProducto = idProducto;
        this.precio = precio;
    }

    /*Getters and setters*/

    public TipoProducto getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(TipoProducto tipoProducto) {
        this.tipoProducto = tipoProducto;
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

    public Inventario getInventarioAsociado() {
        return inventarioAsociado;
    }

    public void setInventarioAsociado(Inventario inventarioAsociado) {
        this.inventarioAsociado = inventarioAsociado;
    }

    public String obtenerInformacion(){
        String informacion = "";
        informacion = informacion +
                "Nombre: " + getTipoProducto() + "\n" +
                "idProducto: " + getIdProducto() + "\n" +
                "Precio: " + getPrecio() + "\n";

        return informacion;

    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + tipoProducto + '\'' +
                ", idProducto='" + idProducto + '\'' +
                ", precio=" + precio +
                '}';
    }
}



