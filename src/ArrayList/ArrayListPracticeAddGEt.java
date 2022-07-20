package ArrayList;

import java.util.ArrayList;
import java.util.Locale;

public class ArrayListPracticeAddGEt {

  /*  create array list storing the letterrs A-Z
    method to check if letter is vowel or not boolean is Vowel(char)
    method to print Vowels accept list of chars
    print out only vowels
    static void printVowels(List<Character>letters)
                 */
  public static void main(String[] args) {

      ArrayList <Character> letters = new ArrayList();
      for (char letter = 'A'; letter <= 'Z'; letter++) {
          letters.add(letter);
      }
      System.out.println(letters);
      printVowels(letters);
      printConsonants(letters);
      String word="Territorial";
      printConsonants(word);

  }
  static boolean isVowel(char letter) {
      if (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
          return true;
      }
      return false;
  }
  static void printVowels(ArrayList<Character> letters) {
      System.out.println("Vowels:");
      for (int i = 0; i < letters.size(); i++) {
          if (isVowel(letters.get(i))) {
              System.out.println(letters.get(i));
          }
      }
  }
  static void PrintVowels(String word){
      System.out.println("vowels of word:");
      for(int i=0;i<word.length();i++){
          if(isVowel(word.toUpperCase().charAt(i))){
              System.out.println(word.charAt(i));
          }
      }
}
   static void printConsonants(ArrayList<Character> letters){
       System.out.println("Consonants:");
       for(int i=0;i<letters.size();i++){
           if(!isVowel(letters.get(i))){
               System.out.println(letters.get(i));

           }
       }
  }
    static void printConsonants(String word){
        System.out.println("Consonants:");
        for(int i=0;i<word.length();i++) {
            if (!isVowel(word.toUpperCase().charAt(i))) {
                System.out.println(word.charAt(i));
            }


        }}}