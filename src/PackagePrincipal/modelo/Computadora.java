package PackagePrincipal.modelo;

public class Computadora {

    private int idComputadora;
    private String nombre;
    private Monitor monitor;
    private Mouse mouse;
    private Keyboard keyboard;

    private static int conComputadora;


    private Computadora(){
        idComputadora = ++conComputadora;
    }

    public Computadora(String nombre, Monitor monitor, Mouse mouse, Keyboard keyboard){
        this();
        this.nombre = nombre;
        this.monitor = monitor;
        this.keyboard = keyboard;
        this.mouse = mouse;


    }

    @Override
    public String toString() {
        return "Computadora{" +
                "\n idComputadora=" + idComputadora +
                ",\n nombre='" + nombre + '\'' +
                ",\n monitor=" + monitor +
                ",\n mouse=" + mouse +
                ",\n keyboard=" + keyboard +
                '}';
    }
}
