package Inheritance.hierarchical;

public class Parent {
   String name;
     int id;

     Parent(String name){
         this.name=name;
     }
     Parent(String name,int id){
         this.name=name;
         this.id=id;
     }
    void methodFromParent(){
        System.out.println("Method from parent");
    }
}
