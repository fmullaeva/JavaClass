package ArraybyEldar;

import java.util.Arrays;
import java.util.Scanner;

public class PalindromeArray {
    public static void main(String[] args) {
        /*
        1991
        user inputs 10 numbers,store them in array
        identify if array is palindrome or not
               */
        int[] num=new int[10];
        System.out.println("Please input 10 numbers");
        Scanner input=new Scanner(System.in);
        for(int i=0;i<num.length;i++){
        num[i]=input.nextInt();
        boolean isPalindrome=true;
        int t= num.length-1;
        for(int k=0;k<num.length/2;k++,t--){
        if(num[k]!=num[t]){
            isPalindrome=false;
            break;
        }}

            System.out.println(Arrays.toString(num));
    }
}}
