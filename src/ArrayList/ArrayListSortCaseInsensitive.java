package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListSortCaseInsensitive {
    public static void main(String[] args) {
        List<String> words= Arrays.asList(new String[]{"ksddk","ZASFFR","hdjks","jskdj","z","A","z"});
        Collections.sort(words);
        Collections.sort(words,String.CASE_INSENSITIVE_ORDER);
        System.out.println(words);
        List<String> emploeeNames= Arrays.asList(new String[]{"Zolo","Bob","Alex","Nancy"});
        Collections.sort(emploeeNames);
        Collections.sort(emploeeNames,String.CASE_INSENSITIVE_ORDER);
        System.out.println(emploeeNames);
        Collections.sort(emploeeNames,Collections.reverseOrder());
        System.out.println(emploeeNames);

    }
}
