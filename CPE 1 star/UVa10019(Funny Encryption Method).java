import java.util.Scanner;

public class UVa10019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int quantity = sc.nextInt();
		while (sc.hasNext()) {

			int N = sc.nextInt();
			String X1 = Integer.toBinaryString(N);
			long b1 = X1.chars().filter(ch -> ch == '1').count();
			String A = Integer.valueOf(Integer.toString(N), 16).toString();
			String X2 = Integer.toBinaryString(Integer.parseInt(A));
			long b2 = X2.chars().filter(ch -> ch == '1').count();
			System.out.println(b1 + " " + b2);
		}

	}

}
