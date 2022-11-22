package day01_string;

import java.util.Scanner;

public class Q2_Print {

    public static void main(String[] args) {

        /*
    76453 sayisinin her bir basamagini konsolda alt alta yazdirin.

    input : 76453
    output: 7
            6
            4
            5
            3

     */
        Scanner scan = new Scanner(System.in);

        System.out.println(" Lütfen bes basamakli bir sayi giriniz");

        int sayi= scan.nextInt();

        int birler= sayi%10;

        int onlar= (sayi/10)%10;

        int yuzler= (sayi/100)%10;

        int binler= (sayi/1000)%10;

        int onbinler= (sayi/10000)%10;


        System.out.println(onbinler+ "\n" + binler + "\n" + yuzler +"\n" + onlar +"\n" + birler );


        int nur = scan.nextInt();
        

        int bir = nur % 10;

        nur= nur / 10;

        int on = nur % 10;

        nur= nur / 10;

        int yuz = nur % 10;

        nur= nur / 10;

        int bin = nur % 10;

        nur= nur / 10;

        int onbin = nur % 10;

        nur= nur / 10;


        System.out.println(onbin+ "\n" + bin + "\n" + yuz +"\n" + on +"\n" + bir );







    }
}
