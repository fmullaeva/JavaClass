package ArraybyEldar;

import java.util.Arrays;
import java.util.Scanner;

public class LargestAndSmallestNUm {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        System.out.println("Please enter 10 numbers");
        int[] nums=new int[10];
        for(int i=0;i<nums.length;i++){
            System.out.println("please enter the value["+i+"]:");
            nums[i]=str.nextInt();
        }
         int largest=nums[0];
         int smallest=nums[0];
         for(int i=0;i< nums.length;i++){
          if(nums[i]>largest){
              largest=nums[i];
          }
         if(nums[i]<smallest) {
             smallest = nums[i];}

         }
        System.out.println("Smallest number in "+ Arrays.toString(nums)+" is "+smallest);
       System.out.println("Largest number in "+ Arrays.toString(nums)+" is "+largest);

    }
}


