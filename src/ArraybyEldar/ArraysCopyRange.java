package ArraybyEldar;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysCopyRange {
    public static void main(String[] args) {
      /* ask user input 8 numbers and store them in 3 dimension array
         print out array
       */

        int[][][] nums = new int[2][2][2];
        System.out.println("Please input 8 numbers");
        Scanner sr = new Scanner(System.in);
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                for (int k = 0; k < nums[i][j].length; k++) {
                    nums[i][j][k] = sr.nextInt();
                }
            }
        }
        System.out.println(Arrays.deepToString(nums));
        String strOddNums = "";
        String strEvenNums = "";
        for (int i = 0; i < nums.length; i++) {
            for (int z = 0; z < nums[i].length; z++) {
                for (int y = 0; y < nums[i][z].length; y++) {
                    if (nums[i][z][y] % 2 == 0) {
                        strEvenNums += nums[i][z][y] + ",";
                    } else {
                        strOddNums += nums[i][z][y] + "|";
                    }
                }
            }
        }
        System.out.println("Even numbers:" + Arrays.toString(strEvenNums.split(",")));
        System.out.println("Even numbers:" + Arrays.toString(strOddNums.split("\\|")));

    }
}




