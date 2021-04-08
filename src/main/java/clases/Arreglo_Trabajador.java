package clases;

import java.util.*;

public class Arreglo_Trabajador {

    private List<Trabajador> lis;

    public Arreglo_Trabajador() {

        lis = new ArrayList();

        lis.add(new Empleado("Diaz Juan", "12-05-15", 25, 90));
        lis.add(new Obrero("Perez", "12-05-18", 2, 48));
        lis.add(new Empleado("Caceres", "12-05-10", 20, 110));
        lis.add(new Obrero("Teran", "12-05-11", 3, 65));
        lis.add(new Empleado("Gonzales", "12-05-12", 30, 86));
        lis.add(new Empleado("Diaz Ana", "12-05-15", 25, 90));

    }

    public void adicionar_Emp(Empleado ep) {

        lis.add(ep);
    }

    public void adicionar_Obre(Obrero op) {

        lis.add(op);
    }

    public Trabajador busca(int cod) {

        for (Trabajador x : lis) {
            if (x.getCodigo() == cod) {
                return x;
            }
        }
        return null;

    }

    // Como ordenar por pago de forma descendente
    public void ordenPago() {

        Collections.sort(lis, new orden2());
    }

    // Ordenar x nombre
    public void ordenNombre() {

        Collections.sort(lis, new orden1());
    }

    public List<Trabajador> getLis() {
        return lis;
    }

}

// Clases para ordenar
class orden1 implements Comparator<Trabajador> {

    @Override
    public int compare(Trabajador t1, Trabajador t2) {

        return t1.getNom().compareTo(t2.getNom());

    }

}

// Ordenar por pago
class orden2 implements Comparator<Trabajador> {

    @Override
    public int compare(Trabajador t1, Trabajador t2) {

        int sw;

        if (t1.pago() > t2.pago()) {
            sw = 1;
        } else if (t1.pago() < t2.pago()) {
            sw = -1;
        } else {
            sw = 0;
        }
        return sw;
    }

}
