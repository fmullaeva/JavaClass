package Exception;
 public class Example2 {
     public static void main(String[] args) {
         String str="null";
         int [] arr=new int[5];
         try{
             System.out.println(str.length());
             System.out.println(arr[5]);
         }catch (NullPointerException | ArrayIndexOutOfBoundsException  | NumberFormatException e){
             System.out.println(e.getClass());
         }catch (RuntimeException e){
             System.out.println(e.getClass());
         }
     }
}