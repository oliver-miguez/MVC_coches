import java.util.Scanner;

/**
 * Clase encargada de la interacción con el usuario
 */
public class View {
    /**
     * Menu inicial que dependiendo de la opción acceda a mecanicas del Controller
     */
    public static void menu() {
        Scanner sc = new Scanner(System.in);
        int op;
        do {
            // Mostrar menú
            System.out.println("\nMenú:");
            System.out.println("1. Ingresar datos del coche");
            System.out.println("2. Cambiar velocidad");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            op = sc.nextInt(); // Leer opción

            // Procesar opción
            if (op == 1) {
                System.out.println("Los datos del coche son los siguientes: " + Controller.crearCoche(obtenerModelo(), obtenerMatricula()));
            } else if (op == 2) {
                System.out.println("La nueva velocidad es: "+ Controller.cambiarVelocidad(obtenerMatricula(),obtenerVelocidad()));
            } else if (op == 0) {
                System.out.println("Cerrando el programa...");
            } else {
                System.out.println("Opción no válida, intente de nuevo.");
            }

        } while (op != 0); // Continuar mientras el usuario no elija salir

        sc.close(); // Cerrar el scanner al final del programa
    }

    /**
     * Pregunta y almacena la matrícula introducida
     * @return valor de la matricula
     */
    public static String obtenerMatricula(){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Cual es la matricula: ");
        String matricula = sc.next();

        return matricula;
    }

    /**
     * Pregunta y almacena el modelo introducido
     * @return valor del modelo
     */
    public static String obtenerModelo(){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Cual es su modelo: ");
        String modelo = sc.next();

        return modelo;
    }

    /**
     * Pregunta y almacena el modelo introducido
     * @return valor  de la velocidad
     */
    public static int obtenerVelocidad(){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Cual es su velocidad: ");
        int velocidad = sc.nextInt();

        return velocidad;
    }


}
