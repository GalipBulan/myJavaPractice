package day02;

import java.util.Scanner;

public class Q2_Print {

    public static void main(String[] args) {

        /*
        Bir dersten alinan vize, final ve devam puanlarinin girilip ortalama hesaplandiktan sonra dersten gecilip
         gecilmedigini consola yazdiran bir program yazalim.
         */

        // ortalama = vizenin %10'i + finalin %80'si + devam puaninin %10'u

        Scanner scan= new Scanner(System.in);
        System.out.print("Lutfen vize notunuzu giriniz: ");

        double vizeNot = scan.nextDouble();

        System.out.print("Lutfen final notunuzu giriniz: ");
        double finalNot = scan.nextDouble();

        System.out.print("Lutfen devam puanlarnizi giriniz: ");
        double devamNot = scan.nextDouble();


        double ortalama = vizeNot/100*10 + finalNot/100*80 + devamNot/100*10;


        if (vizeNot>100 && vizeNot<0 && finalNot>100 && finalNot<0 && devamNot>100 && devamNot<0){

            System.out.println("Yanlis not girdiniz");
        }

        if (ortalama>=70){

            System.out.println("Gectiniz");

        } else if (ortalama>=60 && ortalama<=70) {

            System.out.println("Sartli gectiniz");

        }else
            System.out.println("Kaldiniz");

    }
}
