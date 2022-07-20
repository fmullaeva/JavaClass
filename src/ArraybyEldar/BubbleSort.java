package ArraybyEldar;

import java.util.Arrays;
import java.util.Scanner;
// BubbleSorts we use when we cant use Array.sort.To sort array elements by comparing adjecents
// uses swapping method to sort the array
public class BubbleSort {
    public static void main(String[] args) {
        System.out.println("Please enter 10 nums");
        Scanner str = new Scanner(System.in);
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = str.nextInt();
        }
        System.out.println("Stored nums" + Arrays.toString(nums));
        for (int outer = 0; outer < nums.length; outer++){
            for (int inner =outer+ 1; inner < nums.length; inner++){
                int temp = 0;
                if (nums[outer] > nums[inner]) {
                    temp = nums[outer];
                    nums[outer] = nums[inner];
                    nums[inner] = temp;

                }
            }
        }

        System.out.println("sorted nums are:"+Arrays.toString(nums));
    }
}
