package ArraybyEldar;

import java.util.Arrays;
import java.util.Scanner;

public class SplitArray {
    public static void main(String[] args) {
       String[] word=new String[10];
        Scanner str=new Scanner(System.in);
        System.out.println("Please enter 10 words");{
        for( int i=0;i<word.length;i++){
            word[i]=str.next();
        }
        String[] firstHalf=new String[word.length/2];
        String[] secondHalf=new String[word.length- firstHalf.length];
            for(int k=0;k< word.length;k++){
                if(k<firstHalf.length){
                    firstHalf[k]=word[k];
                }else{
                    secondHalf[k-firstHalf.length]=word[k];

                }
                System.out.println(Arrays.toString(firstHalf));
                System.out.println(Arrays.toString(secondHalf));
            }

        }
    }
}
