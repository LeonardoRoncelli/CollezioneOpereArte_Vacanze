public class Scultura extends OperaDarte {
    private double altezza;
    private double larghezza;
    private double profondita;
    public Scultura(String titolo, String artista, double altezza, double larghezza, double profondita) {
        super(titolo, artista);
        this.altezza = altezza;
        this.larghezza = larghezza;
        this.profondita = profondita;
    }
    public double ingombro() {
        return altezza * larghezza * profondita;
    }
    public String toString() {
        return super.toString() + ", Scultura: altezza=" + altezza + ", larghezza=" + larghezza + ", profondita=" + profondita;
    }
}