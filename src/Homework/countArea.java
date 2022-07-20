package Homework;

import java.util.Scanner;

public class countArea {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
  System.out.println("Please select the shape:\nsquare\nrectangle\ntriangle\ncircle");
  String shape= input.next();
  float area=0;
  switch (shape){
      case "square":
          System.out.println("Please enter the side of square");
    float a= input.nextFloat();
      area=a*a;
      break;
      case "rectangle":
          System.out.println("Please enter the width");
          float w= input.nextFloat();
          System.out.println("Please enter a heigh");
          float h=input.nextFloat();
          area=w*h;
          break;
      case "circle":
          break;
      default:
          System.out.println("Invalid option");

  }
  if (area!=0) {
      System.out.println("Area of" + shape + "is" + area);
  } else{
          System.out.println("Invalid option");
      }
    }
}