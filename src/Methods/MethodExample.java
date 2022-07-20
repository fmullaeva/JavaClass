package Methods;

public class MethodExample {
    static int  sum(int a,int b){
        //System.out.println("1st value:"+a);
     //   System.out.println("1st value:"+b);
       // System.out.println("sum");
        boolean isPalindrome=false;
        return a+b;

    }
      void sum(String a,int b){ } //  sprosit u Eldara
    static void  printWord(){
        System.out.println("Hello from Method");
        System.out.println(sum(10,88));

    }
    public static void main(String[] args){
        printWord();
      //  System.out.println(sum(3,2));
      //  String str="Home";
       // System.out.println(str.toUpperCase());
        //for(int i=str.length()-1;i>0;i--){
          //  System.out.println(str.charAt(i));

        }
     //   System.out.println(sum(12,12));
      //  int sumOf=sum(12,12);
        //System.out.println(sumOf);

    private static void printWord(String text,int num){
        System.out.println(text.toUpperCase());
        System.out.println(num*num);
    }
}


