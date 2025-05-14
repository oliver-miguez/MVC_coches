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
            System.out.println("3. Aumentar velocidad");
            System.out.println("4. Reducir velocidad");
            System.out.println("5. Mostrar coche");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            op = sc.nextInt(); // Leer opción

            // Procesar opción
            if (op == 1) {
                crearCoche();
            } else if (op == 2) {
                cambiarVelocidad();
            }else if(op == 3){
                subirVelocidad();
            } else if (op == 4) {
                bajarVelocidad();
            } else if (op == 5) {
                mostrarCoche();
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
     * @return valor de la velocidad
     */
    public static int obtenerVelocidad(){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Cual es su velocidad: ");
        int velocidad = sc.nextInt();

        return velocidad;
    }

    /**
     * Crea el coche
     * @return un texto y los datos del coche creado
     */
    public static void crearCoche(){
        System.out.println(Controller.crearCoche(obtenerModelo(),obtenerMatricula()));
    }

    /**
     * Cambia la velocidad del coche y la muestra
     */
    public static void cambiarVelocidad(){
        System.out.println("Velocidad: "+Controller.cambiarVelocidad(obtenerMatricula(),obtenerVelocidad()));

    }

    /**
     * Aumenta la velocidad del coche
     */
    public static void subirVelocidad(){
        System.out.println("Nueva Velocidad aumentada: "+ Controller.subirVelocidad(obtenerMatricula()));
    }

    /**
     * Reduce la velocidad del coche
     */
    public static void bajarVelocidad(){
        System.out.println("Nueva Velocidad aumentada: "+ Controller.bajarVelocidad(obtenerMatricula()));
    }

    public static void mostrarCoche(){
        System.out.println(Controller.mostrarCoches(obtenerMatricula()));
    }

}
