import java.lang.module.ModuleDescriptor;

public class Controller {
    public static void inicio() {
        //Usando los metodos del Model de manera estática, a diferencia que de la otra manera que los instanciábamos
        Coche coche = Model.crearCoche("qwer","qwer1");
        Coche coche2 = Model.getCoche(coche.matricula);//devuelve la identificación de la matricula del coche que buscamos
        System.out.println(coche2.matricula); //muestra la matricula
        System.out.println("coche creado");
    }
}