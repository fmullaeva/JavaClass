package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<Integer> numList=new ArrayList<>();
        numList.add(123);
        numList.add(0,1000);
        System.out.println(numList);
        System.out.println(numList.get(0));
        ArrayList<String>words=new ArrayList<>();
        words.add("banana");
        words.add("apple");
       words.add(1,"pineapple");
       words.add(0,"orange");
       words.add(1,"strawberry");
        System.out.println(words);

        List cars=new ArrayList();
        cars.add("bmw");
        cars.add(1,"honda");
        System.out.println(cars);
        cars.add(1,"toyota");
        System.out.println(cars);
        cars.add(3,"Renault");
        cars.add(4,"Lincoln");
        cars.add(5,"Lexus");
        System.out.println(cars);
        System.out.println(cars.get(5));
       // int get=5;
      //  cars.get(5);
        cars.remove(0);
        System.out.println(cars);
        cars.remove("Lexus");
        System.out.println(cars);
        cars.set(0,"Mercedes");
        System.out.println(cars);
        System.out.println(cars.isEmpty());
        System.out.println(cars.contains("Lexus"));
        System.out.println(cars.contains("Mercedes"));
        ArrayList<String>list= new ArrayList();
        Object[] carsArr=cars.toArray();
        System.out.println(Arrays.toString(carsArr));
        List <Object> list1= Arrays.asList(carsArr);
        cars.clear();
        System.out.println(cars);


    }
}
