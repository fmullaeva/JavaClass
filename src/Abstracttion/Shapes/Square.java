package Abstracttion.Shapes;

public class Square extends Shapes {
    int side;
    Square(String color,int side){
        super("Square",color);
        this.side=side;
    }
   @Override
    public Long  CountArea() {
       return (long) Math.pow(side, 2);
   }
   @Override
    public void printDetails(){
       System.out.printf("%s side is %d",super.name,side);

    }
}
