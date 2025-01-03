public class Arte {
    public static void main(String[] args) {
        Collezione c = new Collezione("Rockfeller", "Los Angeles");
        Quadro q1 = new Quadro("Natura morta", "Picasso", 200, 100);
        Quadro q2 = new Quadro("Paesaggio", "Mantegna", 150, 100);
        Scultura s1 = new Scultura("David", "Donatello", 150, 100, 200);
        c.inserisci(q1);
        c.inserisci(q2);
        c.inserisci(s1);
        c.stampaOpere();
        System.out.println(c.getOpera(0).ingombro());
        System.out.println(c.getOpera(2).ingombro());
        System.out.println(c.getOpera(0).equals(c.getOpera(1)));
    }
}