package co.edu.uniquindio.fabricaMadera.services;

import co.edu.uniquindio.fabricaMadera.model.Empleado;
import co.edu.uniquindio.fabricaMadera.model.Inventario;
import co.edu.uniquindio.fabricaMadera.model.Producto;
import co.edu.uniquindio.fabricaMadera.model.Turno;
import co.edu.uniquindio.fabricaMadera.model.enumeracion.TipoProducto;

import java.util.Date;
import java.util.List;

public interface IFabrica {
    public void crearEmpleado(String nombre, String apellido, int edad, String cedula, String email,String cargo, double salario);
    public void crearProducto(TipoProducto tipoProducto, String idProducto, double precio);
    public void crearInventario(TipoProducto tipoProducto,int cantidad, String ubicacion, String responsable, String codigoReferencia);
    public void crearTurno(String cedula, Date horaEntrada, Date horaSalida, double valorHoraExtra, String codigo);
    public List<Producto> obteneProductos();
    public List<Empleado> obtenerEmpleados();
    public List<Inventario> obtenerInventario();
    public List<Turno> obtenerTurnos();
    public void actualizarProducto(String idProducto, TipoProducto nuevoProducto, double nuevoPrecio);
    public void actualizarEmpleado(String cedula, String nombre, String apellido, int edad,String email, String cargo, double salario);
    public void actualizarTurno(String codigo, Date horaEntrada, Date horaSalida, double valorHoraExtra);
    public void actualizarInventario(String codigoReferencia, TipoProducto nuevoTipoProducto, int nuevaCantidad, String nuevaUbicacion , String nuevoResponsable);
    public void eliminarProducto(String idProducto);
    public void eliminarEmpleado(String cedula);
    public void eliminarInventario(String codigoReferencia);
    public void eliminarTurno(String codigo);
    public void mostrarProductos();
    public void mostrarEmpleados();
    public void mostrarInventario();
    public void mostrarTurno();
    public int obtenerPromedioEdad();
    public double obtenerSalarioMayor();
    public double obtenerProductoMenorPrecio();
    public void mostrarInformacionPrimerProducto();
    public String obtenerProductoMayorCantidad();
    public void calcularValorHorasExtraPrimerEmpleado();


}


