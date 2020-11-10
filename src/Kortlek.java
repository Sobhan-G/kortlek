// en klass med metoder för att hanterar en kortlek

public class Kortlek {
    // en kortbunt 52 platser i array
    public final kortbunt[] bunt=new kortbunt[52];

    public int antal=0;

    // en metod för att lägga korten överst i en kortbunt
    public void laggOverst(kortbunt k) {
        bunt[antal]=k;
        antal++;
    }

    public kortbunt slumpkort() {
        int slumpkort=(int) (Math.random() * 52) + 1;
        int F = (int) (Math.random() * 3) + 1;
        int v = (int) (Math.random() * 12) + 1;
        kortbunt namn= new kortbunt(F,v);

        return namn;
    }

    // en metod som räknar innehlleet i kortleken
    public void gorKortlek() {
        for (int f=1; f <= 4; f++)
            for (int v=1; v <= 13; v++)
                laggOverst(new kortbunt(f, v));
    }

        //  en memtod för att blanda kortleken genom math.random
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
