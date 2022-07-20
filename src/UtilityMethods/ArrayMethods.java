package UtilityMethods;

import java.util.Arrays;

public class ArrayMethods {
    /*{1,2,3,4,5,6,7}
    method which will print every element of Array in new line
     */

    /**
     * printArray accepts int[]
     * @param num
     */
 public static void printArray(int [] num){
     for(int item:num){
         System.out.println(item);

     }
 }

 public static void printArray(String[] arr) {
     for (String item : arr) {
         System.out.println(item);
     }
 }

/* method which will print out 2d array

 */
   public  static void print2dArray(int [][] num) {
     for (int [] outer:num) {
         for (int item : outer){
             System.out.println(item);
         }}}
     public static void print2d_Array(String[][] arr) {
         for (int i = 0; i < arr.length; i++) {
             for (int j = 0; j < arr[i].length; j++) {
                 System.out.println(arr[i][j]);
             }
         }
     }
   /*
  method to reverse an array
 */
     public static  String[] reverseArray(String[] arr) {
         String[] reverseArr = new String[arr.length];
         for (int i = 0, j = arr.length - 1; i < reverseArr.length; i++, j--) {
             reverseArr[i] = arr[j];
         }
         return reverseArr;
     }
    public static int[] reverseArray(int[] arr) {
        for (int left = 0, right = arr.length - 1; left < right; left++, right--) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

        }
        return arr;
    }

/* method which will check if specific value exists in array
int[];String[]
ex:{1,3,4,5,6,7,10}
 */
 public static boolean arrayContains(int[]arr,int num){
   for(int i=0;i<arr.length;i++){
   if(arr[i]==num) {
       return true;
   }
   }
   return false;
 }
  public static boolean arrayContains(char[]arr,char element){
      Arrays.sort(arr);
      int index=Arrays.binarySearch(arr,element);
      if(index>=0)
          return true;
      return false;
  }
 public static boolean arrayContains(String[] arr,String element){
     String str="";
     for(int i=0;i< arr.length;i++){
         str+=arr[i];
     }
     if(str.contains(element)){
         return true;
     }
  return false;


     }
 }
