import java.util.Scanner;

public class UVa10190 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            int m = scanner.nextInt();

            if (isValidSequence(a, m)) {
                printSequence(a, m);
            } else {
                System.out.println("Boring!");
            }
        }

        scanner.close();
    }

    private static boolean isValidSequence(int a, int m) {
        if (a < 1 || m < 2 || a % m != 0) {
            return false;
        }

        while (a > 1) {
            if (a % m != 0 || a / m == 0) {
                return false;
            }
            a /= m;
        }

        return true;
    }

    private static void printSequence(int a, int m) {
        while (a > 1) {
            System.out.print(a + " ");
            a /= m;
        }
        System.out.println(1);
    }
}
