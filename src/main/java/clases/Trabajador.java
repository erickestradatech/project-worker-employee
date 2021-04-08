package clases;

public abstract class Trabajador {

    private int codigo;
    private String nom;
    private String feing;
    static int cuenta = 1;

    public Trabajador(String nom, String feing) {
        this.codigo = cuenta++;
        this.nom = nom;
        this.feing = feing;
    }

    public abstract double pago();

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getFeing() {
        return feing;
    }

    public void setFeing(String feing) {
        this.feing = feing;
    }

}
