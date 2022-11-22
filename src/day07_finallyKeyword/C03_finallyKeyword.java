package day07_finallyKeyword;

public class C03_finallyKeyword {

    public static void main(String[] args) {

        String a = null;
        String b = "";

        try {
            try {
                b= b + "a" ;
                a.length();
                b= b +"b";
            } catch (NullPointerException e) {

                b= b+"c";

            } finally {
                b= b+"d";
                throw new RuntimeException();
            }
        } catch (Exception e) {

            b= b+"e";
        }
        System.out.println(b);


    }
}
