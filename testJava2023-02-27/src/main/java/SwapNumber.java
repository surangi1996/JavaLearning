import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number here: ");
        int first = sc.nextInt();
        System.out.println("Enter your second number here: ");
        int second = sc.nextInt();

        /**
         * swap numbers with third variable
         */
//        int temp = first;
//        first = second;
//        second = temp;
//
//        System.out.println("After swapping: ");
//        System.out.println("First number = " + first);
//        System.out.println("Second number = " + second);

        /**
         * swap numbers without third variable
         */

        first = first + second;
        second = first - second;
        first = first - second;
//        first = first ^ second;
//        second = first ^ second;
//        first = first ^ second;
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
    }
}
