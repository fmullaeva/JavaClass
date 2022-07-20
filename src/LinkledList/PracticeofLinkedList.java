package LinkledList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class PracticeofLinkedList {
    public static void main(String[] args) {
        LinkedList<String> berries=new LinkedList<>();
        berries.add("strawberry");
        berries.add("blueberry");
        System.out.println(berries);
        berries.addFirst("raspberry");
        System.out.println(berries);
        berries.add(0,"watermelon");
        System.out.println(berries.getFirst());
        System.out.println(berries.poll());
        System.out.println(berries);
        berries.add("cranberry");
        berries.add("cranberry");
        berries.add("gooseberry");
        berries.add("gooseberry");
        System.out.println(berries);
        berries.removeFirstOccurrence("gooseberry");
        System.out.println(berries);

        Object [] berriesArr= berries.toArray();
        System.out.println(Arrays.toString(berriesArr));
        List list= Arrays.asList(berriesArr);
        System.out.println(list);
    }
}
