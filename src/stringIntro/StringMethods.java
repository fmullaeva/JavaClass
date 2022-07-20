package stringIntro;

public class StringMethods {

    public static void main(String[] args) {
        String upperCaseWord="WORLD";
        System.out.println(upperCaseWord.toLowerCase());
        String lowerCaseWord="tech";
        System.out.println(lowerCaseWord.toUpperCase());

        Boolean isStartsWith=lowerCaseWord.startsWith("tec");
        System.out.println(isStartsWith);//true
        String str1= "Hello World";
        System.out.println(str1.endsWith("World"));//true
        boolean isEndsWith=str1.endsWith("World");
        System.out.println(isEndsWith);

        String str2="i love Java";
        boolean isContains=str2.contains("love");
        System.out.println(isContains);






    }
}