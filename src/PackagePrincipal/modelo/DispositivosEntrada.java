package PackagePrincipal.modelo;

public class DispositivosEntrada {

    private String tipoDeEntrada;
    private String marca;

    public DispositivosEntrada(String tipoDeEntrada, String marca){
        this.tipoDeEntrada = tipoDeEntrada;
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "DispositivosEntrada{" +
                "marca='" + marca + '\'' +
                ", tipoDeEntrada='" + tipoDeEntrada + '\'' +
                '}';
    }
}
