
public class Main {

    public static void main(String[] args) {
        Kortlek kortlek=new Kortlek();
        kortlek.gorKortlek();
        kortlek.blanda();
        kortbunt k1=kortlek.geOversta();
        System.out.println(k1.geFarg()+k1.geValor());
        kortbunt k2=kortlek.geOversta();
        System.out.println(k2.geFarg()+k2.geValor());

        if(k1.geValor() > k2.geValor())
            System.out.println("spelare 1 vann");
                else if (k2.geValor()< k1.geValor())
                    System.out.println("spelare 1 vann");
                         else System.out.println("Oavgjort, spela igen?");
    }
}
