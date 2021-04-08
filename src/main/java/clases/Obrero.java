package clases;

public class Obrero extends Trabajador {

    private int sec;
    private double horas;

    public Obrero(String nom, String feing, int sec, double horas) {
        super(nom, feing);
        this.sec = sec;
        this.horas = horas;
    }

    @Override
    public double pago() {

        double v[] = {0, 8.2, 9.2, 8.7};

        return horas * v[sec];
    }

    public String seccion() {

        String v[] = {"", "Tintoreria", "Acabado", "Planchado"};

        return v[sec];
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

}
