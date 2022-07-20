package ArraybyEldar;

public class Merge2ArraysInto1 {
    public static void main(String[] args) {

    /*
    create 2 arrays
    store the elements from both arrays to 3rd array
    ex:
    {A,B,C,D}
    {Y,U,I,O,P,P,O,N}
    output:
   */

        char[] arr1 =  {'A','B','C','D'};
        char[] arr2 = {'Y','U','I','O','P','P','P','O','N'};
        char[] mergedArr = new char[arr1.length+arr2.length];

        for (int h = 0;h< arr1.length;h++ ) {
            mergedArr[h]=arr1[h];
        }
        for (int w=0;w<arr2.length;w++){
            mergedArr[arr1.length+w]=arr2[w];
        }
        for (char letter:mergedArr){
            System.out.println(letter);
        }
    }


}

