package day02;

import java.util.Scanner;

public class Q1_Print {

    public static void main(String[] args) {

        /*
         Kullaniciya
         * 1 = Gunde kac bardak cay ictigini,
         * 2 = Her bardak icin kac kup seker kullandigini sorup;
         kullanicinin yillik ve 40 yillik seker tuketimini kg bazinda  consolda yazdiran bir program yazin.
         * Kullanici eger seker kullanmiyorsa "Aferin, boyle devam et :)" ciktisini gorsun.
          (1 kup seker = 2.77 gr)
    */
        Scanner scan = new Scanner(System.in);

        System.out.println("Gunde kac bardak cay ictiginizi yaziniz");

        double cay = scan.nextDouble();

        System.out.println("Her bardak icin kac kup seker kullaniyorsunuz");

        double seker= scan.nextDouble();

        double gram = 2.77;




        if (cay==0) {

            System.out.println("\"Aferin, boyle devam et :)");



        }else {

            System.out.println("Yillik seker tuketiminiz:" + ( 365 * seker * gram)/1000);

            System.out.println("40 Yillik seker tuketiminiz:" + ( 40 * seker * 365 * gram )/1000) ;


        }

    }
}
