import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ModelTest {

    @Test
    @DisplayName("getCoche")
    public void getCocheTest() {
        Model model = new Model();
        Coche coche = model.crearCoche("Modelo1", "1234ABC");

        assertEquals("Modelo1", model.getCoche("1234ABC").modelo);
        assertNotEquals(null,model.getCoche("1234ABC").modelo);
        assertEquals("1234ABC",model.getCoche("1234ABC").matricula);
        assertNotEquals(null,model.getCoche("1234ABC").matricula);
    }

    @Test
    @DisplayName("Crear coche")
    public void crearCocheTest(){
        Model model = new Model();

        assertEquals("1234ABC", model.crearCoche("Modelo1", "1234ABC").matricula);
        assertNotEquals(null,model.crearCoche("Modelo1", "1234ABC").matricula);
        assertEquals("Modelo1", model.crearCoche("Modelo1", "1234ABC").modelo);
        assertNotEquals(null,model.crearCoche("Modelo1", "1234ABC").modelo);
    }

    @Test
    @DisplayName("Cambiar Velocidad")
    public void cambiarVelocidadTest(){
        Model model = new Model();
        Coche coche = model.crearCoche("Modelo1", "1234ABC");
        int velocidad = model.cambiarVelocidad(coche.matricula,1);

        assertEquals(1,model.getVelocidad("1234ABC"));
        assertNotEquals(0 , model.getVelocidad("1234ABC"));
    }

}