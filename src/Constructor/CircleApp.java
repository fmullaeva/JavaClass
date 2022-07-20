package Constructor;

public class CircleApp {
    /*

    create private instance variable:
    radius:double
    color:String
    create constant variables:
    PI:double

    getRadius():double
    setRadius(double num):void
    getColor():String
    getColor(String color):void

    getArea():return double=radius*radius*PI
    getDiameter():radius/2
    getPerimeter():2*PI*Radius

     */
   private String color;
   private double radius;
   static final double PI=3.14;

    CircleApp(String color){
        this.color=color;
    }
    CircleApp(String color,double radius){
     this(color);
     this.radius=radius;
    }
  double getRadius(){
        return radius;

    }
   void setRadius(double number){
        radius=number;
   }
   String getColor() {
       return color;
   }
        void setColor(String value) {
            color = value;
        }
        double getArea(){
        return radius*radius*PI;
       }
       double getDiameter(){
        return radius*2;
   }
   double getPerimeter(){
        return 2*PI*radius;
   }
   public String toString(){
        return" Color:"+color+"\nRadius: "+radius +"\nDiameter:"+getDiameter()+"\nArea:"+getArea()+"\nPerimeter:"+getPerimeter();
   }
}
