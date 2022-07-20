package Abstracttion.Shapes;

  public abstract  class Shapes {
     String name;
     String color;

     Shapes(String name,String color) {
         this.name = name;
         this.color = color;
     }

     public abstract Number CountArea();

    public abstract void printDetails();
 }
