package Vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
public class VectorPractice {
    public static void main(String[] args) {
        List list=new Vector();
        Vector vector=new Vector<>(100);
        vector.add("java");
        vector.add(123);
        vector.add(true);
        vector.add(2,0.59);
        vector.set(4,false);
        vector.set(vector.indexOf('A'),'Z');
        vector.remove(0);

        System.out.println(vector.capacity());
        System.out.println(vector);
        vector.addAll(0,list);
        System.out.println(vector);
        System.out.println(vector.get(2));
        System.out.println(vector.elementAt(3));
        vector.addElement("javaScript");
        System.out.println(vector);
     //  Enumeration enumeration=vector.elements();
      //  while(enumeration.hasMoreElements()){
         //   System.out.println(enumeration.nextElement());
        System.out.println(vector.lastElement());
        vector.add(1,"Java");
        vector.add(vector.size()-2,"Java");
        System.out.println(vector.indexOf("Java"));
        System.out.println(vector.lastIndexOf("java"));
        System.out.println(vector.lastIndexOf("java",vector.lastIndexOf("java")-1));



    }



}
