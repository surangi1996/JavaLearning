public class Fibonacci {
    public static void main(String args[]){

//        int[] arr = new int[10];
//        arr[0] = 0;
//        arr[1] = 1;
//        for (int i = 2; i < 10 ; i++){
//            arr[i] = arr[i-1] + arr[i-2];
//        }
//
//        for (int j = 0; j < arr.length; j++){
//            System.out.println(arr[j]);
//        }

        int a = 0;
        int b = 1 ;

        int c;
        int num = 0;
        //System.out.println(a);
        for (;;){
            c = a + b;
            a = b;
            b = c;

            if (a >= 4000000){
                break;
            }
            if (a%2 == 0) {
                num += a;
            }

        }
        System.out.println(num);
//        do{
//
//            c = a + b;
//            a = b;
//            b = c;
//
//            if (b%2 == 0) {
//                num += b;
//            }
//
//        }
//        while (b < 4000000);
       // System.out.println(num);

    }
}
