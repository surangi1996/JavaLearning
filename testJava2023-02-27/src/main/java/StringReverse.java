import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter your text here : ");
        String input = sc.nextLine();

        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--){
            reversed = reversed + input.charAt(i);
        }

        System.out.println("Reversed string is: " + reversed);

    }
}
