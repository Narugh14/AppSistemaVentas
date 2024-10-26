package PackagePrincipal;

import PackagePrincipal.modelo.Computadora;
import PackagePrincipal.modelo.Keyboard;
import PackagePrincipal.modelo.Monitor;
import PackagePrincipal.modelo.Mouse;
import PackagePrincipal.service.Orden;

public class Main {
    public static void main(String[] args) {


        //Creamos ejemplo con los objetos que creamos

        Mouse mouse = new Mouse("Cable","logitec");

        Keyboard keyboard  = new Keyboard("Cable","Mechanits 505");

        Monitor monitor = new Monitor("Dell", 14.4);

        //Creamos un objeto de tipo computadora

        Computadora pc =
                new Computadora("Gamer300",monitor, mouse, keyboard);

        //creamos una orden
        Orden orden =
                new Orden();
        orden.addComputadora(pc);
        orden.viewOrden();
    }
}