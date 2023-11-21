package co.edu.uniquindio.fabricaMadera.model;

import co.edu.uniquindio.fabricaMadera.model.enumeracion.ApellidoEmpleado;
import co.edu.uniquindio.fabricaMadera.model.enumeracion.NombreEmpleado;

import java.util.ArrayList;
import java.util.List;

public class Fabrica {

    private String nombre;
    private String direccion;
    List<Empleado> listaEmpleados = new ArrayList<>();
    List<Inventario> listaInventario = new ArrayList<>();
    List<Producto> listaProductos = new ArrayList<>();
    List<Turnos> listaTurnos = new ArrayList<>();
    List<Distribucion> listaDistribucion = new ArrayList<>();

    /* Constructor */

    public Fabrica() {
    }

    public Fabrica(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    /* Getters and Setters */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(List<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public List<Inventario> getListaInventario() {
        return listaInventario;
    }

    public void setListaInventario(List<Inventario> listaInventario) {
        this.listaInventario = listaInventario;
    }

    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public List<Turnos> getListaTurnos() {
        return listaTurnos;
    }

    public void setListaTurnos(List<Turnos> listaTurnos) {
        this.listaTurnos = listaTurnos;
    }

    public List<Distribucion> getListaDistribucion() {
        return listaDistribucion;
    }

    public void setListaDistribucion(List<Distribucion> listaDistribucion) {
        this.listaDistribucion = listaDistribucion;
    }

    /**
     * Metodo que permite crear un empleado
     * @param nombre
     * @param apellido
     * @param edad
     * @param cedula
     * @param cargo
     * @param salario
     */
    public void crearEmpleado(String nombre, String apellido, int edad, String cedula, String email,String cargo, double salario) {

        int resultadoBusqueda = devolverPosicionEmpleado(cedula);
        if (resultadoBusqueda == -1) {
            Empleado empleado = new Empleado();
            empleado.setNombre(nombre);
            empleado.setApellido(apellido);
            empleado.setEdad(edad);
            empleado.setCedula(cedula);
            empleado.setEmail(email);
            empleado.setCargo(cargo);
            empleado.setSalario(salario);
            getListaEmpleados().add(empleado);
            System.out.println("Empleado creado exitosamente");

        } else {
            System.out.println("El empleado ya esta creado en el sistema");
        }
    }

    /**
     * Metodo que permite obtener la lista de los empleados
     * @return List<Empleado>
     */
    public List<Empleado> obtenerEmpleados() {
        return getListaEmpleados();
    }

    /**
     * Metodo para verificar si el empleado ya esta creado de acuerdo a la cedula
     * @param cedula
     * @return int
     */
    public int devolverPosicionEmpleado(String cedula) {
        int posicion = -1;
        boolean bandera = false;
        for (int i = 0; i < listaEmpleados.size() && bandera == false; i++) {
            if (listaEmpleados.get(i).getCedula().equalsIgnoreCase(cedula)) {
                bandera = true;
                posicion = i;
            }
        }
        return posicion;
    }

    /**
     * Metodo para obtener el promedio de edad de los empleados
     * @return int
     */

    public int obtenerPromedioEdad() {

        int sumaEdades = 0;

        for (Empleado empleado : listaEmpleados) {
            sumaEdades += empleado.getEdad();
        }
        return sumaEdades / getListaEmpleados().size();


    }

    /**
     * Metodo para obtener el salario mayor de los empleados
     * @return double
     */

    public double obtenerSalarioMayor() {

        double salarioMayor = getListaEmpleados().get(0).getSalario();

        for (int i = 0; i < getListaEmpleados().size(); i++){
            if (getListaEmpleados().get(i).getSalario() > salarioMayor){
                salarioMayor = getListaEmpleados().get(i).getSalario();

            }
        }
        return salarioMayor;
    }

    /**
     * Metodo para obtener el producto de menor precio
     * @return double
     */

    public double obtenerProductoMenorPrecio(){

        double productoMenorPrecio = getListaProductos().get(0).getPrecio();

        for (int i = 0; i < getListaProductos().size(); i++){
            if (getListaProductos().get(i).getPrecio() < productoMenorPrecio){
                productoMenorPrecio = getListaProductos().get(i).getPrecio();
            }
        }
        return productoMenorPrecio;
    }

    /**
     * Metodo para crear un producto
     * @param nombre
     * @param idProducto
     * @param precio
     */

    public void crearProducto(String nombre, String idProducto, double precio) {

        int resultadoBusqueda = devolverPosicionProducto(idProducto);
        if (resultadoBusqueda == -1) {
            Producto producto = new Producto();
            producto.setNombre(nombre);
            producto.setIdProducto(idProducto);
            producto.setPrecio(precio);
            getListaProductos().add(producto);
            System.out.println("Producto creado exitosamente");

        } else {
            System.out.println("El producto ya esta creado en el sistema");
        }
    }

    /**
     * Metodo para verificar si el producto ya esta creado de acuerdo al id
     * @param idProducto
     * @return int
     */

    public int devolverPosicionProducto(String idProducto) {
        int posicion = -1;
        boolean bandera = false;
        for (int i = 0; i < listaProductos.size() && bandera == false; i++) {
            if (listaProductos.get(i).getIdProducto().equalsIgnoreCase(idProducto)) {
                bandera = true;
                posicion = i;
            }
        }
        return posicion;

    }

    /**
     * Metodo para mostrar la informacion del primer producto
     */

    public void mostrarInformacionPrimerProducto(){

        Producto primerProducto =getListaProductos().get(0);
        System.out.println("Informacion del primer producto: " + primerProducto.obtenerInformacion());
    }

    /**
     * Metodo para crear el inventario
     * @param producto
     * @param cantidad
     * @param ubicacion
     * @param responsable
     */

    public void crearInventario(String producto,int cantidad, String ubicacion, String responsable) {

            Inventario inventario = new Inventario();
            inventario.setProducto(producto);
            inventario.setCantidad(cantidad);
            inventario.setUbicacion(ubicacion);
            inventario.setResponsable(responsable);
            getListaInventario().add(inventario);
    }

    /**
     * Metodo para obtener el producto que cuenta con mayor cantidad de acuerdo al inventario
     * @return String
     */

    public String obtenerProductoMayorCantidad(){

        int cantidadMayor = listaInventario.get(0).getCantidad();
        String productoMayor = "";

        for (Inventario inventario : getListaInventario()) {
            if (inventario.getCantidad() > cantidadMayor) {
                cantidadMayor = inventario.getCantidad();
                productoMayor = inventario.getProducto();
            }
        }

        return productoMayor;
    }

    /**
     * Metodo para actualizar un producto
     * @param idProducto
     * @param nuevoNombre
     * @param nuevoPrecio
     */
    public void actualizarProducto(String idProducto, String nuevoNombre, double nuevoPrecio) {
        for (Producto producto : listaProductos){
            if (producto.getIdProducto().equals(idProducto)){
                producto.setNombre(nuevoNombre);
                producto.setPrecio(nuevoPrecio);
                break;
            }
        }
    }

    /**
     * Metodo para obtener la lista de los productos
     * @return List<Producto>
     */
    public List<Producto> obteneProductos() {
        return getListaProductos();
    }

    /**
     * Metodo para mostrar los productos de la lista
     */
    public void mostrarProductos(){
        List<Producto> listaProductos = obteneProductos();
        int tamanoLista = listaProductos.size();
        for (int i=0; i < tamanoLista; i++){
            Producto producto = listaProductos.get(i);
            System.out.println(producto.toString());
        }
    }

    /**
     * Metodo para eliminar un producto
     * @param idProducto
     */
    public void eliminarProducto(String idProducto) {

        for (Producto producto : listaProductos){
            if (producto.getIdProducto().equalsIgnoreCase(idProducto)){
                getListaProductos().remove(producto);
                break;
            }
        }
    }

    public void eliminarEmpleado(String cedula) {

        for (Empleado empleado : listaEmpleados){
            if (empleado.getCedula().equalsIgnoreCase(cedula)){
                getListaEmpleados().remove(empleado);
                break;
            }
        }
    }

    public void actualizarEmpleado(String cedula, String nombre, String apellido, int edad,String email, String cargo, double salario) {
        for (Empleado empleado : listaEmpleados){
            if (empleado.getCedula().equalsIgnoreCase(cedula)){
                empleado.setNombre(nombre);
                empleado.setApellido(apellido);
                empleado.setEdad(edad);
                empleado.setEmail(email);
                empleado.setCargo(cargo);
                empleado.setSalario(salario);
                break;
            }
        }
    }

    public void mostrarEmpleados(){
        List<Empleado> listaEmpleados = obtenerEmpleados();
        int tamanoLista = listaEmpleados.size();
        for (int i=0; i < tamanoLista; i++){
            Empleado empleado = listaEmpleados.get(i);
            System.out.println(empleado.toString());
        }
    }
}