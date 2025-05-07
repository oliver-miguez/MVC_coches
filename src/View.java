import java.util.Scanner;

/**
 * Clase encargada de la interacción con el usuario
 */
public class View {
    /**
     * Menu inicial que dependiendo de la opción acceda a mecanicas del Controller
     */
    public static void menu() {
        System.out.println("1.crear coche");
        System.out.println("2.Cambiar velocidad");
        System.out.println("3.Mostrar velocidad");
        System.out.println("4.Salir");

        Scanner sc = new Scanner(System.in);
        System.out.println("Elige opcion");
        int op = sc.nextInt();

        if(op == 1 ){
            Controller.inicio(); //activa el metodo inicio del controller
        } else if (op == 0) {
            System.out.println("Cerrando");
        }
    }


    /**
     * Muestra la velocidad de un coche
     * @param matricula del coche
     * @param v velocidad
     * @return true si se ha mostrado correctamente
     */
    public static boolean muestraVelocidad(String matricula, Integer v){
        System.out.println(matricula + ": " + v + "km/hr");
        return true;
    }
}
