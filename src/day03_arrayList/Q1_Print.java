package day03_arrayList;

import java.util.ArrayList;

public class Q1_Print {

    public static void main(String[] args) {

        ArrayList<String> animals = new ArrayList<String>();

        String[] animalsList = {"cats", "dog", "rat", "bird"};

        String[] tur = {"kanatlilar", "surungenler", "etciller"};


        for (int i = 0; i < animalsList.length; i++) {

            animals.add(animalsList[i]);

        }


        for (int j = 0; j < tur.length; j++) {

            animals.add(tur[j]);


        }
        System.out.println("");

        System.out.println(animals);
    }
    }
