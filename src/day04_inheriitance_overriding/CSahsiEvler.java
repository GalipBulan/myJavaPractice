package day04_inheriitance_overriding;

public class CSahsiEvler extends BEvler {

    public void bahce() {
        System.out.println("Sahsi evlerin privat bahceleri vardir");
    }
    public void garaj (){
        System.out.println("Sahsi evlerin privat garajlari vardir");
    }
    public void copKovasi(){
        System.out.println("Sahsi evlerin privat vardir");
    }
    public void kiler (){
        System.out.println("Sahsi evlerin daha buyuk kilerleri vardir");
    }

    public static void main(String[] args) {

        CSahsiEvler ev1 = new CSahsiEvler();

        ev1.bahce();     // CSahsiEvler
        ev1.garaj();     // CSahsiEvler
        ev1.copKovasi(); // CSahsiEvler
        ev1.temel();     // ABinalar
        ev1.pencere();   // ABinalar
        ev1.kiler();     // CSahsiEvler
        ev1.kapi();      // ABinalar
        ev1.cati();      // ABinalar



        BEvler ev2 = new CSahsiEvler();

        ev2.bahce();     // CSahsiEvler // overriding
        // ev2.garaj();     // CSahsiEvler CTE cunku bulamaz
        ev2.copKovasi(); // CSahsiEvler // overriding
        ev2.temel();     // ABinalar
        ev2.pencere();   // ABinalar
        ev2.kiler();     // CSahsiEvler // overriding
        ev2.kapi();      // ABinalar
        ev2.cati();      // ABinalar


        ABinalar ev3 = new BEvler();

        // ev3.bahce();     //  CTE cunku bulamadi
        // ev3.garaj();     //  CTE cunku bulamadi
        // ev3.copKovasi(); //  CTE cunku bulamadi
        ev3.temel();     // ABinalar
        ev3.pencere();   // ABinalar
        // ev3.kiler();     // CTE cunku bulamadi
        ev3.kapi();      // ABinalar
        ev3.cati();      // ABinalar


    }

}
