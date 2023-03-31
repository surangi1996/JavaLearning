import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        int a;
        for (int i = 0; i<arr.length/2 ; i++){
            a = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = a;

        }
        System.out.println(Arrays.toString(arr));
    }
}
