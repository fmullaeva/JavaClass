package mentoringbyhmet;

public class StringAndMethods {
    public static void main(String[] args) {
        /*
    DEBUGGING:is a way to see all the execution step by step.
    /*
    Possible interview questions:
    1.Define string:
      is an object.
      How can you declare it?
      String str="ahmet loves java";
      String str1=new String("ahmet loves java");

      Methods:
      1.Length()-->counts number of characters it returns to number
      2.equals()-->compares the value of the variables(returns boolean)
      3.indexOf()--> index number of character,returns number.
      4.CharAt()-->it gives you the characters of the specific index.
      5.substring()--> way to get specific parts of the string, returns String
      6.Upperto()/LowerTo()- makes the characterst upper or lower case.
      7.concat()--> way to add the two or more separate together.
      8.split()--->way to split(separate) the string from specific spot.It RETURNS STRING ARRAY
      9.replace()--->
      10.contains()-->way to check specific characters inside of the String(value),returns boolean
      11.EqualIgnoreCase--> way to compare the values(two values) without any sensivitiness(uppercase/lowercase)-return boolean
      12.StartsWith()---> checks first characters of the value(String)-returns boolean
      14.trim()--> delete the spaces from beginning and end, itg returns String

     */

    //Equals method(it always compare/check the "value" of the variables)
// "==" it always checks the location of the variables(String).(HEAP-STUCK MEMORY).

    String examples = "    Ahmet loveS JaVa and jAvA likes you guys   ";
    String example2 = "  aHmEt LoVeS Java and Java Likes you guys  ";
    boolean result = example2.equals(examples);
        System.out.println(example2.equalsIgnoreCase(examples));
        int number=example2.indexOf("v");//17
        String str5=examples.substring(0,number);//0 part is included, second part is not included.
        System.out.println(str5);//Ahmet loveS Ja
        System.out.println(examples.toUpperCase());
        System.out.println(examples.toLowerCase());
        System.out.println(examples.replace('a','*'));
        System.out.println((example2.replace("Java","")));
        System.out.println(examples.startsWith("ahmet"));
        System.out.println(examples.startsWith("Ahmet"));
        System.out.println(example2.contains("guys"));

}}
