package ArraybyEldar;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateString {
    public static void main(String[] args) {
        /* user to enter 8 words
        store them in 3d array
        print count of duplicate values
        print count of unigue (distinct) values

       */
        String [][][] words=new String[2][2][2];
        Scanner str=new Scanner(System.in);
        String wordsstr="";
        for(int i=0;i< words.length;i++){
        for(int j=0;j<words[i].length;j++){
            for(int k=0;k<words[i][j].length;k++){
                words[i][j][k]=str.next();
                wordsstr+=words[i][j][k]+",";
            }

            }
        }
        System.out.println(Arrays.deepToString(words));
        String[] wordArr= wordsstr.split(",");
        int countDupes=0;
        int countUnique=0;
        for(int i=0;i<wordArr.length;i++){
            for(int l=i+1;l<wordArr.length;l++){
                if(wordArr[i].equalsIgnoreCase(wordArr[l])) {
                    countDupes++;
                }else{
                    continue;
                }
                }
            }
        System.out.println(countDupes);
        System.out.println(countUnique);

}}
