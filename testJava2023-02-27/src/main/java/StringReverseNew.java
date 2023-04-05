public class StringReverseNew {
    public static void main(String args[]){
        String st = "surangi";

        char[] stArr = st.toCharArray();

        StringBuilder stBdlr = new StringBuilder();

        for (int i= stArr.length - 1; i>=0; i--){
            stBdlr.append(stArr[i]);
        }

        String out = stBdlr.toString();
        System.out.println(out);
    }
}
