package day05;

import java.util.ArrayList;
import java.util.List;

public class ArraylarinOrtakElemaniniBulma {

    public static void main(String[] args) {

        /*
         * iki array arasinda ayni olan elemanlari bir liste ekleyen program yazin
         * (buyuk kucuk harf onemsiz)
         *
         * Input1 : {John,Brad,Ange,Sofia,Emily} Input2 : {sofia,brad,grace,emily,hazel}
         *
         * Output : [sofia,brad,emily]
         */

        String [] input1 = {"John","Brad","Ange","Sofia","Emily"};
        String [] input2 = {"sofia","brad","grace","emily","hazel"};


        arraylerinOrtakElemanlariniListe(input1,input2);


    } private static void arraylerinOrtakElemanlariniListe(String[] input1, String[] input2){

        List<String> output = new ArrayList<>();

        for (int i = 0; i < input1.length; i++) {

            for (int j = 0; j <input2.length; j++) {

                if(input1[i].equalsIgnoreCase(input2[j])){

                    output.add(input1[i]);

                }

            }

        }
        System.out.println(output);


    }
}
