public class OperaDarte {
    private String artista;
    private String titolo;
    public OperaDarte(String artista,String titolo){
        this.artista=artista;
        this.titolo=titolo;
    }
    public void setArtista(String artista){
        this.artista=artista;
    }
    public String getArtista(){
        return artista;
    }
    public void setTitolo(String titolo){
        this.titolo=titolo;
    }
    public String getTitolo(){
        return titolo;
    }
}