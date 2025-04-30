import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ModelTest {

    @Test
    @DisplayName("getCoche")
    public void getCocheTest() {
        Coche coche = Model.crearCoche("Modelo1", "1234ABC");

        assertEquals("Modelo1",coche.modelo);
        assertNotEquals(null,coche.modelo);
    }

    @Test
    @DisplayName("Crear coche")
    public void crearCocheTest(){

        assertEquals("1234ABC", Model.crearCoche("Modelo1", "1234ABC").matricula);
        assertNotEquals(null,Model.crearCoche("Modelo1", "1234ABC").matricula);
        assertEquals("Modelo1", Model.crearCoche("Modelo1", "1234ABC").modelo);
        assertNotEquals(null,Model.crearCoche("Modelo1", "1234ABC").modelo);
    }

    @Test
    @DisplayName("Cambiar Velocidad")
    public void cambiarVelocidadTest(){
        Coche coche = Model.crearCoche("Modelo1", "1234ABC");
        int velocidad = Model.cambiarVelocidad(coche.matricula,1);

        assertEquals(1,coche.velocidad);
        assertNotEquals(0 , coche.velocidad);
    }

}