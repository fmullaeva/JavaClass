package MAP;
import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeMap;

//public class CountOccurrance {
//    /*
//    count occurrence of letter in word
//     */
//    public static void main(String[] args) {
//        String word = "techtorial";
//        int num= 12_345_678;
//     //   double[] doublenum=(12.5,24.1,12.5));
//        System.out.println(countOccurrence(word));
//        System.out.println(countOccurrence(num));
//    }
//    static TreeMap<Character,Integer> countOccurrence(String word){
//        char[] letters=word.toCharArray();
//        TreeMap<Character,Integer> countLetter=new TreeMap<>();//a,1,t=3,r=1
//        for (char letter: letters){
//            if (countLetter.containsKey(letter)){
//                int count = countLetter.get(letter);//2
//                countLetter.put(letter,++count);//t,3
//            }else {
//                countLetter.put(letter,1);//t,1; r=1
//            }
//        }
//        return countLetter;
//    }
//
//    static TreeMap<Integer,Integer> countOccurrence(int num){
//        TreeMap<Integer,Integer>result=new TreeMap<>();
//        String [] numberStr=Integer.toString(num).split("");
//        for(String num1:numberStr) {
//            Integer keyItem = Integer.valueOf(num);
//            if (result.containsKey(keyItem)) {
//                result.replace(keyItem, result.get(keyItem) + 1);
//            } else {
//                result.put(keyItem, 1);
//            }
//        }}

//        return result;
//
//        }
//    static TreeMap<Double,Boolean> countOccurrence(double[] num2) {
//        TreeMap<Double, Boolean> result = new TreeMap<>();
//        //String[] numberStr = Double.toString(num).split("");
//        // for (Double number : numberStr) {
//        Double keyItem = Double.valueOf(num2);
//        if (result.containsKey(keyItem)) {
//            result.replace(keyItem, false);
//        } else {
//            result.put(keyItem, true);
//
//            System.out.println(result);
//
//
//        }



