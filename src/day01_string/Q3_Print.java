package day01_string;

import java.util.Scanner;

public class Q3_Print {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println(" Lütfen bes basamakli bir sayi giriniz");

        int sayi= scan.nextInt();

        int birler= sayi%10;

        int onlar= sayi%100;

        int yuzler= sayi%100;

        int binler= sayi%1000;

        int onbinler= sayi%10000;

        System.out.println(onbinler+ "\n" + binler + "\n" + yuzler +"\n" + onlar +"\n" + birler );
    }
}
