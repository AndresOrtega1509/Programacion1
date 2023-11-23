package co.edu.uniquindio.fabricaMadera.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Turno {
    private Date horaEntrada;
    private Date horaSalida;
    private long numeroHorasExtra;
    private double valorHoraExtra;
    private String codigo;
    private Empleado empleadoAsociado;
    Fabrica ownedByFabrica;

    /*Constructor*/

    public Turno() {
    }

    public Turno(Date horaEntrada, Date horaSalida, int numeroHorasExtra, double valorHoraExtra,String codigo) {
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.numeroHorasExtra = numeroHorasExtra;
        this.valorHoraExtra = valorHoraExtra;
        this.codigo = codigo;
    }

    /*Getters and setters*/

    public Date getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(Date horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public Date getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(Date horaSalida) {
        this.horaSalida = horaSalida;
    }

    public long getNumeroHorasExtra() {
        return numeroHorasExtra;
    }

    public void setNumeroHorasExtra(long numeroHorasExtra) {
        this.numeroHorasExtra = numeroHorasExtra;
    }

    public double getValorHoraExtra() {
        return valorHoraExtra;
    }

    public void setValorHoraExtra(double valorHoraExtra) {
        this.valorHoraExtra = valorHoraExtra;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Fabrica getOwnedByFabrica() {
        return ownedByFabrica;
    }

    public void setOwnedByFabrica(Fabrica ownedByFabrica) {
        this.ownedByFabrica = ownedByFabrica;
    }

    public Empleado getEmpleadoAsociado() {
        return empleadoAsociado;
    }

    public void setEmpleadoAsociado(Empleado empleadoAsociado) {
        this.empleadoAsociado = empleadoAsociado;
    }

    public long calcularDuracion() {
        long duracionMili = horaSalida.getTime() - horaEntrada.getTime();

        this.numeroHorasExtra = duracionMili;

        long horas = convertirMiliAHoras(duracionMili);

        setNumeroHorasExtra(horas);

        return duracionMili;
    }

    private long convertirMiliAHoras(long duracionMili) {

        long horas = 0;

        horas = duracionMili / 3600000;

        return horas;
    }

    public String obtenerInformacion() {

        String informacion = "";
        informacion = informacion +
                "Hora entrada: " + getHoraEntrada() + "\n" +
                "Hora salida: " + getHoraSalida() + "\n" +
                "Duración: " + getNumeroHorasExtra()+ "\n" +
                "Valor hora extra: " + getValorHoraExtra() + "\n" +
                "Codigo: " + getCodigo() + "\n" +
                "Empleado asociado: " + getEmpleadoAsociado();


        return informacion;
    }

    @Override
    public String toString() {
        return "Turno{" +
                "horaEntrada=" + horaEntrada +
                ", horaSalida=" + horaSalida +
                ", numeroHorasExtra=" + numeroHorasExtra +
                ", valorHoraExtra=" + valorHoraExtra +
                ", codigo='" + codigo + '\'' +
                ", empleadoAsociado=" + empleadoAsociado +
                '}';
    }

}
