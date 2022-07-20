package StringBuilder;

public class StringBuilder2 {
    public static void main(String[] args) {
        StringBuilder city=new StringBuilder("Miami");
        System.out.println(city);
        city.append("is beautiful").append("year").append(2022+" ").append(true);
        System.out.println(city);

        StringBuilder city2=new StringBuilder("Chicago").append("is gold");
        System.out.println(city2);
        System.out.println(new StringBuilder("New York").append("Year"+2022));
        System.out.println(city.indexOf("M"));
        city.insert(2,"-");
        System.out.println(city);
        StringBuilder word=new StringBuilder("Techtorial");
        word.reverse();
        System.out.println(word);

   StringBuilder wordToDelete=new StringBuilder("United States of America!");
    wordToDelete.delete(0,6);
        System.out.println(wordToDelete);
        wordToDelete.deleteCharAt(wordToDelete.length()-1);
        System.out.println(wordToDelete);
        wordToDelete.setCharAt(0,'s');
        System.out.println(wordToDelete);
        System.out.println(wordToDelete.length());
        System.out.println(wordToDelete.capacity());




}}

