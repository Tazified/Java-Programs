import java.util.Scanner;

public class taz {

    static void print(String line) {
        System.out.println(line);
    }

    public static void main (String[] args) {
        int price;
        int discount;

        Scanner obj = new Scanner(System.in);

        print("Enter price of the product :");
        price = obj.nextInt();

        print("Enter Discount of the product :");
        discount = obj.nextInt();

        int finalPrice = (price * discount) / 100;

        print("Final price is " + finalPrice);
    }
}