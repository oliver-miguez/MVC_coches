import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Model2Test {

    @Test
    @DisplayName("Aumentar Velocidad")
    public void aumentarVelocidadTest() {
        Model2 model = new Model2();
        Coche2 coche = model.crearCoche("Modelo1", "1234ABC");

        // Aumentar velocidad
        int nuevaVelocidad = model.aumentarVelocidad("1234ABC", 50);
        assertEquals(50, nuevaVelocidad, "La velocidad debería aumentar a 50");

        // Aumentar velocidad nuevamente
        nuevaVelocidad = model.aumentarVelocidad("1234ABC", 20);
        assertEquals(70, nuevaVelocidad, "La velocidad debería aumentar a 70");
    }

    @Test
    @DisplayName("Reducir Velocidad")
    public void reducirVelocidadTest() {
        Model2 model = new Model2();
        Coche2 coche = model.crearCoche("Modelo1", "1234ABC");

        // Establecer velocidad inicial
        model.aumentarVelocidad("1234ABC", 50);

        // Reducir velocidad
        int nuevaVelocidad = model.reducirVelocidad("1234ABC", 20);
        assertEquals(30, nuevaVelocidad, "La velocidad debería reducirse a 30");

        // Reducir velocidad nuevamente, por debajo de 0
        nuevaVelocidad = model.reducirVelocidad("1234ABC", 40);
        assertEquals(0, nuevaVelocidad, "La velocidad no debería ser menor que 0");
    }

}
