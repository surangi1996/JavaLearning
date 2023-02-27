import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Test {
    public static int find(int arr[], int x){
        for (int i = 0; i <= arr.length; i++){
            if (arr[i] == x){
                return i;
            }
            //
            /*

            */
        }
        return -1;
    }

    public static int sum(int arr[], int x) throws Exception {
        FileReader fr=new FileReader("D:\\testout.txt");
        BufferedReader br=new BufferedReader(fr);
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {10,12,5,3,14,20};

        for (int x :
                arr) {
            System.out.println(x);
        }

        System.out.println(find(arr, 21));

    }
}

