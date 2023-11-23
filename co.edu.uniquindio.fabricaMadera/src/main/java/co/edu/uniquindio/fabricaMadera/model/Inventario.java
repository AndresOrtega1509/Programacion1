package co.edu.uniquindio.fabricaMadera.model;


import co.edu.uniquindio.fabricaMadera.model.enumeracion.TipoProducto;

import java.util.ArrayList;
import java.util.List;

public class Inventario {

    private TipoProducto tipoProducto;
    private int cantidad;
    private String ubicacion;
    private String responsable;
    private String codigoReferencia;
    List<Producto> listaProductos = new ArrayList<>();
    Fabrica ownedByFabrica;

    /* Constructor */

    public Inventario() {
    }

    public Inventario(TipoProducto tipoProducto, int cantidad, String ubicacion, String responsable, String codigoReferencia) {
        this.tipoProducto = tipoProducto;
        this.cantidad = cantidad;
        this.ubicacion = ubicacion;
        this.responsable = responsable;
        this.codigoReferencia = codigoReferencia;
    }

    /* Getters and Setters */

    public TipoProducto getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(TipoProducto tipoProducto) {
        this.tipoProducto = tipoProducto;
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

    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public String getCodigoReferencia() {
        return codigoReferencia;
    }

    public void setCodigoReferencia(String codigoReferencia) {
        this.codigoReferencia = codigoReferencia;
    }

    public String obtenerInformacion() {

        String informacion = "";
        informacion = informacion +
                "Nombre: " + getTipoProducto() + "\n" +
                "Cantidad: " + getCantidad() + "\n" +
                "Ubicación: " + getUbicacion()+ "\n" +
                "Responsable: " + getResponsable() + "\n" +
                "Codigo referencia: " + getCodigoReferencia() + "\n";

        return informacion;
    }
}