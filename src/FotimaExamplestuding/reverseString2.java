package FotimaExamplestuding;

public class reverseString2 {
    public static void main(String[] args) {
        // using String concatenation
        String str = "ABCD";
        String rev = "";
       /* int len=str.length();
        for(int i=len-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        System.out.println(rev);
    }

        */


        //* String Bufferclass
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse());
    }
}

