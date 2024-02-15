import java.util.Scanner;

public class StringsEquality {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a: ");
        String a = in.nextLine();
        System.out.print("Enter b: ");
        String b = in.nextLine();

        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
            }
        }
    }
