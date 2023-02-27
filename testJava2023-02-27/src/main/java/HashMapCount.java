import java.util.Scanner;
import java.util.HashMap;

public class HashMapCount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your text here: ");
        String str = sc.nextLine();

        String[] strArr = str.split(" ");

        HashMap<String, Integer> wordCount = new HashMap<>();
        for (int i = 0; i < strArr.length ; i++ ) {
            if (wordCount.containsKey(strArr[i])){
                int count = wordCount.get(strArr[i]);
                wordCount.put(strArr[i], count + 1);
            }else {
                wordCount.put(strArr[i] , 1);
            }
        }

        for (String key : wordCount.keySet()) {
            int val = wordCount.get(key);
            System.out.println("-----------------");
            System.out.println("key : "+ key + " value : "+val);
        }
    }
}
