package cl.duoc.calculadora_api;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraControllerTest {

    CalculadoraController controller = new CalculadoraController();

    @Test
    void testHealth() {
        assertEquals("OK", controller.health());
    }

    @Test
    void testSuma() {
        assertEquals(8, controller.suma(5, 3));
    }

    @Test
    void testResta() {
        assertEquals(2, controller.resta(5, 3));
    }
}