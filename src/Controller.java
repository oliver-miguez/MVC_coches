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

    /**
     * Cambiar velocidad
     * @param matricula del coche creado
     * @param velocidad del coche creado
     * @return el valor de la velocidad que introducimos
     */
    public static int cambiarVelocidad(String matricula, int velocidad){
        int cocheVel = Model.cambiarVelocidad(matricula,velocidad);
        return cocheVel;
    }

}