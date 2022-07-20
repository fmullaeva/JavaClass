package stringIntro;

public class FotimasExample {
    public static void main(String[] args) {
        String name = "Samia";
        System.out.println(name.length());
        System.out.println(name.concat(" Ikrom"));
        System.out.println(name);
        char LetterS = name.charAt(0);
        char LetterM = name.charAt(2);
        System.out.println("" + LetterS + LetterM);
        System.out.println(name.substring(3));

    }
}