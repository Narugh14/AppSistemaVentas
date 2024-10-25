package PackagePrincipal.modelo;

public class Mouse extends DispositivosEntrada{

    private final int idMouse;
    private static int conMouse;

    //Constructor
    public Mouse(String tipoDeEntrada, String marca) {
        super(tipoDeEntrada, marca);
        idMouse = ++conMouse;
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "idMouse=" + idMouse +
                "}" + super.toString();
    }
}
