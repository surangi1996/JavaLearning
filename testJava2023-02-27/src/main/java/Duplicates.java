import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Duplicates {
    public static void main(String args[]){
        String str = "Hi HI oi oi my name is is surangi";

        String[] strArr = str.split("\\s+");

        /**
         * Set doesnt keep insertion order
         * but LinkedHashSet keeps the insertion order
         */
        Set<String> words = new LinkedHashSet<>();

        for (String word: strArr) {
            words.add(word);
        }

        String[] newArr = words.toArray(new String[0]);

        String finalStr = String.join(" ", newArr);

        System.out.println(finalStr);

    }
}
