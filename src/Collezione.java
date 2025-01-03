import java.util.ArrayList;
public class Collezione {
    private String nome;
    private String luogo;
    private ArrayList<OperaDarte> opere;
    public Collezione(String nome, String luogo) {
        this.nome = nome;
        this.luogo = luogo;
        this.opere = new ArrayList<>();
    }
    public void inserisci(OperaDarte opera) {
        opere.add(opera);
    }
    public OperaDarte getOpera(int index) {
        if (index >= 0 && index < opere.size()) {
            return opere.get(index);
        }
    }
    public void stampaOpere() {
        for (OperaDarte opera : opere) {
            System.out.println(opera);
        }
    }
}