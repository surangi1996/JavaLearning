package learning;

public class CheckerBoardPattern {
    public static void checkerBordPattern(int n) {
        for(int i=1; i <=n; i++){
            System.out.println();
            for(int j=1; j<=n; j++) {
                String X = ((i+j)%2 == 0) ? "X " : "  ";
                System.out.print(X);
            }
        }
    }
    public static void diamondPattern(int x) {
        for(int i=1; i <=x; i++){
            System.out.println();
            for(int j=x-i; j>=0; j--) {
                System.out.print(" ");
            }
            for(int j=0; j<(2*i)-1; j++) {
                System.out.print("X");
            }

        }
        for(int i=2; i <=x; i++){
            System.out.println();
            for(int j=0; j<i; j++) {
                System.out.print(" ");
            }
            for(int j=(2*x)-(2*i); j>=0; j--) {
                System.out.print("X");
            }
        }
    }
    public static void main(String[] args) {
        diamondPattern(8);
    }
}
