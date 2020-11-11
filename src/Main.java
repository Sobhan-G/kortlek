    /**
     * skapat av sobhan
     * 2020-11-11 uppgift 3
     **/

    import java.util.Scanner;

    public class Main {
        /**
         * main metoden hanterar själva programmet
         */
        public static void main(String[] args) {
        while (true) {
            Kortlek kortlek=new Kortlek();
            Kortbunt p1=Kortlek.slumpkort();
            Kortbunt p2= Kortlek.slumpkort();
            System.out.println("Spelare1"+ " "+ p1.toString());
            System.out.println("Spelare2"+ " "+ p2.toString());

            if (p1.gepoang() > p2.gepoang())
                System.out.println("Spelare1 Du Vann!");
            else if (p2.gepoang() > p1.gepoang())
                System.out.println("Spelare2 Du Vann!");
            else System.out.println("Oavgjort!");
            Scanner sc = new Scanner(System.in);
            System.out.println("Vill du spela igen? skriv J\n Annars tryck på valfri tagent");
            String fortsatt = sc.next().toLowerCase();
            if (fortsatt.equals("j")) {
            }

                else break;

        }
        System.out.println("TACK FÖR ATT DU SPELADE!");

    }
}
