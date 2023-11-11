import java.util.Scanner;

public class UVa11150 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			int N = sc.nextInt();
			int ans = 0;
			if (N <= 1) {
				System.out.println(N);
			} else {
				ans = N;
				while (N != 1) {

					if (N == 2)
						N = N + 1;
					ans = ans + N / 3;

					N = N % 3 + N / 3;
				}
				System.out.println(ans);
			}
		}
	}
}
