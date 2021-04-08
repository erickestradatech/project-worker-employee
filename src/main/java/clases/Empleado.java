package clases;

public class Empleado extends Trabajador {

    private int dias;
    double pgdia;

    public Empleado(String nom, String feing, int dias, double pgdia) {
        super(nom, feing);
        this.dias = dias;
        this.pgdia = pgdia;
    }

    @Override
    public double pago() {

        return dias * pgdia;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public double getPgdia() {
        return pgdia;
    }

    public void setPgdia(double pgdia) {
        this.pgdia = pgdia;
    }

}
