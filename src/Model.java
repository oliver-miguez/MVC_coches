import java.util.ArrayList;

/**
 * Clase encargada de manejar los datos
 */
public class Model {
    static ArrayList<Coche> parking = new ArrayList<>();

    /**
     * Crea un coche y lo mete en el parking
     * @param modelo del coche
     * @param matricula identificador único
     * @return el coche creado
     */
    public static Coche crearCoche(String modelo, String matricula){
        Coche aux = new Coche(modelo, matricula);
        parking.add(aux);
        return aux;
    }

    /**
     * Busca coche según matrícula
     * @param matricula a buscar
     * @return chche o null si no existe
     */
    public static Coche getCoche(String matricula){
        Coche aux = null;
        // recorre el array buscando por matrícula
        for (Coche e: parking) {
            if (e.matricula.equals(matricula)) {
                aux = e;
            }
        }
        return aux;
    }

    /**
     * Cambia la velocidad de un coche
     * @param matricula
     * @param v nueva velocidad
     * @return velocidad modificada
     */
    public static int cambiarVelocidad(String matricula, Integer v) {
        Coche coche = getCoche(matricula);
        if (coche != null) {
            coche.velocidad = v;
            return coche.velocidad;
        } else {
            throw new IllegalArgumentException("Coche con matrícula " + matricula + " no encontrado.");
        }
    }


    /**
     * Ddevuelve la velocidad según la matrícula
     * @param matricula
     * @return
     */
    public static int getVelocidad(String matricula) {
        return getCoche(matricula).velocidad;
    }

    /**
     * Permite subir la velocidad
     * @param matricula del coche que se desea
     * @return velocidad del coche
     */
    public static int subirVelocidad(String matricula) {
        Coche coche = getCoche(matricula);
        if (coche != null) {
            coche.velocidad += 10; // Por ejemplo, aumentamos la velocidad en 10
            return coche.velocidad;
        } else {
            System.out.println("Coche no encontrado");
            return -1;
        }
    }

    /**
     * Reducir la velocidad del coche
     * @param matricula del coche
     * @return velocidad del coche
     */
    public static int bajarVelocidad(String matricula) {
        Coche coche = getCoche(matricula);
        if (coche != null) {
            coche.velocidad -= 10; // Por ejemplo, disminuimos la velocidad en 10
            return coche.velocidad;
        } else {
            System.out.println("Coche no encontrado");
            return -1;
        }
    }


}

