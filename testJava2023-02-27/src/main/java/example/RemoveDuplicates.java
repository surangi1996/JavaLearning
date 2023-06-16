package example;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static LinkedHashSet<Integer> IntegerDuplicates(){
        int arr[] = {1,5,3,9,6,5,1,7,8};
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for (int i =0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        return set;
    }

    public static LinkedHashSet<String> StringDuplicates(){
        String str = "Hi hi my name is is surangi";
        String st = str.toLowerCase();
                LinkedHashSet<String> stringSet = new LinkedHashSet<>();
        String[] starr = st.split("\\s+");
        for (int i=0; i < starr.length; i++){
            stringSet.add(starr[i]);
        }
        return stringSet;
    }

    public static void main(String[] args) {
        LinkedHashSet<Integer> set = RemoveDuplicates.IntegerDuplicates();
        for(int x : set){
            System.out.println(x);
        }

        LinkedHashSet<String> stringSet = RemoveDuplicates.StringDuplicates();

        for(String y : stringSet){
            System.out.println(y);
        }
        String result = String.join(" ", stringSet);
        System.out.println(result);
    }
}
