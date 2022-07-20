package Abstracttion.Phone;

public class Practice {
    public static void main(String[] args) {
        String name = "madam";
        String rev = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            rev = rev + name.charAt(i);
        }
            if (name.equals(rev)){
            System.out.println(name+"is palindrome");
            }else{
                System.out.println("Not a palindrome");
            }
        }
    }

