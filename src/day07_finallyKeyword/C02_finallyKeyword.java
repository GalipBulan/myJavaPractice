package day07_finallyKeyword;

public class C02_finallyKeyword {

    public static void main(String[] args) {

        int a=10;
        int b=0;

        try {

            System.out.println(a/b);

        } catch (ArithmeticException e) {

            System.out.println("Bolecekj sayi 0 olamaz");

        }finally {

            System.out.println("Finally blok calisti");
        }

    }
}
