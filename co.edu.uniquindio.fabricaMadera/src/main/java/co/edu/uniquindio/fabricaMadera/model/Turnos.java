package co.edu.uniquindio.fabricaMadera.model;

public class Turnos {
    private String horaEntrada;
    private String horaSalida;
    private String horaExtra;
    Fabrica ownedByFabrica;

    /*Constructor*/

    public Turnos() {
    }

    public Turnos(String horaEntrada, String horaSalida, String horaExtra) {
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.horaExtra = horaExtra;
    }

    /*Getters and setters*/

    public String getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public String getHoraExtra() {
        return horaExtra;
    }

    public void setHoraExtra(String horaExtra) {
        this.horaExtra = horaExtra;
    }

    public Fabrica getOwnedByFabrica() {
        return ownedByFabrica;
    }

    public void setOwnedByFabrica(Fabrica ownedByFabrica) {
        this.ownedByFabrica = ownedByFabrica;
    }
}
