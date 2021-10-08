import java.util.Scanner;

public class Q_04_DiscountOfProduct {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter product's price: ");
        int price = in.nextInt();
        System.out.print("Enter discount percentage: ");
        int discount = in.nextInt();
        System.out.println("The discounted price = " + ((price * (100-discount))/100));
    }
}
