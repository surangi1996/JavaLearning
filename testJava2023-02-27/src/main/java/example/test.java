package example;


import java.util.ArrayList;
import java.util.Collections;

public class test {
    public static ArrayList<Integer> numbers(){
        int arr[]= {1,5,8,3,2,7,10};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            list.add(arr[i]);
        }
        return list;
//            System.out.println("number");
    }
    public static void main(String[] args) {
        System.out.println("hello");
        ArrayList<Integer> list = test.numbers();
        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }
}
