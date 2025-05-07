import java.lang.module.ModuleDescriptor;

public class Controller {
    /**
     * Crea el coche
     * @return Valor de la matrícula del coche
     */
    public static String crearCoche(String modelo, String matricula) {
        Coche coche = Model.crearCoche(modelo,matricula); //crea un coche

        return coche.matricula;

    }
}