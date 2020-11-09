
public class Main {

    public static void main(String[] args) {
        Kortlek kortlek=new Kortlek();
        kortlek.gorKortlek();
        kortlek.blanda();
        kortbunt p1=kortlek.slumpkort();
        kortbunt p2= kortlek.slumpkort();
        System.out.println(p1.toString());
        System.out.println(p2.toString());

        if (p1.v > p2.v)
            System.out.println("spelare 1 vann");
        else if (p2.v > p1.v)
            System.out.println("spelare 2 vann!");
        else System.out.println("Oavgjort!");
        System.out.println("TACK FÖR ATT DU SPELADE");

    }
}
