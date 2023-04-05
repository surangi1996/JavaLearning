import java.util.LinkedList;

public class FindPrimeNumbers {
    public static boolean isPrime(int n){
        if (n == 0 || n == 1){
            return false;
        }
        for (int i = 2; i < n; i++){
            if (n%i == 0){
                return false;

            }

        }
        return true;
    }
    public static void main(String args[]){
        int n = 13195;
//        int[] arr = new int[n];
        LinkedList<Integer> list = new LinkedList<>();
        int index = 0;
        for (int i = 0; i < n ; i++){

            if (isPrime(i) && n%i == 0){
                index++;
                list.add(i);
            }

//            for (int j = 0; j < n; j++){
//                if (isPrime(i)){
//                arr[j] = i;
//            }}
        }
//        for (int y =0; y< list.length; y++) {
//            System.out.println(arr[y]);
//        }
        System.out.println(list);
        System.out.println(list.getLast());

    }

}
