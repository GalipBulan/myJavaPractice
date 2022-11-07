package day03;

import java.util.ArrayList;

public class Q2_Print {

    public static void main(String[] args) {


        ArrayList<ArrayList<String>> groceryList = new ArrayList();


        ArrayList<String> bakeryList = new ArrayList();
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");
        bakeryList.size();



        ArrayList<String> produceList = new ArrayList();
        produceList.add("tomatoes");
        produceList.add("zucchini");
        produceList.add("peppers");
        produceList.size();

        ArrayList<String> drinksList = new ArrayList();
        drinksList.add("water");
        drinksList.add("coffee");
        drinksList.add("soda");
        drinksList.size();

        // groceryList.add(bakeryList);
        // groceryList.add(produceList);
        // groceryList.add(drinksList);


        for (int i = 0; i <bakeryList.size(); i++) {

            for (int j = 0; j <produceList.size(); j++) {

                for (int k = 0; k <drinksList.size(); k++) {



                }

            }


        }

    }
}
