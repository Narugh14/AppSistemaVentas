package PackagePrincipal;

import PackagePrincipal.modelo.Keyboard;
import PackagePrincipal.modelo.Monitor;
import PackagePrincipal.modelo.Mouse;

public class Main {
    public static void main(String[] args) {


        //Creamos ejemplo con los objetos que creamos

        Mouse mouse = new Mouse("Cable","logitec");
        System.out.println(mouse);

        Keyboard keyboard  = new Keyboard("Cable","Mechanits 505");
        System.out.println(keyboard);

        Monitor monitor = new Monitor("Dell", 14.4);
        System.out.println(monitor);
    }
}