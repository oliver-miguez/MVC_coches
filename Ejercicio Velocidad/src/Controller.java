public class Controller {
    public static void main(String[] args) {
        Model2 miModel = new Model2();

        miModel.crearCoche("akdfha","111");
        miModel.crearCoche("adafhaskfdh","222");

        miModel.cambiarVelocidad("111",1);
        miModel.cambiarVelocidad("222",10);

        miModel.aumentarVelocidad("111",4);
        miModel.reducirVelocidad("222", 6);

        miModel.aumentarVelocidad("333",100);
        miModel.reducirVelocidad("333",100);

        int recoger = miModel.getVelocidad("333");
        if(recoger == 1){
            System.out.println("No existe");
        }else{
            System.out.println("Existe");
        }


    }
}
