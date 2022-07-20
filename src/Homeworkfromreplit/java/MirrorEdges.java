package Homeworkfromreplit.java;

import java.util.Scanner;

public class MirrorEdges {
    public static void main(String[] args) {
        System.out.println("Please enter value:");
        String str = new Scanner(System.in).next();
        String mirrorEdge = "";
       for(int i=0,j=str.length()-1;i<str.length();i++,j--)
       {
               if (str.charAt(i) ==str.charAt(j)) {
                  mirrorEdge+=str.charAt(i);
               }
    }
        System.out.println(mirrorEdge);

    }}
