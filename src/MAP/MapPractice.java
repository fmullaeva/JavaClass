package MAP;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapPractice {
    public static void main(String[] args) {

   /* Scanner scanner=new Scanner(System.in);
    Map<Integer,String> cities=new HashMap<>();
    for (int i=0; i<5;i++){
        System.out.println("Enter zip code:");
        Integer zipCode=scanner.nextInt();
        System.out.println("Enter city name:");
        scanner.nextLine();
        String cityName= scanner.nextLine();
        cities.put(zipCode,cityName);
    }
    System.out.println(cities);*/
        HashMap<Integer, String> zipsCities = new HashMap();
        zipsCities.put(33180, "Aventura");
        zipsCities.put(33160, "Sunny Isles Beach");
        zipsCities.put(33172, "Miami Beach");
        zipsCities.put(33334, "Fort Lauderdale");
        Map<Integer, String> cities = new HashMap<Integer,String>();
        cities.put(23523, "Hollywood");
        System.out.println(cities);
        cities.putAll(zipsCities);
        System.out.println(cities);
        cities.putIfAbsent(23524, "Broard");
        System.out.println(cities);
        cities.remove(23524);
        System.out.println("after removing: " + cities);
        cities.remove(23523, "Hollywood");
        System.out.println("remove with key and value: " + cities);
        System.out.println("33172 is for " + cities.get(33172));
        Set<Integer> zipKeys = cities.keySet();
        System.out.println("All zipcodes in DB:");
        for (Integer zip : zipKeys) {
            System.out.println(zip);
        }

        Set<Map.Entry<Integer, String>> keyAndValue = cities.entrySet();
        for (Map.Entry<Integer, String> entry : keyAndValue) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue().toUpperCase());
        }
        Map<Integer,String> Florida=new HashMap<>();
        Map<Integer,String> Illinois=new HashMap<>();
        for (Map.Entry<Integer, String> entry : keyAndValue) {
            if(entry.getKey().toString().startsWith("33")) {
                Florida.put(entry.getKey(), entry.getValue());
            }else {
                Illinois.put(entry.getKey(), entry.getValue());
            }
            }
        System.out.println(Florida);
        System.out.println(Illinois);

        }


    }
