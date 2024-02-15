import java.util.Scanner;

public class NumberOperations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = in.nextInt();
        System.out.print("Enter b: ");
        int b = in.nextInt();

        if (a < b) {
            System.out.println("a меньше b");
        } else if (a > b) {
            System.out.println("a больше b");
        } else {
            System.out.println("a равно b");
        }
        int sum = a + b;
        System.out.println(sum);
        int diff = a - b;
        System.out.println(diff);
        int product = a * b;
        System.out.println(product);
        int div = a / b;
        System.out.println(div);
    }
}
