package Abstracttion.Shapes;

public  class Triangle extends Shapes {
    int x;
    int y;
   Triangle (String color,int x,int y){
        super("Triangle",color);
        this.x=x;
        this.y=y;
    }

    @Override
    public Integer CountArea() {
        return x * y / 2;
    }

    @Override
    public void printDetails(){
            System.out.println("Base="+x+"\ny="+y);
        }


}
