public class VowelCheck {
    public static void main(String args[]){
        String str = "my name is surangi";
        boolean a = str.toLowerCase().matches(".*[aeiou].*");
        System.out.println(a);
    }
}
