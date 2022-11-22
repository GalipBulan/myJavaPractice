package day07_finallyKeyword;

public class C01_finnallyKeyword {

    public static void main(String[] args) {
          String a = null;

        try {
            a.concat("b");
        } catch (NullPointerException e) {
            a="";


        }finally {
            System.out.println(a.concat("acd"));
        }

    }
}
