package FotimaExamplestuding;

public class Palindrome {
    public static void main(String[] args) {
        String r = "race car";
        String rev = "";
        r=r.replace(" ","");
        for (int i = r.length() - 1; i >= 0; i--) {
            rev = rev + r.charAt(i);
            System.out.println(rev);
        }
        boolean palindrome = true;
        for (int i = 0; i < r.length(); i++) {
          if(r.charAt(i)!=rev.charAt(i)){
              palindrome=false;
          }
        }
        if(palindrome){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
    }
    }