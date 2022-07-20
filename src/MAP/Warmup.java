package MAP;

import java.util.*;

public class Warmup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> words = new LinkedList<>();
        boolean answer = true;
        do {
            System.out.println("Please enter a word");
            words.add(scanner.nextLine());
            System.out.println("Do you want to continue");
            String response = scanner.next();
            answer = response.equalsIgnoreCase("yes") ? true : false;
            printMapwords(storeBycount(words));

        }
        while (answer);
        System.out.println(words);
        System.out.println(storeBycount(words));


    }

   public  static LinkedHashMap<Integer, LinkedList<String>> storeBycount(LinkedList<String> words) {
       LinkedHashMap<Integer, LinkedList<String>> result = new LinkedHashMap<>();
       for (String word : words) {
           if (!result.containsKey(word.length())) {
               LinkedList<String> filtered = new LinkedList<>();
               filtered.add(word);
               result.put(word.length(), filtered);
           } else {
               result.get(word.length()).add(word);
           }
       }
       return result;

   }
    public static void printMapwords(LinkedHashMap<Integer,LinkedList<String>> words) {
        for (Map.Entry<Integer, LinkedList<String>> word : words.entrySet()) {
            System.out.println("words with lenght of"+word.getKey());
            for (String item : word.getValue()) {
                System.out.println(item);

            }
        }
    }

}
