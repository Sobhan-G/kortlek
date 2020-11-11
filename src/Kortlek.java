/**
 * skapat av sobhan
 * 2020-11-11 uppgift 3
 * En klass som hanterar själva kortleken
 */

/**
 * en klass för att hantera Kortbunt 52 platser i array
 */
public class Kortlek {
        // en Kortbunt 52 platser i array
    public final Kortbunt[] bunt=new Kortbunt[52];

    public int antal=0;
    /**
     * en metod för att ge spelarna ett slumpmässigt kort
     * @return retunerar variablerna f och v
      */

    public static Kortbunt slumpkort() {
        int F=(int) (Math.random() * 3) + 1;
        int v=(int) (Math.random() * 12) + 1;
        Kortbunt namn=new Kortbunt(F, v);

        return new Kortbunt(F, v);
    }

}
