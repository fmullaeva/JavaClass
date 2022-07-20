package mentoringbyhmet;

import java.util.Arrays;

public class ArraysPractice {
    /*
    POssible interview questions:
    1.What is the difference between Array & ArrayList
    Arrays
    1.Arrays is a storage for primitives and objects(string)
    2.Array is a fixed size
    3.Array has multidimensional form
    4.has a length feature
    5.array cannot be manupulated (no method of array)

  */
    public static void main(String[] args) {
        String[] array=new String[5];//have tp provide size
        System.out.println(Arrays.toString(array));//null
        String[] array1={"1","2","ahmet","mehmet","ahmet1"};
        System.out.println(Arrays.toString(array1));
        /*
        Questions:
        write an implementation that declare int array and find the:
        1.Sum of even number
        2.Sum of the add number
        3.Different between them
        int[] array={1,2,3,8,12,65,76,5,22,17}
        output=120 sum of even
        output=91 sum of odd
        difference
         */
        int[] nums={1,2,3,8,12,65,76,5,22,17};
        int sumOfeven=0;
        int sumOfodd=0;
        for (int number:nums) {
            if (number % 2 == 0) {
            sumOfeven += number;
        }else if(number%2!=0){
                sumOfodd+=number;
            }
                System.out.println(sumOfeven);
            System.out.println(sumOfodd);


            }
            }

    }




