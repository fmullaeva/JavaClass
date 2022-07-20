package MAP;

import java.util.*;

public class practice3 {
    public static void main(String[] args) {
        HashMap<String, String> movies = new HashMap<>();
        movies.put("horror", "Silent Hill");
        movies.put("comedy", "Mask");
        System.out.println(movies);
        LinkedHashMap<String, String> copyOfMovies = new LinkedHashMap<>();
        copyOfMovies.put("drama", "Notebook");
        System.out.println(copyOfMovies);
        copyOfMovies.putAll(movies);
        System.out.println(copyOfMovies);

        String movie = movies.get("horor").toUpperCase().replace(" ", "-");
        System.out.println(movie);
        movies.remove("comedy");
        System.out.println(movies);

        System.out.println(copyOfMovies.keySet());
        Set<String> keys = copyOfMovies.keySet();
        for (String key : keys) {
            if (key.equals("drama")) {
                copyOfMovies.put(key, copyOfMovies.get(key).toUpperCase());
            }
        }
        System.out.println(copyOfMovies);
            Set<Map.Entry<String,String>> nameOfEntrySet=copyOfMovies.entrySet();
            for(Map.Entry<String,String> item:nameOfEntrySet){
                System.out.println(item.getKey());
                System.out.println(item.getValue());
            }

        }

            }
