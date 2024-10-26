package PackagePrincipal.service;

import PackagePrincipal.modelo.Computadora;

import java.util.ArrayList;
import java.util.List;

public class Orden {
    private final int idOrden;
    private final List<Computadora> listComputadoras;

    private static int conOrden;

    public Orden(){
        listComputadoras = new ArrayList<>();
        this.idOrden = ++conOrden;
    }

    public void addComputadora(Computadora computadora){
        listComputadoras.add(computadora);
    }

    public void viewOrden(){
        System.out.println("Orden #: " + idOrden);
        System.out.println("Total de computadoras" + listComputadoras.size());
        listComputadoras.forEach(System.out::println);
    }

}
