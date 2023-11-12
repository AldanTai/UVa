import java.util.Scanner;

public class UVa11417 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num;
		while ((num = sc.nextInt()) != 0) {
			int ans = 0;
			for (int i = 1; i < num; i++) {
				for (int j = i + 1; j <= num; j++) {
					ans += GCD(i, j);
				}
			}
			System.out.println(ans);
		}
	}

	public static int GCD(int a, int b) {
		while (a != 0 && b % a != 0) {
			int temp = b;
			b = a;
			a = temp % a;
		}
		return a;
	}
}
