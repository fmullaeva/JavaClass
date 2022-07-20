package Methods;

import UtilityMethods.ArrayMethods;

public class TEST3 {
    public static void main(String[] args) {
        int[] arr={12,19,41,10,15};
        boolean isContains= ArrayMethods.arrayContains(arr,100);
        System.out.println(isContains);
        System.out.println(ArrayMethods.arrayContains(arr,54));
        System.out.println("++++++++++++++++++++++++++");
        char[] charArr={'A','D','I','L','W'};
        System.out.println(ArrayMethods.arrayContains(charArr,'A'));
        System.out.println("+++++++++++++++++++++++++++++++++++");
        String[] word={"Java","Python","PHP","JavaScript"};
        System.out.println(ArrayMethods.arrayContains(word,"Java"));
    }
}



