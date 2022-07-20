package mentoringbyhmet;

public class IfStatementTernary {
    public static void main(String[] args) {
        /* many technical questions have is statement condition
        -->True&&True--> means both condition must be true
        --->True&&false--->false
            false&&false--->false

          --->true || true-->true
          ----->true||false--->true
          ---->false||false-->false
         */
        boolean result = (5 + 7 == 12);
        System.out.println(result);
        int cat = 20;
        int dog = 10;
        int rabbit = 5;
        if (cat > dog && rabbit < dog || cat < rabbit) {
            System.out.println("I love the animals");
        } else {
            System.out.println("i feed animals");

        }
        String result1=cat>dog&&rabbit>dog||cat<rabbit?"i love animals":"i feed animals";
       // String result2=(cat>dog)?"yes":123;
        System.out.println(cat>dog?"yes":123);
        System.out.println(result1);

    }
}
