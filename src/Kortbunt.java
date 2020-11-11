    /**
     * skapat av sobhan
     * 2020-11-11 uppgift 3
        en klass som hanterar innehållet en Kortbunt.
     */

    public class Kortbunt {
        // definerar olka "färgnnamnen"
    public static final String[] fargNamn={"Hjarter", "Spader", "Ruter", "Klover"};
        // definera de olika valör
    public static final String[] valorNamn={"Ess", "2", "3", "4", "5", "6", "7",
            "8", "9", "10", "Knekt", "Dam", "Kung"};

    public int farg;
    public int valor;

    public Kortbunt(int farg, int valor) {
        if (farg < 1 || farg > 4 ||
                valor < 1 || valor > 13) {
            System.out.println("fel");
            System.exit(1);
        }
        this.farg=farg;
        this.valor=valor;
    }       //metode för att ge färg
    public String geFarg() {
        return fargNamn[this.farg];
    }       //metoder för att ge valör
    public String geValor() {
        return valorNamn[this.valor];
    }
    public int gepoang(){
        return this.valor;
    }
    public String toString() {

        return String.format("%s %s ",geFarg() , geValor());
    }
}
