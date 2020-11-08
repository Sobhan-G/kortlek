import java.text.ChoiceFormat;
import java.util.Scanner;

//
public class Main {

    public static void main(String[] args) {
        Kortlek kortlek=new Kortlek();
        kortlek.gorKortlek();
        kortlek.blanda();
        kortbunt p1=kortlek.slumpkort();
        System.out.println(p1.geFarg() + p1.geValor());
        kortbunt p2=kortlek.slumpkort();
        System.out.println(p2.geFarg() + p2.geValor());

        if (p1.geValor() > p2.geValor())
            System.out.println("spelare 1 vann");
        else if (p2.geValor() < p1.geValor())
            System.out.println("spelare 2 vann");
        else System.out.println("Oavgjort!");
        System.out.println("TACK FÖR ATT DU SPELADE");

    }
}
