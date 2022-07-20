package Methods;

import UtilityMethods.ArrayMethods;

import java.util.Arrays;

public class TestArraymethods {
    public static void main(String[] args) {
        int []numbers={1,2,3,4,5,6,7,8,9};
        ArrayMethods.printArray(numbers);
        String [] words={"Miami","Chicago","Seattle","New York"};
        ArrayMethods.printArray(words);
        int [][] num={{10,20,30,40,50},{2,4,5}};
        ArrayMethods.print2dArray(num);
        String[][] arr={{"New York","Florida"},{"Califonia","Washington"}};
        ArrayMethods.print2d_Array(arr);
        ArrayMethods.printArray(ArrayMethods.reverseArray(words));
        System.out.println("-------------");
        System.out.println(Arrays.toString(ArrayMethods.reverseArray(words)));
        System.out.println(Arrays.toString(ArrayMethods.reverseArray(numbers)));
}}
