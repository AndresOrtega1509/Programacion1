package co.edu.uniquindio.fabricaMadera.model;

public class Fabrica {

    private String nombre;
    private String direccion;
    private Empleado empleado1;
    private Empleado empleado2;
    private Empleado empleado3;
    private Empleado empleado4;
    private Empleado empleado5;
    private Inventario tronco1;
    private Inventario tronco2;
    private Inventario tronco3;
    private Inventario tronco4;
    private Inventario tronco5;

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

    public Empleado getEmpleado1() {
        return empleado1;
    }

    public void setEmpleado1(Empleado empleado1) {
        this.empleado1 = empleado1;
    }

    public Empleado getEmpleado2() {
        return empleado2;
    }

    public void setEmpleado2(Empleado empleado2) {
        this.empleado2 = empleado2;
    }

    public Empleado getEmpleado3() {
        return empleado3;
    }

    public void setEmpleado3(Empleado empleado3) {
        this.empleado3 = empleado3;
    }

    public Empleado getEmpleado4() {
        return empleado4;
    }

    public void setEmpleado4(Empleado empleado4) {
        this.empleado4 = empleado4;
    }

    public Empleado getEmpleado5() {
        return empleado5;
    }

    public void setEmpleado5(Empleado empleado5) {
        this.empleado5 = empleado5;
    }

    public Inventario getTronco1() {
        return tronco1;
    }

    public void setTronco1(Inventario tronco1) {
        this.tronco1 = tronco1;
    }

    public Inventario getTronco2() {
        return tronco2;
    }

    public void setTronco2(Inventario tronco2) {
        this.tronco2 = tronco2;
    }

    public Inventario getTronco3() {
        return tronco3;
    }

    public void setTronco3(Inventario tronco3) {
        this.tronco3 = tronco3;
    }

    public Inventario getTronco4() {
        return tronco4;
    }

    public void setTronco4(Inventario tronco4) {
        this.tronco4 = tronco4;
    }

    public Inventario getTronco5() {
        return tronco5;
    }

    public void setTronco5(Inventario tronco5) {
        this.tronco5 = tronco5;
    }

    public double obtenerSalarioMayor() {

        double salarioMayor = 0.0;

        if (empleado1.getSalario() > empleado2.getSalario() && empleado1.getSalario() > empleado3.getSalario() && empleado1.getSalario() > empleado4.getSalario() && empleado1.getSalario() > empleado5.getSalario()) {
            salarioMayor = empleado1.getSalario();

        } else if (empleado2.getSalario() > empleado1.getSalario() && empleado2.getSalario() > empleado3.getSalario() && empleado2.getSalario() > empleado4.getSalario() && empleado2.getSalario() > empleado5.getSalario()) {
            salarioMayor = empleado2.getSalario();

        } else if (empleado3.getSalario() > empleado1.getSalario() && empleado3.getSalario() > empleado2.getSalario() && empleado3.getSalario() > empleado4.getSalario() && empleado3.getSalario() > empleado5.getSalario()) {
            salarioMayor = empleado3.getSalario();

        } else if (empleado4.getSalario() > empleado1.getSalario() && empleado4.getSalario() > empleado2.getSalario() && empleado4.getSalario() > empleado3.getSalario() && empleado4.getSalario() > empleado5.getSalario()) {

            salarioMayor = empleado4.getSalario();
        } else
            salarioMayor = empleado5.getSalario();

        return salarioMayor;
    }

    public int obtenerPromedioEdad() {

        int promedioEdad = 0;

        promedioEdad = (empleado1.getEdad() + empleado2.getEdad() + empleado3.getEdad() + empleado4.getEdad() + empleado5.getEdad()) / 5;

        return promedioEdad;
    }

    public void mostrarInformacionEmpleados() {

        String informacionEmpleado1 = getEmpleado1().obtenerInformacion();
        String informacionEmpleado2 = getEmpleado2().obtenerInformacion();
        String informacionEmpleado3 = getEmpleado3().obtenerInformacion();
        String informacionEmpleado4 = getEmpleado4().obtenerInformacion();
        String informacionEmpleado5 = getEmpleado5().obtenerInformacion();

        System.out.println("La informacion del empleado 1 es: " + informacionEmpleado1);
        System.out.println("La informacion del empleado 2 es: " + informacionEmpleado2);
        System.out.println("La informacion del empleado 3 es: " + informacionEmpleado3);
        System.out.println("La informacion del empleado 4 es: " + informacionEmpleado4);
        System.out.println("La informacion del empleado 5 es: " + informacionEmpleado5);
    }


    public int obtenerCantinadadTroncosMasRecientes() {

        int troncosRecientes = 0;

        if (tronco1.getFechaRecepcion() == 2023) {
            troncosRecientes = troncosRecientes + 1;
        }
        if (tronco2.getFechaRecepcion() == 2023) {
            troncosRecientes = troncosRecientes + 1;
        }
        if (tronco3.getFechaRecepcion() == 2023) {
            troncosRecientes = troncosRecientes + 1;
        }
        if (tronco4.getFechaRecepcion() == 2023) {
            troncosRecientes = troncosRecientes + 1;
        }
        if (tronco5.getFechaRecepcion() == 2023) {
            troncosRecientes = troncosRecientes + 1;
        } else
            troncosRecientes = troncosRecientes;

        return troncosRecientes;
    }

    public void mostrarInformacionTronco4() {

        String informacionTronco4 = getTronco4().obtenerInformacionTronco4();

        System.out.println("La informacion del tronco 4 es: " + informacionTronco4);

    }

    public String obtenerTroncoMenorPeso() {
        String troncoMenorPeso = "";

        if (tronco1.getPeso() < tronco2.getPeso() && tronco1.getPeso() < tronco3.getPeso() && tronco1.getPeso() < tronco4.getPeso() && tronco1.getPeso() < tronco5.getPeso()) {
            troncoMenorPeso = "Tronco 1";

        } else if (tronco2.getPeso() < tronco1.getPeso() && tronco2.getPeso() < tronco3.getPeso() && tronco2.getPeso() < tronco4.getPeso() && tronco2.getPeso() < tronco5.getPeso()) {
            troncoMenorPeso = "Tronco 2";

        } else if (tronco3.getPeso() < tronco1.getPeso() && tronco3.getPeso() < tronco2.getPeso() && tronco3.getPeso() < tronco4.getPeso() && tronco3.getPeso() < tronco5.getPeso()) {
            troncoMenorPeso = "Tronco 3";

        } else if (tronco4.getPeso() < tronco1.getPeso() && tronco4.getPeso() < tronco2.getPeso() && tronco4.getPeso() < tronco3.getPeso() && tronco4.getPeso() < tronco5.getPeso()) {
            troncoMenorPeso = "Tronco 4";

        } else if (tronco5.getPeso() < tronco1.getPeso() && tronco5.getPeso() < tronco2.getPeso() && tronco5.getPeso() < tronco3.getPeso() && tronco5.getPeso() < tronco4.getPeso()) {
            troncoMenorPeso = "Tronco 5";
        } else
            troncoMenorPeso = "Ninguno";

        return troncoMenorPeso;
    }

}