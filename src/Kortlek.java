    // en klass som hanterar en kortlek

public class Kortlek {
    // en kortbunt 52 platser i array
    public final kortbunt[] bunt=new kortbunt[52];
    public int antal=0;

    public int geAntal() {
        return antal;
    }

    // en metod för att lägga korten överst i en kortbunt
    public void laggOverst(kortbunt k) {
        bunt[antal]=k;
        antal++;
    }

    public int slumpkort() {
        int slumpkort=(int) (Math.random() * 52) + 1;
        return slumpkort;
    }

    // innehlleet i kortleken
    public void gorKortlek() {
        for (int f=1; f <= 4; f++)
            for (int v=1; v <= 13; v++)
                laggOverst(new kortbunt(f, v));
    }

    // blanda genom math.random
    public void blanda() {
        for (int i=0; i < antal; i++) {
            int n=(int) (Math.random() * antal);
            kortbunt temp;
            temp=bunt[n];
            bunt[n]=bunt[i];
            bunt[i]=temp;
        }
    }

}

