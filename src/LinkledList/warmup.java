package LinkledList;

import java.util.*;

public class warmup {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        LinkedList<String> linkedList=new LinkedList<>();
        Vector<String> vector=new Vector<>();
        arrayList.add("java");//add method
        linkedList.add("kotlin");//
        List<String> list=new ArrayList<>();
        linkedList.addFirst("");//works just with LinkedList.
        //iterator hasNext value,
        Iterator<String> iterator= arrayList.iterator();//iterator is method;
        while(iterator.hasNext()){
            System.out.println(iterator.next());//print each of element one by one

        }
        ArrayList<Integer> numList=new ArrayList<>();
        numList.add(100);
        numList.add(50);
        Iterator<Integer> iterator1=numList.iterator();
        while(iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
        ArrayList<Integer> numList2= new ArrayList<>();
        numList2.add(1000);
        numList2.add(2000);
        numList2.add(2500);
        System.out.println(numList2);
        numList2.addAll(2,numList);
        System.out.println(numList2);
        Collections.sort(numList2,Collections.reverseOrder());
        arrayList.add("PHP");
        System.out.println(arrayList);



    }
}
