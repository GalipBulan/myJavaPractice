package day05;

public class MaxAndMinNumberInArrays {

    public static void main(String[] args) {

        // Verilen bir Array'in icerisindeki en buyuk ve en kucuk sayilari
        // bulan methodlari yaziniz.

            int[] arr = {17,25,3,8,56,8,4,9};

            int maxnumber = arr[0];
            int minnumber = arr[0];

            for (int i = 0; i < arr.length; i++) {

                if (maxnumber < arr[i]) {
                    maxnumber = arr[i];

                } else {
                    maxnumber=maxnumber; }

                if (minnumber > arr[i]) {
                    minnumber = arr[i];

                } else minnumber=minnumber;
            }
            System.out.println("maxnumber : "+maxnumber);
            System.out.println("minnumber : "+minnumber);
        }






    }

