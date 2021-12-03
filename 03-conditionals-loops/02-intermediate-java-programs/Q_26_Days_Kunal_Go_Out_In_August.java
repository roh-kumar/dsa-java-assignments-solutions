public class Q_26_Days_Kunal_Go_Out_In_August {
    public static void main(String[] args) {
        daysKunalGoesOut();
    }
    static void daysKunalGoesOut() {
        int c = 0;
        for (int i = 1; i <= 31; i++) {
            if (i % 2 == 0) {
                c++;
            }
        }
        System.out.println(c);
    }
}
