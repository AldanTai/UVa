import java.util.Scanner;

public class UVa11150 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			int N = sc.nextInt();
			int ans = (N * 3) / 2;
			System.out.println(ans);
		}
		sc.close();
	}
}
