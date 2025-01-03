public class Quadro extends OperaDarte {
    private double altezza;
    private double larghezza;
    public Quadro(String titolo, String artista, double altezza, double larghezza) {
        super(titolo, artista);
        this.altezza = altezza;
        this.larghezza = larghezza;
    }
    public double ingombro() {
        return altezza * larghezza;
    }
    public String toString() {
        return super.toString() + ", Quadro: altezza=" + altezza + ", larghezza=" + larghezza;
    }
}