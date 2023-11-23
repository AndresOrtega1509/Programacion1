package co.edu.uniquindio.fabrica.test;

import co.edu.uniquindio.fabricaMadera.dto.CrudDto;
import co.edu.uniquindio.fabricaMadera.model.Fabrica;
import co.edu.uniquindio.fabricaMadera.enumeracion.TipoProducto;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class CrudTest {

    CrudDto crudDto;
    Fabrica fabrica;

    @BeforeEach
    public void init() {
        crudDto = new CrudDto(21, 20, 15000,
                3000000, 1000000, TipoProducto.SILLA, "1016894385",
                new Date(2023, 5, 10,13,32),
                new Date(2023, 5, 10, 22, 5), "Andres");}

    @Test
    void promedioEdadTest(){
        int esperado = 20;
        int actual = crudDto.promedioEdad();
        assertTrue(actual > esperado);

    }

    @Test
    void cantidadInventario(){
        int esperado = 25;
        int cantidadInventario = crudDto.cantidadInventario();
        assertEquals(esperado, cantidadInventario);
    }

    @Test
    void horaExtraTest(){
        double valorEsperado = 20000;
        double valorHoraExtra = crudDto.valorHoraExtra();
        assertFalse(valorEsperado < valorHoraExtra);
    }

    @Test
    void salarioMayorTest(){
        double valorEsperado = 3000000;
        double salarioMayor = crudDto.salarioMayor();
        assertTrue(valorEsperado >= salarioMayor);
    }

    @Test
    void salarioMenorTest(){
        double salarioEsperado = 1000000;
        double salarioMenor = crudDto.salarioMenor();
        assertEquals(salarioEsperado, salarioMenor);
    }

    @Test
    void tipoProductoTest(){
        TipoProducto tipoProductoEsperado = TipoProducto.PUERTA;
        TipoProducto tipoProducto = crudDto.tipoProducto();
        assertFalse(tipoProductoEsperado != tipoProducto);
    }

    @Test
    void cedulaEmpleadoTest(){
        String cedulaEsperada = "1016894385";
        String cedulaEmpleado = crudDto.cedula();
        assertEquals(cedulaEsperada, cedulaEmpleado);
    }

    @Test
    void fechaEntradaTest(){
        Date fechaEsperaEntrada = new Date(2023, 5, 10,13,32);
        Date fechaEntrada = crudDto.horaEntrada();
        assertEquals(fechaEsperaEntrada, fechaEntrada);

    }

    @Test
    void fechaSalidaTest(){
        Date fechaEsperadaSalida = new Date(2023, 5, 10,20,32);
        Date fechaSalida = crudDto.horaSalida();
        assertTrue(!fechaEsperadaSalida.equals(fechaSalida));
    }

    @Test
    void nombreEmpleadoTest(){
        String nombreEsperado = "Carlos";
        String nombreEmpleado = crudDto.nombreEmpleado();
        assertEquals(nombreEsperado, nombreEmpleado);
    }
}
