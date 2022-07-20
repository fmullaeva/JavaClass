package Methods.school;
public class STUDENT {
   String firstName;
   String lastName;
    int age;
    String[] firstNames=new String[3];
        String[] lastNames=new String[3];
        static int[] ages=new int[3];
        int count;
        void addStudent() {
            firstNames[count] = firstName;
            lastNames[count] = lastName;
            ages[count] = age;
            count++;
        }
        void printStudentInfo(){
            for(int i=0;i<ages.length;i++){
                System.out.println(firstNames[i]+" "+lastNames[i]+" "+ages[i]);
            }
            System.out.println(" Amount of Students is: "+count);
        }

        }