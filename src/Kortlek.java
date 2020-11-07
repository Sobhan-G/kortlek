
public class Kortlek  {
    public final kortbunt[] bunt=new kortbunt[52];
    public int antal=0;

    public int geAntal() {
        return antal;
    }

    public void laggOverst(kortbunt k) {
        bunt[antal]=k;
        antal++;
    }

    public kortbunt geOversta() {
        antal=0;
        return bunt[antal];
    }

    public void gorKortlek() {
        for (int f=1; f <= 4; f++)
            for (int v=1; v <= 13; v++)
                laggOverst(new kortbunt(f, v));
    }

    public void blanda() { 
        for (int i=0; i < antal; i++) {
            int n=i + (int) (Math.random() * antal);
            i++;
            kortbunt temp;
            temp=bunt[n];
            bunt[n]=bunt[i];
            bunt[i]=temp;
        }
    }
}


