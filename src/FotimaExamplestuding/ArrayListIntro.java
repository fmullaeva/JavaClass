package FotimaExamplestuding;
import java.util.ArrayList;
import java.util.List;

public class ArrayListIntro {
    public static void main(String[] args) {
        int [] nums={1,2,3,4,55,6};
        nums[5]=76;
        System.out.println(nums[5]);
       ArrayList arrayList=new ArrayList();// without specified
        arrayList.add(1);
        arrayList.add(2);
       ArrayList arrayList1=new ArrayList(10);//with capacity specification
       arrayList1.add("word1");
        arrayList1.add(123);// autoboxing
        arrayList1.add('I');
        arrayList1.add("word2");
        arrayList1.add("word3");
        arrayList1.add("word4");
        arrayList1.add("word5");
        arrayList1.add("word6");
        arrayList1.add("word7");
        arrayList1.add("word8");
        arrayList1.add("word9");
        arrayList1.add("word10");
        arrayList1.add("word11");
        arrayList1.add("word11");
        System.out.println(arrayList1.get(11));
        System.out.println(arrayList1);// also you can do it with Tostring same print out

        ArrayList list2=new ArrayList(arrayList1);
        System.out.println(list2);//

        ArrayList<Integer> listNumbers=new ArrayList<>();//datatype specified
        listNumbers.add(1);
        listNumbers.add(2);
        listNumbers.add(3);
        listNumbers.add(4);
        System.out.println(listNumbers);

        ArrayList<Boolean>listConditions=new ArrayList<>();
        listConditions.add(true);
        listConditions.add(false);
        listConditions.add(5==5);
        listConditions.add("Home".equalsIgnoreCase("home"));
        System.out.println(listConditions);

        List<Character> listChars= new ArrayList<>();
      //  listChars.add('A');
        //listChars.add('B');
        for(char letter='A';letter<='Z';letter++) {
            listChars.add(letter);
        }
        System.out.println(listChars);




    }


    }

