import java.lang.module.ModuleDescriptor;

public class Controller {
    public static void inicio() {
        //Usando los metodos del Model de manera estática, a diferencia que de la otra manera que los instanciábamos
        Coche coche = Model.getCoche("qwer");
        View.muestraVelocidad(coche.matricula, 1);
    }
}