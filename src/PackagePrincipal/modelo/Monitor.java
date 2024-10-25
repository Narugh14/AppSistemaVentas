package PackagePrincipal.modelo;

public class Monitor {

    private final int idMonitor;
    private String marca;
    private double size;
    private static int conMonitor;

    private Monitor(){
        idMonitor = ++conMonitor;
    }

    public Monitor(String marca, double size) {
        this();
        this.marca = marca;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "idMonitor=" + idMonitor +
                ", marca='" + marca + '\'' +
                ", size=" + size +
                '}';
    }
}
