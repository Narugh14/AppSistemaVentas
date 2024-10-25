package PackagePrincipal.modelo;

public class Keyboard extends DispositivosEntrada{

    private final int idKeyboard;
    private static int conKeyboard;

    public Keyboard(String tipoDeEntrada, String marca) {
        super(tipoDeEntrada, marca);
        idKeyboard = ++conKeyboard;
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "idKeyboard=" + idKeyboard +
                "}" + super.toString();
    }
}
