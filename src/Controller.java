import java.lang.module.ModuleDescriptor;

/**
 * Clase que controla en funcionamiento del programa
 */
public class Controller {
    /**
     * Crea el coche
     * @return Valor de la matrícula del coche
     */
    public static String crearCoche(String modelo, String matricula) {
        Coche coche = Model.crearCoche(modelo,matricula); //crea un coche

        return coche.modelo + " " + coche.matricula;

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

    /**
     * Aumenta en 10 la velocidad del vehiculo
     * @param matricula del coche seleccionado
     * @return la nueva velocidad
     */
    public static int subirVelocidad(String matricula){
        int aumentarVel = Model.subirVelocidad(matricula);
        return aumentarVel;

    }

    /**
     * Reduce en 10 la velocidad del vehiculo
     * @param matricula del coche seleccionado
     * @return la nueva velocidad
     */
    public static int bajarVelocidad(String matricula){
        int reducirVel = Model.bajarVelocidad(matricula);
        return reducirVel;

    }

    /**
     * Devuelve el coche deseado según la matrícula
     * @param matricula del coche que buscamos
     * @return los datos del coche
     */
    public static String mostrarCoches(String matricula){
        Coche coche = Model.getCoche(matricula);
        return " SModelo: "+coche.modelo + " Matricula: "+ coche.matricula + " Velocidad: " +coche.velocidad;
    }


}