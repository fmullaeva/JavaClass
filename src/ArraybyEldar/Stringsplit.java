package ArraybyEldar;

import java.util.Arrays;

public class Stringsplit {
    public static void main(String[] args) {
        String str10 = "Java+is+easy+Java+is+easy";
        String[] words = str10.split("\\+");//regular expression
        // \, |, ^, *, +
        System.out.println(Arrays.toString(words));
        String[] words2=str10.split("\\+",3);//[Java, is, easy+Java+is+easy]
        System.out.println(Arrays.toString(words2));
        String word = "/Library/Java/JavaVirtualMachines/jdk-11.0.13.jdk/Contents/Home/bin/java";
        word=word.replace("/","|");
        String[] wordPipe=word.split("\\|");
        System.out.println(Arrays.toString(wordPipe));
        String path = "/Users/techtorialacademy/IdeaProjects/JavaClasses/src/arrays/ArrayInterviews.java";
        System.out.println(Arrays.toString(path.split("/")));
        System.out.println(Arrays.toString(str10.split("i")));
        System.out.println(Arrays.toString(word.split("[|.-]")));
    }
}


