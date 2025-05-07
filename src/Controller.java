import java.lang.module.ModuleDescriptor;

public class Controller {
    /**
     * Crea el coche
     * @return Valor de la matrícula del coche
     */
    public static String crearCoche(String modelo, String matricula) {
        //Usando los metodos del Model de manera estática, a diferencia que de la otra manera que los instanciábamos
        Coche coche = Model.crearCoche(modelo,matricula);
        Coche coche2 = Model.getCoche(coche.matricula);//devuelve la identificación de la matricula del coche que buscamos

        return coche2.matricula;

    }
}