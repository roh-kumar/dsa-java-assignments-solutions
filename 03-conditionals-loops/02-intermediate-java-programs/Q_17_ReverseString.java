public class Q_17_ReverseString {
    public static void main(String[] args) {
        String name = "Rohit";
        char[] ch = name.toCharArray();
        String rev = "";
        for (int i = ch.length - 1; i >= 0 ; i--) {
            rev+=ch[i];
        }
        System.out.println(rev);
    }
}
