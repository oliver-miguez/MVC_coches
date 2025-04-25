import java.util.ArrayList;
/**
 * Clase encargada de manejar los datos
 */
public class Model2 {
    /*
    Definimos como Static para que se asocie a toda la clase y no a un metodo independiente
    El array list es una lista dinámica que permite añadir elementos de cualquier tipo(clases ,arrays ...) aumentando o reduciendo
    su tamaño según se añadan o se quiten

    En este caso el ArrayList añadirá únicamente elementos que provengan de la clase de Coche2
    ¡ SOLO ACEPTARA OBJETOS Coche2 !
     */
    static ArrayList<Coche2> coches = new ArrayList<>();

    /**
     *En base a la clase Coche2 crea un metodo que creará un coche y lo añadirá al ArrayList
     * @param modelo modelo del coche
     * @param matricula matrícula del coche
     * @return el coche aux creado
     */
    public Coche2 crearCoche(String modelo, String matricula) {
        Coche2 aux = new Coche2(modelo, matricula); //crea un coche y le da como parámetros las propias variables del metodo
        coches.add(aux);//añade el coche creado al ArrayList
        return aux;//No solo añade al coche al array sino que también permite al usuario del metodo usar este nuevo objeto creado
    }

    /**
    Metodo creado especialmente para buscar un coche dentro del ArrayList según la matrícula proporcionada
     @param matricula para verificar si el coche está dentro del ArrayList
     */
    public Coche2 getCoche(String matricula) {
        Coche2 aux = null; //crea una variable para almacenar el objeto de tipo Coche2 que coincida con la matrícula, si no coincide devolverá un valor nulo
        // Recorre el array buscando por matrícula
        for (Coche2 e : coches) {
            if (e.matricula.equals(matricula)) { // si coincide que existe un coche con la misma matrícula proporcionada
                aux = e; //le da al objeto coche el mismo valor que el de la matrícula
            }
        }
        return aux;//devuelve el valor , null si no existe un coche con esa matrícula o "e"( el propio objeto coche)
    }

    /**
     * A través de la matrícula introducida busca según esta en el arrayList el coche que tenga la misma matrícula  y si este existe aplica a la propiedad
     * velocidad del coche (proveniente de la clase coche) al coche seleccionado del arrayList.
     * En caso de que no exista el coche la velocidad la mantiene en 0
     * @param matricula verificar la existencia de un coche en el arrayList
     * @param incremento cantidad de velocidad a aumentar en el coche
     * @return velocidad del coche
     */
    public int aumentarVelocidad(String matricula, int incremento) {
        Coche2 coche = getCoche(matricula); //busca el coche en el arrayList según la matrícula
        if (coche != null) {//si existe
            coche.velocidad += incremento; // Incrementa la velocidad
        }
        //si no existe
        return coche != null ? coche.velocidad : -1; // Retorna la nueva velocidad o 0 si no se encuentra el coche
    }

    /**
     * De igual manera que el metodo aumentarVelocidad, pero en vez de aumentar la velocidad la reduce
     * @param matricula  verificar la existencia de un coche en el arrayList
     * @param decremento cantidad de velocidad a disminuir en el coche
     * @return velocidad del coche
     */
    public int reducirVelocidad(String matricula, int decremento) {
        Coche2 coche = getCoche(matricula);
        if (coche != null) {
            coche.velocidad -= decremento; // Reduce la velocidad
            if (coche.velocidad < 0) {
                coche.velocidad = 0; // Evita velocidades negativas
            }
        }
        return coche != null ? coche.velocidad : -1; // Retorna la nueva velocidad o 0 si no se encuentra el coche
    }

    /**
     * Busca un coche en el arrayList a través de su matricula y guarda su valor de velocidad
     * @param matricula verifica el coche que deseamos seleccionar
     * @param v velocidad
     * @return velocidad
     */
    public int cambiarVelocidad(String matricula, Integer v) {
        // busca el coche
        getCoche(matricula).velocidad = v;
        // retorna la nueva velocidad
        return getCoche(matricula).velocidad;
    }


    public int getVelocidad(String matricula) {
        return getCoche(matricula).velocidad;
    }
}

