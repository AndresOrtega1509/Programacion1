package co.edu.uniquindio.fabricaMadera.dto;

import co.edu.uniquindio.fabricaMadera.enumeracion.TipoProducto;

import java.util.Date;

public record CrudDto(int promedioEdad,
                      int cantidadInventario,
                      double valorHoraExtra,
                      double salarioMayor,
                      double salarioMenor,
                      TipoProducto tipoProducto,
                      String cedula,
                      Date horaEntrada,
                      Date horaSalida,
                      String nombreEmpleado) {
}
