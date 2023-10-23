package programacion1.aritmetica;

import co.edu.uniquindio.aritmetica.model.Aritmetica;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AritmeticaTest {

    private Aritmetica aritmetica;

    @BeforeEach
    public void init(){
        aritmetica = new Aritmetica();
    }

    @Test
    public void sumaTest(){
        int resultado = aritmetica.sumarDosNumeros(5,5);
        int esperado = 10;
        assertEquals(resultado, esperado);
    }

    @Test
    public void restaTest(){
        int resultado = aritmetica.restarDosNumeros(20,10);
        int esperado = 5;
        assertTrue(esperado > resultado);
    }



}
