package co.edu.uniquindio.fabricaMadera.model;

import co.edu.uniquindio.fabricaMadera.enumeracion.TipoProducto;
import co.edu.uniquindio.fabricaMadera.services.IFabrica;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Fabrica implements IFabrica {

    private String nombre;
    private String direccion;
    List<Empleado> listaEmpleados = new ArrayList<>();
    List<Inventario> listaInventario = new ArrayList<>();
    List<Producto> listaProductos = new ArrayList<>();
    List<Turno> listaTurnos = new ArrayList<>();
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

    public List<Turno> getListaTurnos() {
        return listaTurnos;
    }

    public void setListaTurnos(List<Turno> listaTurnos) {
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
     * @param email
     * @param cargo
     * @param salario
     */
    @Override
    public void crearEmpleado(String nombre, String apellido, int edad, String cedula, String email, String cargo, double salario) {
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
     * Metodo para crear un producto
     * @param tipoProducto
     * @param idProducto
     * @param precio
     */

    @Override
    public void crearProducto(TipoProducto tipoProducto, String idProducto, double precio) {
        int resultadoBusqueda = devolverPosicionProducto(idProducto);
        if (resultadoBusqueda == -1) {
            Producto producto = new Producto();
            producto.setTipoProducto(tipoProducto);
            producto.setIdProducto(idProducto);
            producto.setPrecio(precio);
            getListaProductos().add(producto);
            System.out.println("Producto creado exitosamente");

        } else {
            System.out.println("El producto ya esta creado en el sistema");
        }
    }

    /**
     * Metodo para crear el inventario
     * @param tipoProducto
     * @param cantidad
     * @param ubicacion
     * @param responsable
     * @param codigoReferencia
     */
    @Override
    public void crearInventario(TipoProducto tipoProducto, int cantidad, String ubicacion, String responsable, String codigoReferencia) {
        int resultadoBusqueda = devolverPosicionInventario(codigoReferencia);
        if (resultadoBusqueda == -1) {
            Inventario inventario = new Inventario();
            inventario.setTipoProducto(tipoProducto);
            inventario.setCantidad(cantidad);
            inventario.setUbicacion(ubicacion);
            inventario.setResponsable(responsable);
            inventario.setCodigoReferencia(codigoReferencia);
            getListaInventario().add(inventario);
            System.out.println("Inventario creado exitosamente");

        } else {
            System.out.println("El inventario ya esta creado en el sistema");
        }
    }

    /**
     * Metodo para crear un turno
     * @param cedula
     * @param horaEntrada
     * @param horaSalida
     * @param valorHoraExtra
     * @param codigo
     */
    @Override
    public void crearTurno(String cedula, Date horaEntrada, Date horaSalida, double valorHoraExtra, String codigo) {
        int resultadoBusqueda = devolverPosicionTurno(codigo);
        if (resultadoBusqueda == -1) {
            Turno turno = new Turno();
            turno.setHoraEntrada(horaEntrada);
            turno.setHoraSalida(horaSalida);
            turno.calcularDuracion();
            turno.setValorHoraExtra(valorHoraExtra);
            turno.setCodigo(codigo);
            Empleado empleado = obtenerEmpleado(cedula);

            if (empleado != null){
                turno.setEmpleadoAsociado(empleado);
            }
            getListaTurnos().add(turno);
            System.out.println("Turno creado exitosamente");

        } else {
            System.out.println("El turno ya esta creado en el sistema");
        }
    }

    /**
     * Metodo para obtener la lista de los productos
     * @return List<Producto>
     */
    @Override
    public List<Producto> obteneProductos() {
        return getListaProductos();
    }

    /**
     * Metodo que permite obtener la lista de los empleados
     * @return List<Empleado>
     */
    @Override
    public List<Empleado> obtenerEmpleados() {
        return getListaEmpleados();
    }

    /**
     * Metodo que permite obtener la lista del inventario
     * @return List<Inventario>
     */
    @Override
    public List<Inventario> obtenerInventario() {
        return listaInventario;
    }

    /**
     * Metodo que permite obtener la lista de los turnos
     * @return List<Turno>
     */
    @Override
    public List<Turno> obtenerTurnos() {
        return getListaTurnos();
    }

    /**
     * Metodo para verificar si el empleado ya esta creado de acuerdo a la cedula
     * @param cedula
     * @return int
     */
    private int devolverPosicionEmpleado(String cedula) {
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
     * Metodo para verificar si el empleado ya esta creado de acuerdo al idProducto
     * @param idProducto
     * @return int
     */
    private int devolverPosicionProducto(String idProducto) {
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
     * Metodo que verifica si un inventario ya existe de acuerdo al codigo de referencia
     * @param codigoReferencia
     * @return int
     */
    private int devolverPosicionInventario(String codigoReferencia) {

        int posicion = -1;
        boolean bandera = false;
        for (int i = 0; i < listaInventario.size() && bandera == false; i++) {
            if (listaInventario.get(i).getCodigoReferencia().equalsIgnoreCase(codigoReferencia)) {
                bandera = true;
                posicion = i;
            }
        }
        return posicion;
    }



    /**
     * Metodo que verifica si un turno ya existe de acuerdo al codigo
     * @param codigo
     * @return int
     */
    private int devolverPosicionTurno(String codigo) {

        int posicion = -1;
        boolean bandera = false;
        for (int i = 0; i < listaTurnos.size() && bandera == false; i++) {
            if (listaTurnos.get(i).getCodigo().equalsIgnoreCase(codigo)) {
                bandera = true;
                posicion = i;
            }
        }
        return posicion;
    }

    /**
     * Metodo para actualizar un producto
     * @param idProducto
     * @param nuevoProducto
     * @param nuevoPrecio
     */
    @Override
    public void actualizarProducto(String idProducto, TipoProducto nuevoProducto, double nuevoPrecio) {
        for (Producto producto : listaProductos){
            if (producto.getIdProducto().equals(idProducto)){
                producto.setTipoProducto(nuevoProducto);
                producto.setPrecio(nuevoPrecio);
                break;
            }
        }
    }

    /**
     * Metodo para actualizar un empleado
     * @param cedula
     * @param nombre
     * @param apellido
     * @param edad
     * @param email
     * @param cargo
     * @param salario
     */
    @Override
    public void actualizarEmpleado(String cedula, String nombre, String apellido, int edad, String email, String cargo, double salario) {

        for(Empleado empleado : listaEmpleados){
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

    /**
     * Metodo para actualizar un turno
     * @param codigo
     * @param horaEntrada
     * @param horaSalida
     * @param valorHoraExtra
     */

    @Override
    public void actualizarTurno(String codigo, Date horaEntrada, Date horaSalida, double valorHoraExtra) {

        for(Turno turno : listaTurnos){
            if (turno.getCodigo().equalsIgnoreCase(codigo)){
                turno.setHoraEntrada(horaEntrada);
                turno.setHoraSalida(horaSalida);
                turno.setValorHoraExtra(valorHoraExtra);
                break;
            }
        }
    }

    /**
     * Metodo para actualizar un inventario
     * @param codigoReferencia
     * @param nuevoTipoProducto
     * @param nuevaCantidad
     * @param nuevaUbicacion
     * @param nuevoResponsable
     */
    @Override
    public void actualizarInventario(String codigoReferencia, TipoProducto nuevoTipoProducto, int nuevaCantidad, String nuevaUbicacion, String nuevoResponsable) {

        for(Inventario inventario : listaInventario){
            if (inventario.getCodigoReferencia().equalsIgnoreCase(codigoReferencia)){
                inventario.setTipoProducto(nuevoTipoProducto);
                inventario.setCantidad(nuevaCantidad);
                inventario.setUbicacion(nuevaUbicacion);
                inventario.setResponsable(nuevoResponsable);
                break;
            }
        }
    }

    /**
     * Metodo para eliminar un producto
     * @param idProducto
     */
    @Override
    public void eliminarProducto(String idProducto, String confirmacion) {
        for(Producto producto : listaProductos){
            if (producto.getIdProducto().equalsIgnoreCase(idProducto) && confirmacion.equalsIgnoreCase("si")){
                getListaProductos().remove(producto);
                break;
            }
        }
    }

    /**
     * Metodo para eliminar un empleado
     * @param cedula
     */
    @Override
    public void eliminarEmpleado(String cedula, String confirmacion) {
        for(Empleado empleado : listaEmpleados){
            if (empleado.getCedula().equalsIgnoreCase(cedula) && confirmacion.equalsIgnoreCase("si")){
                getListaEmpleados().remove(empleado);
                break;
            }
        }
    }

    /**
     * Metodo para eliminar un inventario
     * @param codigoReferencia
     */
    @Override
    public void eliminarInventario(String codigoReferencia, String confirmacion) {

        for(Inventario inventario : listaInventario){
            if (inventario.getCodigoReferencia().equalsIgnoreCase(codigoReferencia) && confirmacion.equalsIgnoreCase("si")){
                getListaInventario().remove(inventario);
                break;
            }
        }
    }

    /**
     * Metodo para eliminar el inventario por la cantidad de productos
     * @param cantidad
     */
    public void eliminarInventario(int cantidad, String confirmacion) {

        for(Inventario inventario : listaInventario){
            if (inventario.getCantidad() == cantidad && confirmacion.equalsIgnoreCase("si")){
                getListaInventario().remove(inventario);
                break;
            }
        }
    }

    /**
     * Metodo para eliminar un turno
     * @param codigo
     */
    @Override
    public void eliminarTurno(String codigo, String confirmacion) {
        for(Turno turno : listaTurnos){
            if (turno.getCodigo().equalsIgnoreCase(codigo) && confirmacion.equalsIgnoreCase("si")){
                getListaTurnos().remove(turno);
                break;
            }
        }
    }

    /**
     * Metodo para mostrar los productos de la lista
     */
    @Override
    public void mostrarProductos() {
        List<Producto> listaProductos = obteneProductos();
        int tamanoLista = listaProductos.size();
        for (int i=0; i < tamanoLista; i++){
            Producto producto = listaProductos.get(i);
            System.out.println(producto.toString());
        }

    }

    /**
     * Metodo para mostrar los empleados de la lista
     */
    @Override
    public void mostrarEmpleados() {
        List<Empleado> listaEmpleados = obtenerEmpleados();
        int tamanoLista = listaEmpleados.size();
        for (int i=0; i < tamanoLista; i++){
            Empleado empleado = listaEmpleados.get(i);
            System.out.println(empleado.obtenerInformacion());
        }

    }

    /**
     * Metodo para mostrar el inventario de la lista
     */
    @Override
    public void mostrarInventario() {
        List<Inventario> listaInventario = obtenerInventario();
        int tamanoLista = listaInventario.size();
        for (int i=0; i < tamanoLista; i++){
            Inventario inventario = listaInventario.get(i);
            System.out.println(inventario.toString());
        }
    }

    /**
     * Metodo para mostrar el turno de la lista
     */
    @Override
    public void mostrarTurno() {
        List<Turno> listaTurnos = obtenerTurnos();
        int tamanoLista = listaTurnos.size();
        for (int i=0; i < tamanoLista; i++){
            Turno turno = listaTurnos.get(i);
            System.out.println(turno.obtenerInformacion());
        }
    }

    @Override
    public void consultarProducto(String idProducto) {
        String tipoProducto = "";
        for (Producto producto: listaProductos) {
            if (producto.getIdProducto().equalsIgnoreCase(idProducto)){
                tipoProducto = producto.obtenerInformacion();
            }
        }
        System.out.println(tipoProducto);

    }

    @Override
    public void consultarEmpleado(String cedulaEmpleado) {
        String empleadoEncontrado = "";
        for (Empleado empleado : listaEmpleados) {
            if (empleado.getCedula().equalsIgnoreCase(cedulaEmpleado)){
                empleadoEncontrado = empleado.obtenerInformacion();
            }
        }
        System.out.println(empleadoEncontrado);
    }

    @Override
    public void consultarInventario(String codigoReferencia) {
        String inventarioEncontrado = "";
        for (Inventario inventario : listaInventario) {
            if (inventario.getCodigoReferencia().equalsIgnoreCase(codigoReferencia)){
                inventarioEncontrado = inventario.obtenerInformacion();
            }
        }
        System.out.println(inventarioEncontrado);
    }

    @Override
    public void consultarTurno(String codigo) {
        String turnoEncontrado = "";
        for (Turno turno: listaTurnos) {
            if (turno.getCodigo().equalsIgnoreCase(codigo)){
                turnoEncontrado = turno.obtenerInformacion();
            }
        }
        System.out.println(turnoEncontrado);
    }

    /**
     * Metodo para verificar si un empleado ya existe para realizar la transacción
     * @param cedula
     * @return Empleado
     */
    private Empleado obtenerEmpleado(String cedula) {

        Empleado empleadoEncontrado = null;
        for (Empleado empleado : getListaEmpleados()) {
            if (empleado.getCedula().equals(cedula)) {
                empleadoEncontrado = empleado;
                break;
            }
        }
        return empleadoEncontrado;
    }

    /**
     * Metodo para obtener el promedio de edad de los empleados
     */

    @Override
    public void obtenerPromedioEdad() {
        int sumaEdades = 0;
        int promedio = 0;

        for (Empleado empleado : listaEmpleados) {
            sumaEdades += empleado.getEdad();
        }
        promedio = sumaEdades / getListaEmpleados().size();

        System.out.println("El promedio de edad de los empleados es: " + promedio);

    }

    /**
     * Metodo para obtener el salario mayor de los empleados
     */
    @Override
    public void obtenerSalarioMayor() {
        double salarioMayor = getListaEmpleados().get(0).getSalario();

        for (int i = 0; i < getListaEmpleados().size(); i++){
            if (getListaEmpleados().get(i).getSalario() > salarioMayor){
                salarioMayor = getListaEmpleados().get(i).getSalario();

            }
        }
        System.out.println("El salario mayor es de: " + salarioMayor);
    }

    /**
     * Metodo para obtener el salario menor de los empleados
     */
    @Override
    public void obtenerSalarioMenor() {
        double salarioMenor = getListaEmpleados().get(0).getSalario();

        for (int i = 0; i < getListaEmpleados().size(); i++){
            if (getListaEmpleados().get(i).getSalario() < salarioMenor){
                salarioMenor = getListaEmpleados().get(i).getSalario();

            }
        }
        System.out.println("El salario mayor es de: " + salarioMenor);
    }

    /**
     * Metodo para obtener el producto de menor precio
     * @return TipoProducto
     */
    @Override
    public void obtenerProductoMenorPrecio() {
        double precio = getListaProductos().get(0).getPrecio();
        TipoProducto productoMenorPrecio = null;

        for (Producto producto : listaProductos) {
            if (producto.getPrecio() < precio){
                precio = producto.getPrecio();
                productoMenorPrecio = producto.getTipoProducto();
            }
        }
        System.out.println("El tipo de producto con menor precio es: "+ productoMenorPrecio);
    }

    /**
     * Metodo para mostrar la informacion del primer producto
     */
    @Override
    public void mostrarInformacionPrimerProducto() {
        Producto primerProducto = getListaProductos().get(0);
        System.out.println("Informacion del primer producto: " + primerProducto.obtenerInformacion());

    }

    /**
     * Metodo para obtener el producto que cuenta con mayor cantidad de acuerdo al inventario
     * @return String
     */
    @Override
    public void obtenerProductoMayorCantidadInventario() {
        int cantidadMayor = listaInventario.get(0).getCantidad();
        String productoMayor = "";

        for (Inventario inventario : getListaInventario()) {
            if (inventario.getCantidad() > cantidadMayor) {
                cantidadMayor = inventario.getCantidad();
                productoMayor = String.valueOf(inventario.getTipoProducto());
            }
        }

        System.out.println("El producto con menor cantidad en el inventario es: " + productoMayor);
    }

    /**
     * Metodo para calcular el total de horas extra del primer empleado
     */
    @Override
    public void calcularValorHorasExtraPrimerEmpleado() {
        long duracion = listaTurnos.get(0).getNumeroHorasExtra();
        double valorHoraExtra = listaTurnos.get(0).getValorHoraExtra();
        long preciototal = 0;

        preciototal = (long) (valorHoraExtra * duracion);

        System.out.println("El valor total de las horas extra son: " + preciototal);

    }

}