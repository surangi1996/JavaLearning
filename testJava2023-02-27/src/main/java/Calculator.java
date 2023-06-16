import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean esc = false;
        float result;

        while (!esc){

            System.out.println("Enter Your first number: ");
            float n1 = sc.nextFloat();
            System.out.println("Enter your second number: ");
            float n2 = sc.nextFloat();
            System.out.println("Enter your operation or type esc to exit the cal: ");
            String operator = sc.next();

            if (operator.equals("+") || operator.equals("*") || operator.equals("/") || operator.equals("-") ){
                switch (operator){
                    case "+":
                        result = n1 + n2;
                        break;

                    case "-":
                        result = n1 - n2;
                        break;

                    case "*":
                        result = n1 * n2;
                        break;

                    case "/":
                        result = n1 / n2;
                        break;

                    default:
                        System.out.println("Error");

                        return;
                }
                System.out.println("result: "+ result);
            }else if(operator.equals("esc")){
                esc = true;
            }else {
                System.out.println("Invalid");
            }

            sc.nextLine();



        }
        sc.close();
        System.out.println("exited");


    }
}
