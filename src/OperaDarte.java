public abstract class OperaDarte {
    private String titolo;
    private String artista;
    public OperaDarte(String titolo, String artista) {
        this.titolo = titolo;
        this.artista = artista;
    }
    public abstract double ingombro();
    public String toString() {
        return "OperaDarte: " + titolo + ", artista: " + artista;
    }
    public String getTitolo() {
        return titolo;
    }
    public String getArtista() {
        return artista;
    }
}