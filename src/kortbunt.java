// en klassmetod som hanterar en kortbunt

import com.sun.source.tree.ReturnTree;

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
    public String geFarg() {
        return fargNamn[this.f];
    }
    public String geValor() {
        return valorNamn[this.v];
    }

    public String toString() {

        return String.format("%s %s",geFarg() , geValor());
    }
}
