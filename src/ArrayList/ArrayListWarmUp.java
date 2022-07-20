package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayListWarmUp {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(50);
        nums.add(1);
        nums.add(44);
        System.out.println(nums);// for ArrayList
        int[] numsArr = {1, 2, 4, 5, 6, 7, 8};
        System.out.println(Arrays.toString(numsArr));//its for array
        nums.add(100);
        nums.add(1000);
        System.out.println(numsArr.length);
        System.out.println(nums.size());
        List/*<Object>*/ list=new ArrayList(2);// we can to specify object
        System.out.println(list.size());
        System.out.println(list);
        list.add("java");
        list.add(23);
        System.out.println(list.size());
        System.out.println(list);
        list.add(true);
        System.out.println(list.size());
        ArrayList copyOfList=new ArrayList();
        System.out.println(copyOfList);

        ArrayList<Boolean>conditions=new ArrayList<>();
        conditions.add(true);
        conditions.add(40>10);
        conditions.add(copyOfList==list);
        System.out.println(conditions);
        copyOfList.add(0,"Python");
        System.out.println(copyOfList.get(0));


    }
}