
public class Main {

    public static void main(String[] args) {
        Kortlek kortlek=new Kortlek();
        kortlek.gorKortlek();
        kortlek.blanda();
        kortbunt k=kortlek.geOversta();
        System.out.println(k.toString());
    }
}
