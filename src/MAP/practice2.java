package MAP;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class practice2 {
    public static void main(String[] args) {
        HashMap<String,Integer> products=new HashMap<>();
        products.put("Bread",5);
        products.put("Milk",2);
        products.put("Eggs",4);
        products.put("Sugar",2);
        System.out.println(products);
        int count=products.get("Bread");
        products.put("Bread",--count);
        System.out.println(products);
    }

}
