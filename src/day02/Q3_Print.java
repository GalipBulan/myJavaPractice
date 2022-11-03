package day02;

import java.util.Scanner;

public class Q3_Print {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("sırayla vize final ve devam not giriniz");

        double vize = scan.nextDouble();

        double fnl = scan.nextDouble();

        double devam = scan.nextDouble();

        double ort = vize * 0.1 + fnl * 0.8 + devam * 0.1;


        if (vize>100 && vize<0 && fnl>100 && fnl<0 && devam>100 && devam<0){

            System.out.println("Yanlis not girdiniz");
        }

        if (ort>=70){

            System.out.println("Gectiniz");

        } else if (ort>=60 && ort<=70) {

            System.out.println("Sartli gectiniz");

        }else
            System.out.println("Kaldiniz");


    }
}
