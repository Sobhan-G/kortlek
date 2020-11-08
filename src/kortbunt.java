// en klassmetod som hanterar en kortbunt

public class kortbunt {

    // defineria olka "färgnnamnen"
    public static final String[] fargNamn={"Hjarter", "Spader", "Ruter", "Klover"};
    // definera valör
    public static final String[] valorNamn={"Ess", "2", "3", "4", "5", "6", "7",
            "8", "9", "10", "Knekt", "Dam", "Kung"};
    //
    public final int f;
    public final int v;

    public kortbunt(int farg, int valor) {
        if (farg < 1 || farg > 4 ||
                valor < 1 || valor > 13) {
            System.out.println("fel");
            System.exit(1);
        }
        f=farg;
        v=valor;
    }
    public int geFarg() {
        return f;
    }
    public int geValor() { return v; }

    public String toString() {

        return String.format("%s%s", fargNamn[f], valorNamn[v]);
    }
}
