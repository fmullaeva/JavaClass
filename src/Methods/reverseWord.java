package Methods;

public class reverseWord {
    public static void main(String[] args) {
        String result = reversedWord("Techtorial");
        System.out.println(result);
    }

    public static String reversedWord(String word) {
        String reversedstr = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversedstr += word.charAt(i);
        }
        return reversedstr;
    }
    public static boolean isPalindrome(String word){
        return word.equalsIgnoreCase(reversedWord(word));

        }

}
